package com.sequenceiq.cloudbreak.structuredevent.rest;

import static com.sequenceiq.cloudbreak.structuredevent.rest.urlparser.CDPRestUrlParser.ID_TYPE;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.sequenceiq.cloudbreak.common.anonymizer.AnonymizerUtil;
import com.sequenceiq.cloudbreak.common.json.Json;
import com.sequenceiq.cloudbreak.common.json.JsonUtil;
import com.sequenceiq.cloudbreak.structuredevent.event.rest.RestCallDetails;
import com.sequenceiq.cloudbreak.structuredevent.event.rest.RestRequestDetails;

@Component
public class CDPRestCommonService {

    public static final List<String> NAME_PATHS = List.of("name");

    public static final List<String> NAMES_PATHS = List.of("names");

    public static final List<String> RESOURCE_CRN_PATHS = List.of("crn", "resourceCrn");

    public static final List<String> CRNS_PATHS = List.of("crns");

    public Map<String, String> addClusterCrnAndNameIfPresent(RestCallDetails restCallDetails, Map<String, String> restParams, String nameField,
            String crnField) {
        Map<String, String> params = new HashMap<>();
        RestRequestDetails restRequest = restCallDetails.getRestRequest();
        Json requestJson = getJson(restRequest.getBody());
        Json responseJson = getJson(restCallDetails.getRestResponse().getBody());
        String resourceCrn = getCrn(requestJson, responseJson, restRequest, restParams, crnField);
        String name = getName(requestJson, responseJson, restRequest, restParams, nameField);

        checkNameOrCrnProvided(restRequest, resourceCrn, name);

        if (StringUtils.isNotEmpty(name)) {
            params.put(nameField, name);
        }

        if (StringUtils.isNotEmpty(resourceCrn)) {
            params.put(crnField, resourceCrn);
        }
        return params;
    }

    private String getName(Json requestJson, Json responseJson, RestRequestDetails request, Map<String, String> restParams, String nameField) {
        if (StringUtils.isEmpty(restParams.get(nameField))) {
            return getResourceId(requestJson, responseJson, NAME_PATHS, NAMES_PATHS, restParams, "name");
        }
        return restParams.get(nameField);
    }

    private String getCrn(Json requestJson, Json responseJson, RestRequestDetails request, Map<String, String> restParams, String crnField) {
        if (StringUtils.isEmpty(restParams.get(crnField))) {
            return getResourceId(requestJson, responseJson, RESOURCE_CRN_PATHS, CRNS_PATHS, restParams, "crn");
        }
        return restParams.get(crnField);
    }

    private String getResourceId(Json requestJson, Json responseJson, List<String> paths, List<String> pluralPaths, Map<String, String> restParams,
            String idType) {
        String id = null;
        if (requestJson != null) {
            id = getValueFromJson(requestJson, paths, restParams, idType);
            if (StringUtils.isEmpty(id)) {
                id = getValueFromJson(requestJson, pluralPaths, restParams, idType);
            }
        }
        if (responseJson != null && StringUtils.isEmpty(id)) {
            id = Optional.ofNullable(getValueFromJson(responseJson, paths, restParams, idType))
                    .orElse(getValueFromJson(responseJson, pluralPaths, restParams, idType));
        }
        return id;
    }

    private String getValueFromJson(Json json, List<String> paths, Map<String, String> restParams, String idType) {
        String values = null;
        if (json.isArray() && idType.equals(restParams.get(ID_TYPE))) {
            List<String> asList = json.asArray();
            values = String.join(",", asList);
        } else if (json.isObject() && json.getMap().containsKey("responses")) {
            values = ((Collection<Object>) json.getMap().get("responses"))
                    .stream()
                    .map(obj -> (String) new Json(obj).getMap().get(idType))
                    .collect(Collectors.joining(","));
        } else if (json.isObject()) {
            values = getFirstPath(json, paths);
        }
        return values;
    }

    private String getFirstPath(Json json, List<String> paths) {
        String path = paths.stream().filter(p -> json.getValue(p) != null).findFirst().orElse(null);
        String value = null;
        if (path != null) {
            Object v = json.getValue(path);
            if (v instanceof Collection) {
                value = ((Collection<Object>) v).stream().map(Object::toString).collect(Collectors.joining(","));
            } else {
                value = v.toString();
            }
        }
        return value;
    }

    private Json getJson(String body) {
        if (body != null && StringUtils.isNotEmpty(body.trim())) {
            if (!JsonUtil.isValid(body)) {
                throw new IllegalArgumentException("Invalid json: " + AnonymizerUtil.anonymize(body));
            }
            return new Json(body);
        }
        return null;
    }

    private void checkNameOrCrnProvided(RestRequestDetails restRequest, String resourceCrn, String name) {
        if (StringUtils.isEmpty(name) && StringUtils.isEmpty(resourceCrn)) {
            throw new UnsupportedOperationException(String.format("Cannot determine the resource crn or name, so we does not support for auditing for method: "
                    + "%s, uri: %s, body: %s", restRequest.getMethod(), restRequest.getRequestUri(), restRequest.getBody()));
        }
    }
}
