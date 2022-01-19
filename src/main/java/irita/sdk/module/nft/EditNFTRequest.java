package irita.sdk.module.nft;

public class EditNFTRequest {
    private String denom = "";
    private String id = "";
    private String name = "";
    private String uri = "";
    private String data = "";

    public String getDenom() {
        return denom;
    }

    public EditNFTRequest setDenom(String denom) {
        this.denom = denom;
        return this;
    }

    public String getId() {
        return id;
    }

    public EditNFTRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EditNFTRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public EditNFTRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getData() {
        return data;
    }

    public EditNFTRequest setData(String data) {
        this.data = data;
        return this;
    }
}
