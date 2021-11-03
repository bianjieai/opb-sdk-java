package irita.sdk.model;

import irita.sdk.model.tx.Tx;
import irita.sdk.model.tx.TxResult;

public class ResultQueryTx {
    private String hash;
    private String height;
    private Tx tx;
    private TxResult result;
    private String timeStamp;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Tx getTx() {
        return tx;
    }

    public void setTx(Tx tx) {
        this.tx = tx;
    }

    public TxResult getResult() {
        return result;
    }

    public void setResult(TxResult result) {
        this.result = result;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
