package irita.sdk.model.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TxsResult {
    private List<Result> txs;
    @JsonProperty(value = "total_count")
    private int totalCount;

    public List<Result> getTxs() {
        return txs;
    }

    public void setTxs(List<Result> txs) {
        this.txs = txs;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
