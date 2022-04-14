package irita.sdk.tx;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.model.Account;
import irita.sdk.model.BaseTx;
import irita.sdk.util.ByteUtils;
import org.bouncycastle.math.ec.ECPoint;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Sign;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.tx.signing.v1beta1.Signing;
import proto.cosmos.tx.v1beta1.TxOuterClass;
import proto.ethermint.crypto.ethsecp256k1.Keys;

import java.math.BigInteger;
import java.util.Objects;

public class EthSecp256k1TxEngine implements TxEngine {
    private final KeyManager km;
    private final String chainID;

    public EthSecp256k1TxEngine(KeyManager km, String chainID) {
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

        byte[] sigData = new byte[65];
        BigInteger pubKey = Sign.publicKeyFromPrivate(privKey);
        ECKeyPair keyPair = new ECKeyPair(privKey, pubKey);
        Sign.SignatureData signature = Sign.signMessage(org.web3j.crypto.Hash.sha3(signDoc.toByteArray()), keyPair, false);
        sigData = ByteUtils.addAll(signature.getR(), signature.getS());
        sigData = ByteUtils.addAll(sigData, signature.getV());
        return TxOuterClass.Tx.newBuilder()
                .setBody(txBody)
                .setAuthInfo(ai)
                .addSignatures(ByteString.copyFrom(sigData))
                .build();
    }

    public byte[] integerToBytes(BigInteger s, int length) {
        byte[] bytes = s.toByteArray();

        if (length < bytes.length) {
            byte[] tmp = new byte[length];
            System.arraycopy(bytes, bytes.length - tmp.length, tmp, 0, tmp.length);
            return tmp;
        } else if (length > bytes.length) {
            byte[] tmp = new byte[length];
            System.arraycopy(bytes, 0, tmp, tmp.length - bytes.length, bytes.length);
            return tmp;
        }
        return bytes;
    }

}
