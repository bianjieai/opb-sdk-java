package irita.sdk.module.nft;

public class BurnNFTRequest {
    private String denom = "";
    private String id = "";

    public String getDenom() {
        return denom;
    }

    public BurnNFTRequest setDenom(String denom) {
        this.denom = denom;
        return this;
    }

    public String getId() {
        return id;
    }

    public BurnNFTRequest setId(String id) {
        this.id = id;
        return this;
    }
}
