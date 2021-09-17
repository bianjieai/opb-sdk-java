package irita.sdk.tx;

import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import proto.cosmos.tx.v1beta1.TxOuterClass;

public interface TxEngine {

    TxOuterClass.TxBody buildTxBody(java.util.List<com.google.protobuf.GeneratedMessageV3> msgs);

    TxOuterClass.TxBody buildTxBodyWithMemo(java.util.List<com.google.protobuf.GeneratedMessageV3> msgs, String memo);

    TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account);

    default byte[] buildAndSign(java.util.List<com.google.protobuf.GeneratedMessageV3> msgs, BaseTx baseTx, Account account) {
        TxOuterClass.TxBody txBody = buildTxBodyWithMemo(msgs, baseTx.getMemo());
        TxOuterClass.Tx tx = signTx(txBody, baseTx, account);
        return tx.toByteArray();
    }
}
