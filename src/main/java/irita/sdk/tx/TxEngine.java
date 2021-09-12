package irita.sdk.tx;

import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.util.Base64;

public interface TxEngine {
    TxOuterClass.TxBody buildTxBody(com.google.protobuf.GeneratedMessageV3 msg);

    TxOuterClass.TxBody buildTxBodyWithMemo(com.google.protobuf.GeneratedMessageV3 msg, String memo);

    TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account);

    default byte[] buildAndSign(com.google.protobuf.GeneratedMessageV3 msg, BaseTx baseTx, Account account) {
        TxOuterClass.TxBody txBody = buildTxBodyWithMemo(msg, baseTx.getMemo());
        TxOuterClass.Tx tx = signTx(txBody, baseTx, account);
        return tx.toByteArray();
    }
}
