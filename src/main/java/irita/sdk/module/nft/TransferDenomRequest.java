package irita.sdk.module.nft;

public class TransferDenomRequest {
    private String id = "";
    private String recipient = "";

    public String getId() {
        return id;
    }

    public TransferDenomRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public TransferDenomRequest setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
}
