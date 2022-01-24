package irita.sdk.model.ws.block;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {

    private Version version;
    @JsonProperty(value = "chain_id")
    private String chainId;
    private String height;
    private Date time;
    @JsonProperty(value = "last_block_id")
    private LastBlockId lastBlockId;
    @JsonProperty(value = "last_commit_hash")
    private String lastCommitHash;
    @JsonProperty(value = "data_hash")
    private String dataHash;
    @JsonProperty(value = "validators_hash")
    private String validatorsHash;
    @JsonProperty(value = "next_validators_hash")
    private String nextValidatorsHash;
    @JsonProperty(value = "consensus_hash")
    private String consensusHash;
    @JsonProperty(value = "app_hash")
    private String appHash;
    @JsonProperty(value = "last_results_hash")
    private String lastResultsHash;
    @JsonProperty(value = "evidence_hash")
    private String evidenceHash;
    @JsonProperty(value = "proposer_address")
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

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
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