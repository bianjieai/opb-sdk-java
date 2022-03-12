package irita.sdk.tx;

import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.util.List;
import java.util.Optional;

public interface TxEngine {

   default TxOuterClass.TxBody buildTxBody(List<GeneratedMessageV3> msgs) {
       return this.buildTxBodyWithMemo(msgs, null);
   }

    default TxOuterClass.TxBody buildTxBodyWithMemo(List<GeneratedMessageV3> msgs, String memo){
        if (msgs.size() == 0) {
            throw new IritaSDKException("size of msgs should larger than 0");
        }
        TxOuterClass.TxBody.Builder builder = TxOuterClass.TxBody.newBuilder();
        msgs.forEach(msg -> {
            builder.addMessages(Any.pack(msg, "/"));
        });
        return builder
                .setMemo(Optional.ofNullable(memo).orElse(""))
                .setTimeoutHeight(0)
                .build();
    }

    TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account);

    default byte[] buildAndSign(List<GeneratedMessageV3> msgs, BaseTx baseTx, Account account) {
        TxOuterClass.TxBody txBody = buildTxBodyWithMemo(msgs, baseTx.getMemo());
        TxOuterClass.Tx tx = signTx(txBody, baseTx, account);
        return tx.toByteArray();
    }
}
