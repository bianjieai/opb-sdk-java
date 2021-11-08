package irita.sdk.model;

import com.google.protobuf.GeneratedMessageV3;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.util.List;

public class StdTx {
    private List<GeneratedMessageV3> msgs;
    private TxOuterClass.Fee fee;
    //    private irita.sdk.model.block.Signatures Signatures;
    private String memo;
    private String txHash;

    public List<GeneratedMessageV3> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<GeneratedMessageV3> msgs) {
        this.msgs = msgs;
    }

    public TxOuterClass.Fee getFee() {
        return fee;
    }

    public void setFee(TxOuterClass.Fee fee) {
        this.fee = fee;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }
}
