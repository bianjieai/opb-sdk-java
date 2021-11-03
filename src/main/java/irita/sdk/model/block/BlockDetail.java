/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Auto-generated: 2021-11-01 9:42:4
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class BlockDetail {

    @JSONField(name = "block_id")
    private BlockId blockId;
    private Block block;
    @JSONField(name = "block_result")
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