package irita.sdk.tx;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.util.SecP256K1Utils;
import org.bouncycastle.math.ec.ECPoint;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.crypto.secp256k1.Keys;
import proto.cosmos.tx.signing.v1beta1.Signing;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.math.BigInteger;
import java.util.Objects;

public class Secp256k1TxEngine implements TxEngine {
    private final KeyManager km;
    private final String chainID;

    public Secp256k1TxEngine(KeyManager km, String chainID) {
        this.km = km;
        this.chainID = chainID;
    }

    @Override
    public TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account) {
        Objects.requireNonNull(baseTx, "baseTx not be null");

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

        byte[] sigBytes = SecP256K1Utils.sign(privKey, signDoc.toByteArray());

        return TxOuterClass.Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(ai)
                .addSignatures(ByteString.copyFrom(sigBytes))
                .build();
    }
}
