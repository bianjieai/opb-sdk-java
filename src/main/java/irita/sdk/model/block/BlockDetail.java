package irita.sdk.model.block;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockDetail {
    @JsonProperty(value = "block_id")
    private BlockId blockId;
    private Block block;
    @JsonProperty(value = "block_result")
    private BlockResult blockResult;

    public void setBlockId(BlockId blockId) {
        this.blockId = blockId;
    }

    public BlockId getBlockId() {
        return blockId;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlockResult(BlockResult blockResult) {
        this.blockResult = blockResult;
    }

    public BlockResult getBlockResult() {
        return blockResult;
    }

}