package irita.sdk.module.nft;

public class TransferNFTRequest {
    private String denom = "";
    private String id = "";
    private String uri = "";
    private String uriHash = "";
    private String data = "";
    private String name = "";
    private String recipient = "";

    public String getDenom() {
        return denom;
    }

    public TransferNFTRequest setDenom(String denom) {
        this.denom = denom;
        return this;
    }

    public String getId() {
        return id;
    }

    public TransferNFTRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public TransferNFTRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getUriHash() {
        return uriHash;
    }

    public TransferNFTRequest setUriHash(String uriHash) {
        this.uriHash = uriHash;
        return this;
    }

    public String getData() {
        return data;
    }

    public TransferNFTRequest setData(String data) {
        this.data = data;
        return this;
    }

    public String getName() {
        return name;
    }

    public TransferNFTRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public TransferNFTRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
}
