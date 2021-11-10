package irita.sdk.module.record;

public class CreateRecordResult {
    private String recordID;
    private String txHash;

    public CreateRecordResult(String recordID, String txHash) {
        this.recordID = recordID;
        this.txHash = txHash;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }
}
