package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Block {
    private Header header;
    private Data data;
    private Evidence evidence;
    @JsonProperty(value = "last_commit")
    private LastCommit lastCommit;

    public void setHeader(Header header) {
        this.header = header;
    }

    public Header getHeader() {
        return header;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    public Evidence getEvidence() {
        return evidence;
    }

    public void setLastCommit(LastCommit lastCommit) {
        this.lastCommit = lastCommit;
    }

    public LastCommit getLastCommit() {
        return lastCommit;
    }

}