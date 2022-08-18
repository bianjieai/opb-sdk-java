package irita.sdk.module.nft;

public class QueryNFTResp {
    private String id;
    private String name;
    private String uri;
    private String uriHash;
    private String data;
    private String owner;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
