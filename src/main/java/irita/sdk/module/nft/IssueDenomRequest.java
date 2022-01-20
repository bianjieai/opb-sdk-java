package irita.sdk.module.nft;

public class IssueDenomRequest {
    private String id = "";
    private String name = "";
    private String schema = "";
    private String symbol = "";
    private boolean mintRestricted;
    private boolean updateRestricted;

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

    public String getSymbol() {
        return symbol;
    }

    public IssueDenomRequest setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public boolean isMintRestricted() {
        return mintRestricted;
    }

    public IssueDenomRequest setMintRestricted(boolean mintRestricted) {
        this.mintRestricted = mintRestricted;
        return this;
    }

    public boolean isUpdateRestricted() {
        return updateRestricted;
    }

    public IssueDenomRequest setUpdateRestricted(boolean updateRestricted) {
        this.updateRestricted = updateRestricted;
        return this;
    }
}
