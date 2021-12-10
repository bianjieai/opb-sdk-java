package irita.sdk.model.block;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultBlock {
    @JsonProperty(value = "block_id")
    private BlockId blockID;
    private Block block;

    public BlockId getBlockID() {
        return blockID;
    }

    public void setBlockID(BlockId blockID) {
        this.blockID = blockID;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
