package irita.sdk.module.nft;

public class MintNFTRequest {
    private String denom = "";
    private String id = "";
    private String name = "";
    private String uri = "";
    private String data = "";
    private String recipient = "";

    public String getDenom() {
        return denom;
    }

    public MintNFTRequest setDenom(String denom) {
        this.denom = denom;
        return this;
    }

    public String getId() {
        return id;
    }

    public MintNFTRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MintNFTRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public MintNFTRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getData() {
        return data;
    }

    public MintNFTRequest setData(String data) {
        this.data = data;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public MintNFTRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
}
