/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.tx;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-01 13:58:12
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Result {

    private String hash;
    private String height;
    private int index;
    @JSONField(name = "tx_result")
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