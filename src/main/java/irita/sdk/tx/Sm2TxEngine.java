package irita.sdk.tx;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.key.KeyInfo;
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
import java.util.List;
import java.util.Optional;

public class Sm2TxEngine implements TxEngine {
    private KeyManager km;
    private String chainID;

    public Sm2TxEngine(KeyManager km, String chainID) {
        this.km = km;
        this.chainID = chainID;
    }

    @Override
    public TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account) {
        if (baseTx == null) {
            throw new IritaSDKException("baseTx not be null");
        }

        KeyInfo keyInfo = km.getKeyDAO().read(baseTx.getFrom(), baseTx.getPassword());
        BigInteger privKey = keyInfo.getPrivKey();
        ECPoint publicKey = keyInfo.getPublicKey();
        byte[] publicKeyEncoded = publicKey.getEncoded(true);

        long sequence = baseTx.getSequence() != 0 ? baseTx.getSequence() : account.getSequence();
        long accountNumber = baseTx.getAccountNumber() != 0 ? baseTx.getAccountNumber() : account.getAccountNumber();
        TxOuterClass.Fee.Builder fee = TxOuterClass.Fee.newBuilder();
        fee.setGasLimit(baseTx.getGas());
        fee.addAmount(CoinOuterClass.Coin.newBuilder().setAmount(baseTx.getFee().getAmount()).setDenom(baseTx.getFee().getDenom()));
        if (baseTx.getFeePayer() != null) {
            fee.setPayer(baseTx.getFeePayer());
        }
        if (baseTx.getFeeGranter() != null) {
            fee.setGranter(baseTx.getFeeGranter());
        }

        TxOuterClass.AuthInfo ai = TxOuterClass.AuthInfo.newBuilder()
                .addSignerInfos(
                        TxOuterClass.SignerInfo.newBuilder()
                                .setPublicKey(Any.pack(Keys.PubKey.newBuilder().setKey(ByteString.copyFrom(publicKeyEncoded)).build(), "/"))
                                .setModeInfo(TxOuterClass.ModeInfo.newBuilder().setSingle(TxOuterClass.ModeInfo.Single.newBuilder().setMode(Signing.SignMode.SIGN_MODE_DIRECT)))
                                .setSequence(sequence))
                .setFee(fee).build();


        TxOuterClass.SignDoc signDoc = TxOuterClass.SignDoc.newBuilder()
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(ai.toByteString())
                .setAccountNumber(accountNumber)
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
