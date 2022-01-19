package irita.sdk.module.nft;

public class QueryDenomResp {
    private String id;
    private String name;
    private String schema;
    private String symbol;
    private boolean mintRestricted;
    private boolean updateRestricted;
    private String creator;

    public QueryDenomResp() {
    }

    public QueryDenomResp(String id, String name, String schema, String creator) {
        this.id = id;
        this.name = name;
        this.schema = schema;
        this.creator = creator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean isMintRestricted() {
        return mintRestricted;
    }

    public void setMintRestricted(boolean mintRestricted) {
        this.mintRestricted = mintRestricted;
    }

    public boolean isUpdateRestricted() {
        return updateRestricted;
    }

    public void setUpdateRestricted(boolean updateRestricted) {
        this.updateRestricted = updateRestricted;
    }
}
