package com.sequenceiq.cloudbreak.api.endpoint.v4.stacks.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sequenceiq.cloudbreak.api.endpoint.v4.stacks.base.CertificateRotationType;
import com.sequenceiq.cloudbreak.doc.ModelDescriptions.ClusterModelDescription;
import com.sequenceiq.common.model.JsonEntity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class CertificatesRotationV4Request implements JsonEntity {
    @ApiModelProperty(value = ClusterModelDescription.CERTIFICATE_ROTATION_TYPE, allowableValues = "HOST_CERTS,CMCA_AND_HOST_CERTS")
    private CertificateRotationType certificateRotationType;

    public CertificateRotationType getRotateCertificatesType() {
        return certificateRotationType;
    }

    public void setRotateCertificatesType(CertificateRotationType certificatesRotationType) {
        this.certificateRotationType = certificateRotationType;
    }
}
