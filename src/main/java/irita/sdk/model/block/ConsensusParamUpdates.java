package irita.sdk.model.block;

public class ConsensusParamUpdates {

    private ConsensusBlock block;
    private Evidence evidence;
    private Validator validator;

    public void setBlock(ConsensusBlock block) {
        this.block = block;
    }

    public ConsensusBlock getBlock() {
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