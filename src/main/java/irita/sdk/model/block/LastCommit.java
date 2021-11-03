/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * Auto-generated: 2021-11-01 10:51:5
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class LastCommit {

    private String height;
    private int round;
    @JSONField(name = "block_id")
    private BlockId blockId;
    private List<Signatures> signatures;

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public void setBlockId(BlockId blockId) {
        this.blockId = blockId;
    }

    public BlockId getBlockId() {
        return blockId;
    }

    public void setSignatures(List<Signatures> signatures) {
        this.signatures = signatures;
    }

    public List<Signatures> getSignatures() {
        return signatures;
    }

}