/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.tx;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-01 13:58:12
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class Proof {

    @JSONField(name = "root_hash")
    private String rootHash;
    private String data;
    private Proof proof;

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

    public void setProof(Proof proof) {
        this.proof = proof;
    }

    public Proof getProof() {
        return proof;
    }

}