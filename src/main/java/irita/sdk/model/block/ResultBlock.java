package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultBlock {
    @JSONField(name = "block_id")
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
