package irita.sdk.model.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    private String hash;
    private String height;
    private int index;
    @JsonProperty(value = "tx_result")
    private TxResult txResult;
    private String tx;
    private Proof proof;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setTxResult(TxResult txResult) {
        this.txResult = txResult;
    }

    public TxResult getTxResult() {
        return txResult;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getTx() {
        return tx;
    }

    public void setProof(Proof proof) {
        this.proof = proof;
    }

    public Proof getProof() {
        return proof;
    }

}