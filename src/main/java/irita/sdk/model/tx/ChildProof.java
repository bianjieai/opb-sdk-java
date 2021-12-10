package irita.sdk.model.tx;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChildProof {
    private String total;
    private String index;
    @JsonProperty(value = "leaf_hash")
    private String leafHash;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getLeafHash() {
        return leafHash;
    }

    public void setLeafHash(String leafHash) {
        this.leafHash = leafHash;
    }
}
