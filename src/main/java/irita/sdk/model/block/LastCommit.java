package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LastCommit {
    private String height;
    private int round;
    @JsonProperty(value = "block_id")
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