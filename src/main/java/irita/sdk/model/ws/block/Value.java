package irita.sdk.model.ws.block;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {

    private Block block;
    @JsonProperty(value = "result_begin_block")
    private ResultBeginBlock resultBeginBlock;
    @JsonProperty(value = "result_end_block")
    private ResultEndBlock resultEndBlock;

    public void setBlock(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public void setResultBeginBlock(ResultBeginBlock resultBeginBlock) {
        this.resultBeginBlock = resultBeginBlock;
    }

    public ResultBeginBlock getResultBeginBlock() {
        return resultBeginBlock;
    }

    public void setResultEndBlock(ResultEndBlock resultEndBlock) {
        this.resultEndBlock = resultEndBlock;
    }

    public ResultEndBlock getResultEndBlock() {
        return resultEndBlock;
    }

}