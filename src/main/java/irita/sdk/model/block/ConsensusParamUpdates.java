/**
 * Copyright 2021 jb51.net
 */
package irita.sdk.model.block;

/**
 * Auto-generated: 2021-11-01 10:40:28
 *
 * @author jb51.net (i@jb51.net)
 * @website http://tools.jb51.net/code/json2javabean
 */
public class ConsensusParamUpdates {

    private Block block;
    private Evidence evidence;
    private Validator validator;

    public void setBlock(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    public Evidence getEvidence() {
        return evidence;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    public Validator getValidator() {
        return validator;
    }

}