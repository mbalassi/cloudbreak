package com.sequenceiq.cloudbreak.api.service;

import java.util.Objects;

public class ExposedService {

    private String name;

    private String displayName;

    private String serviceName;

    private String knoxService;

    private String knoxUrl;

    private boolean ssoSupported;

    private Integer port;

    private Integer tlsPort;

    private boolean apiOnly;

    private boolean apiIncluded;

    private boolean visible;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getKnoxService() {
        return knoxService;
    }

    public void setKnoxService(String knoxService) {
        this.knoxService = knoxService;
    }

    public String getKnoxUrl() {
        return knoxUrl;
    }

    public void setKnoxUrl(String knoxUrl) {
        this.knoxUrl = knoxUrl;
    }

    public boolean isSsoSupported() {
        return ssoSupported;
    }

    public void setSsoSupported(boolean ssoSupported) {
        this.ssoSupported = ssoSupported;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTlsPort() {
        return tlsPort;
    }

    public void setTlsPort(Integer tlsPort) {
        this.tlsPort = tlsPort;
    }

    public boolean isApiOnly() {
        return apiOnly;
    }

    public void setApiOnly(boolean apiOnly) {
        this.apiOnly = apiOnly;
    }

    public boolean isApiIncluded() {
        return apiIncluded;
    }

    public void setApiIncluded(boolean apiIncluded) {
        this.apiIncluded = apiIncluded;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    //CHECKSTYLE:OFF: CyclomaticComplexity
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }
        ExposedService that = (ExposedService) o;
        return ssoSupported == that.ssoSupported &&
                apiOnly == that.apiOnly &&
                apiIncluded == that.apiIncluded &&
                visible == that.visible &&
                Objects.equals(name, that.name) &&
                Objects.equals(displayName, that.displayName) &&
                Objects.equals(serviceName, that.serviceName) &&
                Objects.equals(knoxService, that.knoxService) &&
                Objects.equals(knoxUrl, that.knoxUrl) &&
                Objects.equals(port, that.port) &&
                Objects.equals(tlsPort, that.tlsPort);
    }
    //CHECKSTYLE:ON

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, serviceName, knoxService, knoxUrl, ssoSupported, port, tlsPort, apiOnly, apiIncluded, visible);
    }

    @Override
    public String toString() {
        return "ExposedService{" +
                "name='" + name + '\'' +
                ", displayName='" + displayName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", knoxService='" + knoxService + '\'' +
                ", knoxUrl='" + knoxUrl + '\'' +
                ", ssoSupported=" + ssoSupported +
                ", port=" + port +
                ", tlsPort=" + tlsPort +
                ", apiOnly=" + apiOnly +
                ", apiIncluded=" + apiIncluded +
                ", visible=" + visible +
                '}';
    }
}
