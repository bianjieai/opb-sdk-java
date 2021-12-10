package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;
import irita.sdk.model.tx.TxResult;

import java.util.List;

public class BlockResult {
    private int height;
    @JsonProperty(value = "txs_results")
    private List<TxResult> txsResults;
    @JsonProperty(value = "begin_block_events")
    private String beginBlockEvents;
    @JsonProperty(value = "end_block_events")
    private String endBlockEvents;
    @JsonProperty(value = "validator_updates")
    private String validatorUpdates;
    @JsonProperty(value = "consensus_param_updates")
    private ConsensusParamUpdates consensusParamUpdates;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public List<TxResult> getTxsResults() {
        return txsResults;
    }

    public void setTxsResults(List<TxResult> txsResults) {
        this.txsResults = txsResults;
    }

    public String getBeginBlockEvents() {
        return beginBlockEvents;
    }

    public void setBeginBlockEvents(String beginBlockEvents) {
        this.beginBlockEvents = beginBlockEvents;
    }

    public String getEndBlockEvents() {
        return endBlockEvents;
    }

    public void setEndBlockEvents(String endBlockEvents) {
        this.endBlockEvents = endBlockEvents;
    }

    public String getValidatorUpdates() {
        return validatorUpdates;
    }

    public void setValidatorUpdates(String validatorUpdates) {
        this.validatorUpdates = validatorUpdates;
    }

    public ConsensusParamUpdates getConsensusParamUpdates() {
        return consensusParamUpdates;
    }

    public void setConsensusParamUpdates(ConsensusParamUpdates consensusParamUpdates) {
        this.consensusParamUpdates = consensusParamUpdates;
    }
}