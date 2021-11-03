/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;
import irita.sdk.model.tx.TxResult;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 9:42:4
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class BlockResult {

    private int height;
    private List<TxResult> txsResults;
    @JSONField(name = "begin_block_events")
    private String beginBlockEvents;
    @JSONField(name = "end_block_events")
    private String endBlockEvents;
    @JSONField(name = "validator_updates")
    private String validatorUpdates;
    @JSONField(name = "consensus_param_updates")
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