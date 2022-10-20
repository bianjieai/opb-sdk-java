package irita.sdk.module.mt;

public class MsgAddIssueMTRequest {

    private String id = "";
    private String denomId = "";
    private long amount = 0;
    private String recipient = "";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDenomId() {
        return denomId;
    }

    public void setDenomId(String denomId) {
        this.denomId = denomId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
