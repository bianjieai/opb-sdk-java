package irita.sdk.module.service;

import java.util.List;

// DefineServiceRequest defines the request parameters of the service definition
public class DefineServiceRequest {
    private String serviceName;
    private String description;
    private List<String> tags;
    private String authorDescription;
    private String schemas;

    public String getServiceName() {
        return serviceName;
    }

    public DefineServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DefineServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public DefineServiceRequest setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public DefineServiceRequest setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
        return this;
    }

    public String getSchemas() {
        return schemas;
    }

    public DefineServiceRequest setSchemas(String schemas) {
        this.schemas = schemas;
        return this;
    }
}
