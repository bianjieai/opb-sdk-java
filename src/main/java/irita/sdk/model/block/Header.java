/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-01 10:51:5
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Header {

    private Version version;
    @JSONField(name = "chain_id")
    private String chainId;
    private String height;
    private String time;
    @JSONField(name = "last_block_id")
    private LastBlockId lastBlockId;
    @JSONField(name = "last_commit_hash")
    private String lastCommitHash;
    @JSONField(name = "data_hash")
    private String dataHash;
    @JSONField(name = "validators_hash")
    private String validatorsHash;
    @JSONField(name = "next_validators_hash")
    private String nextValidatorsHash;
    @JSONField(name = "consensus_hash")
    private String consensusHash;
    @JSONField(name = "app_hash")
    private String appHash;
    @JSONField(name = "last_results_hash")
    private String lastResultsHash;
    @JSONField(name = "evidence_hash")
    private String evidenceHash;
    @JSONField(name = "proposer_address")
    private String proposerAddress;

    public void setVersion(Version version) {
        this.version = version;
    }

    public Version getVersion() {
        return version;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getChainId() {
        return chainId;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setLastBlockId(LastBlockId lastBlockId) {
        this.lastBlockId = lastBlockId;
    }

    public LastBlockId getLastBlockId() {
        return lastBlockId;
    }

    public void setLastCommitHash(String lastCommitHash) {
        this.lastCommitHash = lastCommitHash;
    }

    public String getLastCommitHash() {
        return lastCommitHash;
    }

    public void setDataHash(String dataHash) {
        this.dataHash = dataHash;
    }

    public String getDataHash() {
        return dataHash;
    }

    public void setValidatorsHash(String validatorsHash) {
        this.validatorsHash = validatorsHash;
    }

    public String getValidatorsHash() {
        return validatorsHash;
    }

    public void setNextValidatorsHash(String nextValidatorsHash) {
        this.nextValidatorsHash = nextValidatorsHash;
    }

    public String getNextValidatorsHash() {
        return nextValidatorsHash;
    }

    public void setConsensusHash(String consensusHash) {
        this.consensusHash = consensusHash;
    }

    public String getConsensusHash() {
        return consensusHash;
    }

    public void setAppHash(String appHash) {
        this.appHash = appHash;
    }

    public String getAppHash() {
        return appHash;
    }

    public void setLastResultsHash(String lastResultsHash) {
        this.lastResultsHash = lastResultsHash;
    }

    public String getLastResultsHash() {
        return lastResultsHash;
    }

    public void setEvidenceHash(String evidenceHash) {
        this.evidenceHash = evidenceHash;
    }

    public String getEvidenceHash() {
        return evidenceHash;
    }

    public void setProposerAddress(String proposerAddress) {
        this.proposerAddress = proposerAddress;
    }

    public String getProposerAddress() {
        return proposerAddress;
    }

}