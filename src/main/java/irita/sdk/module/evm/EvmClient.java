package irita.sdk.module.evm;

import com.google.protobuf.*;
import io.grpc.ManagedChannel;
import io.grpc.stub.CallStreamObserver;
import irita.sdk.client.BaseClient;
import irita.sdk.constant.enums.BroadcastMode;
import irita.sdk.crypto.eth.LegacyTransaction;
import irita.sdk.model.ResultTx;
import org.web3j.crypto.*;
import org.web3j.utils.Numeric;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.ethermint.evm.v1.Tx;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class EvmClient {
    private final BaseClient baseClient;

    public EvmClient(BaseClient baseClient) {
        this.baseClient = baseClient;
    }

    public ResultTx EthereumTx(String msg,String payer,String denom) throws IOException {
        RawTransaction transaction = TransactionDecoder.decode(msg);
        SignedRawTransaction signedRawTransaction = (SignedRawTransaction) transaction;
        byte[] data = Numeric.hexStringToByteArray(transaction.getData());
        proto.ethermint.evm.v1.Tx.LegacyTx legacyTx = proto.ethermint.evm.v1.Tx.LegacyTx.newBuilder()
                .setData(ByteString.copyFrom(data))
                .setGas(transaction.getGasLimit().intValue())
                .setNonce(transaction.getNonce().intValue())
                .setGasPrice(transaction.getGasPrice().toString())
                .setTo(transaction.getTo())
                .setValue(transaction.getValue()+"")
                .setR(ByteString.copyFrom(signedRawTransaction.getSignatureData().getR()))
                .setS(ByteString.copyFrom(signedRawTransaction.getSignatureData().getS()))
                .setV(ByteString.copyFrom(signedRawTransaction.getSignatureData().getV()))
                .build();
        Tx.MsgEthereumTx tx = Tx.MsgEthereumTx.newBuilder()
                .setData(Any.pack(legacyTx,""))
                .setSize(msg.length())
                .setFeePayer(payer)
                .build();
        List<GeneratedMessageV3> msgs = Collections.singletonList(tx);
        Tx.ExtensionOptionsEthereumTx extensionOptionsEthereumTx = Tx.ExtensionOptionsEthereumTx.newBuilder().build();
        Any extensionOptionsEthereumTxAny = Any.pack(extensionOptionsEthereumTx,"/");
        TxOuterClass.TxBody.Builder builder = TxOuterClass.TxBody.newBuilder();
        builder.addMessages(Any.pack(tx, "/"));
        builder.addExtensionOptions(extensionOptionsEthereumTxAny);
        TxOuterClass.TxBody txBody = builder.build();
        CoinOuterClass.Coin coin = CoinOuterClass.Coin.newBuilder()
                .setAmount(legacyTx.getGas()*Integer.parseInt(legacyTx.getGasPrice())+"")
                .setDenom(denom)
                .build();
        TxOuterClass.Fee.Builder fee = TxOuterClass.Fee.newBuilder();
        fee.setGasLimit(legacyTx.getGas());
        fee.addAmount(coin);
        TxOuterClass.AuthInfo ai = TxOuterClass.AuthInfo.newBuilder()
                .setFee(fee)
                .build();
        TxOuterClass.Tx txResult = TxOuterClass.Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(ai)
                .build();
        return baseClient.buildAndSendEvm(txResult.toByteArray(), BroadcastMode.Sync);
    }
}
