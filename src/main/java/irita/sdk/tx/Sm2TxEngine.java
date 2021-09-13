package irita.sdk.tx;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.key.KeyManager;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.util.ByteUtils;
import irita.sdk.util.SM2Utils;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.math.ec.ECPoint;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.crypto.sm2.Keys;
import proto.cosmos.tx.signing.v1beta1.Signing;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.io.IOException;
import java.math.BigInteger;

public class Sm2TxEngine implements TxEngine {
    private KeyManager km;
    private String chainID;

    public Sm2TxEngine(KeyManager km, String chainID) {
        this.km = km;
        this.chainID = chainID;
    }

    @Override
    public TxOuterClass.TxBody buildTxBody(com.google.protobuf.GeneratedMessageV3 msg) {
        return TxOuterClass.TxBody.newBuilder()
                .addMessages(Any.pack(msg, "/"))
                .setMemo("")
                .setTimeoutHeight(0)
                .build();
    }

    @Override
    public TxOuterClass.TxBody buildTxBodyWithMemo(com.google.protobuf.GeneratedMessageV3 msg, String memo) {
        if (memo == null) {
            memo = "";
        }
        return TxOuterClass.TxBody.newBuilder()
                .addMessages(Any.pack(msg, "/"))
                .setMemo(memo)
                .setTimeoutHeight(0)
                .build();
    }

    @Override
    public TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account) {
        if (baseTx == null) {
            throw new IritaSDKException("baseTx not be null");
        }

        BigInteger privKey = km.getPrivKey();
        ECPoint publicKey = km.getPublicKey();
        byte[] publicKeyEncoded = publicKey.getEncoded(true);

        TxOuterClass.AuthInfo ai = TxOuterClass.AuthInfo.newBuilder()
                .addSignerInfos(
                        TxOuterClass.SignerInfo.newBuilder()
                                .setPublicKey(Any.pack(Keys.PubKey.newBuilder().setKey(ByteString.copyFrom(publicKeyEncoded)).build(), "/"))
                                .setModeInfo(TxOuterClass.ModeInfo.newBuilder().setSingle(TxOuterClass.ModeInfo.Single.newBuilder().setMode(Signing.SignMode.SIGN_MODE_DIRECT)))
                                .setSequence(account.getSequence()))
                .setFee(TxOuterClass.Fee.newBuilder().setGasLimit(baseTx.getGas()).addAmount(CoinOuterClass.Coin.newBuilder().setAmount(baseTx.getFee().getAmount()).setDenom(baseTx.getFee().getDenom()))).build();


        TxOuterClass.SignDoc signDoc = TxOuterClass.SignDoc.newBuilder()
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(ai.toByteString())
                .setAccountNumber(account.getAccountNumber())
                .setChainId(chainID)
                .build();

        byte[] signature;
        BigInteger[] rs;
        try {
            signature = SM2Utils.sign(privKey, signDoc.toByteArray());
            rs = SM2Utils.getRSFromSignature(signature);
        } catch (CryptoException | IOException e) {
            throw new IritaSDKException("use sm2 sign filed", e);
        }
        byte[] sigBytes = ByteUtils.addAll(ByteUtils.toBytesPadded(rs[0], 32), ByteUtils.toBytesPadded(rs[1], 32));

        return TxOuterClass.Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(ai)
                .addSignatures(ByteString.copyFrom(sigBytes))
                .build();
    }
}
