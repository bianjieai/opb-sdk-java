package irita.sdk.tx;

import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.util.List;

public interface TxEngine {

    TxOuterClass.TxBody buildTxBody(List<GeneratedMessageV3> msgs);

    TxOuterClass.TxBody buildTxBodyWithMemo(List<GeneratedMessageV3> msgs, String memo);

    TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account);

    default byte[] buildAndSign(List<GeneratedMessageV3> msgs, BaseTx baseTx, Account account) {
        TxOuterClass.TxBody txBody = buildTxBodyWithMemo(msgs, baseTx.getMemo());
        TxOuterClass.Tx tx = signTx(txBody, baseTx, account);
        return tx.toByteArray();
    }
}
