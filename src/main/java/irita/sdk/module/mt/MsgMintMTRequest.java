package irita.sdk.module.mt;

public class MsgMintMTRequest {

    private String denomId = "";
    private long amount = 0;
    private byte[] data;
    private String recipient = "";


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

    public byte[] getData() {
        if (data == null){
            return new byte[0];
        }
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
