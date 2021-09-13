package irita.sdk.module.nft;

public class IssueDenomRequest {
    private String id;
    private String name;
    private String schema;

    public String getId() {
        return id;
    }

    public IssueDenomRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public IssueDenomRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSchema() {
        return schema;
    }

    public IssueDenomRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
}
