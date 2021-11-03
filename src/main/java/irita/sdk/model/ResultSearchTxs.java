package irita.sdk.model;

import java.util.List;

public class ResultSearchTxs {
    private int total;
    private List<ResultQueryTx> txs;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ResultQueryTx> getTxs() {
        return txs;
    }

    public void setTxs(List<ResultQueryTx> txs) {
        this.txs = txs;
    }
}
