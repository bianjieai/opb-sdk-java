package irita.sdk.model.tx;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Proof {
    @JsonProperty(value = "root_hash")
    private String rootHash;
    private String data;
    @JsonProperty(value = "proof")
    private ChildProof proof;

    public void setRootHash(String rootHash) {
        this.rootHash = rootHash;
    }

    public String getRootHash() {
        return rootHash;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setProof(ChildProof proof) {
        this.proof = proof;
    }

    public ChildProof getProof() {
        return proof;
    }
}