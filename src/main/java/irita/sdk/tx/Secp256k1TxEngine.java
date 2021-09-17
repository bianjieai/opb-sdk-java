package irita.sdk.tx;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.util.List;

public class Secp256k1TxEngine implements TxEngine {
    @Override
    public TxOuterClass.TxBody buildTxBody(List<GeneratedMessageV3> msgs) {
        throw new RuntimeException("TODO");
    }

    @Override
    public TxOuterClass.TxBody buildTxBodyWithMemo(List<GeneratedMessageV3> msgs, String memo) {
        throw new RuntimeException("TODO");
    }

    @Override
    public TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account) {
        throw new RuntimeException("TODO");
    }
}
