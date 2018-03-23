package com.sequenceiq.cloudbreak.converter.mapper;

import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import com.sequenceiq.cloudbreak.api.model.AmbariDatabaseDetailsJson;
import com.sequenceiq.cloudbreak.api.model.DatabaseVendor;
import com.sequenceiq.cloudbreak.api.model.rds.RdsType;
import com.sequenceiq.cloudbreak.cloud.model.AmbariDatabase;
import com.sequenceiq.cloudbreak.domain.RDSConfig;
import com.sequenceiq.cloudbreak.domain.Stack;

@Mapper(componentModel = "spring")
public interface AmbariDatabaseMapper {

    @Mappings({
            @Mapping(source = "ambariDatabaseDetailsJson.vendor", target = "databaseEngine"),
            @Mapping(source = "stack", target = "name", qualifiedByName = "name"),
            @Mapping(source = "ambariDatabaseDetailsJson.userName", target = "connectionUserName"),
            @Mapping(source = "ambariDatabaseDetailsJson.password", target = "connectionPassword"),
            @Mapping(source = "ambariDatabaseDetailsJson", target = "connectionURL", qualifiedByName = "connectionUrl"),
            @Mapping(target = "connectionDriver", constant = "org.postgresql.Driver"),
            @Mapping(target = "creationDate", expression = "java(new java.util.Date().getTime())"),
            @Mapping(target = "clusters", ignore = true),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "stackVersion", ignore = true),
            @Mapping(target = "status", constant = "USER_MANAGED"),
            @Mapping(target = "type", expression = "java(com.sequenceiq.cloudbreak.api.model.rds.RdsType.AMBARI.name())")
    })
    RDSConfig mapAmbariDatabaseDetailsJsonToRdsConfig(AmbariDatabaseDetailsJson ambariDatabaseDetailsJson, Stack stack);

    @Named("connectionUrl")
    default String mapConnectionUrl(AmbariDatabaseDetailsJson ambariDatabaseDetailsJson) {
        return "jdbc:postgresql://" + ambariDatabaseDetailsJson.getHost() + ":"
                + ambariDatabaseDetailsJson.getPort() + "/" + ambariDatabaseDetailsJson.getName();
    }

    @Named("name")
    default String mapName(Stack stack) {
        return RdsType.AMBARI.name() + stack.getId();
    }

    @Named("databaseEngine")
    default String mapDatabaseEngine(DatabaseVendor vendor) {
        return vendor.value();
    }

    @Mapping(source = "ambariDatabase.vendor", target = "vendor", qualifiedByName = "vendor")
    AmbariDatabaseDetailsJson mapAmbariDatabaseToAmbariDatabaseDetailJson(AmbariDatabase ambariDatabase);

    @Named("vendor")
    default DatabaseVendor mapVendorByValue(String vendor) {
        if (StringUtils.isNotBlank(vendor)) {
            return DatabaseVendor.fromValue(vendor);
        }
        return null;
    }
}
