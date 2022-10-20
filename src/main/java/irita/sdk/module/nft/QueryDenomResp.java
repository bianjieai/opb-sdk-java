package irita.sdk.module.nft;

public class QueryDenomResp {
    private String id;
    private String name;
    private String schema;
    private String symbol;
    private boolean mintRestricted;
    private boolean updateRestricted;
    private String uri;
    private String uriHash;
    private String data;
    private String creator;

    public QueryDenomResp() {
    }

    public QueryDenomResp(String id, String name, String schema, String symbol, boolean mintRestricted, boolean updateRestricted, String uri, String uriHash, String data, String creator) {
        this.id = id;
        this.name = name;
        this.schema = schema;
        this.symbol = symbol;
        this.mintRestricted = mintRestricted;
        this.updateRestricted = updateRestricted;
        this.uri = uri;
        this.uriHash = uriHash;
        this.data = data;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUriHash() {
        return uriHash;
    }

    public void setUriHash(String uriHash) {
        this.uriHash = uriHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
