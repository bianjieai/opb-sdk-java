package irita.sdk.model.block;

import java.util.List;

public class Data {

    private List<Object> txs;

    public void setTxs(List txs) {
        this.txs = txs;
    }

    public List<Object> getTxs() {
        return txs;
    }

}