package irita.sdk.model.ws.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    @JsonProperty("TxResult")
    private TxResult txResult;

    public TxResult getTxResult() {
        return txResult;
    }

    public Value setTxResult(TxResult txResult) {
        this.txResult = txResult;
        return this;
    }
}