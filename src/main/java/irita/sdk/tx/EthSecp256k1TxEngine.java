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
import irita.sdk.util.HashUtils;
import org.bitcoin.NativeSecp256k1;
import org.bitcoin.NativeSecp256k1Util;
import org.bitcoin.Secp256k1Context;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.core.Utils;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.bouncycastle.math.ec.ECPoint;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Sign;
import proto.cosmos.base.v1beta1.CoinOuterClass;
import proto.cosmos.crypto.secp256k1.Keys;
import proto.cosmos.tx.signing.v1beta1.Signing;
import proto.cosmos.tx.v1beta1.TxOuterClass;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.bitcoinj.core.ECKey.CURVE;

public class EthSecp256k1TxEngine implements TxEngine {
    private final KeyManager km;
    private final String chainID;

    public EthSecp256k1TxEngine(KeyManager km, String chainID) {
        this.km = km;
        this.chainID = chainID;
    }

    @Override
    public TxOuterClass.TxBody buildTxBody(List<GeneratedMessageV3> msgs) {
        return this.buildTxBodyWithMemo(msgs, null);
    }

    @Override
    public TxOuterClass.TxBody buildTxBodyWithMemo(List<GeneratedMessageV3> msgs, String memo) {
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

    @Override
    public TxOuterClass.Tx signTx(TxOuterClass.TxBody txBody, BaseTx baseTx, Account account) {
        Objects.requireNonNull(baseTx, "baseTx not be null");

        KeyInfo keyInfo = km.getKeyDAO().read(baseTx.getFrom(), baseTx.getPassword());
        BigInteger privKey = keyInfo.getPrivKey();
        ECPoint publicKey = keyInfo.getPublicKey();
        byte[] publicKeyEncoded = publicKey.getEncoded(true);

        long sequence = baseTx.getSequence() != 0 ? baseTx.getSequence() : account.getSequence();
        long accountNumber = baseTx.getAccountNumber() != 0 ? baseTx.getAccountNumber() : account.getAccountNumber();

        TxOuterClass.AuthInfo ai = TxOuterClass.AuthInfo.newBuilder()
                .addSignerInfos(
                        TxOuterClass.SignerInfo.newBuilder()
                                .setPublicKey(Any.pack(Keys.PubKey.newBuilder().setKey(ByteString.copyFrom(publicKeyEncoded)).build(), "/"))
                                .setModeInfo(TxOuterClass.ModeInfo.newBuilder().setSingle(TxOuterClass.ModeInfo.Single.newBuilder().setMode(Signing.SignMode.SIGN_MODE_DIRECT)))
                                .setSequence(sequence))
                .setFee(TxOuterClass.Fee.newBuilder().setGasLimit(baseTx.getGas()).addAmount(CoinOuterClass.Coin.newBuilder().setAmount(baseTx.getFee().getAmount()).setDenom(baseTx.getFee().getDenom()))).build();


        TxOuterClass.SignDoc signDoc = TxOuterClass.SignDoc.newBuilder()
                .setBodyBytes(txBody.toByteString())
                .setAuthInfoBytes(ai.toByteString())
                .setAccountNumber(accountNumber)
                .setChainId(chainID)
                .build();

        /*byte[] sigData = new byte[64];
        Sign.SignatureData sig = Sign.signMessage(signDoc.toByteArray(), ECKeyPair.create(privKey),true);
        System.arraycopy(sig.getR(), 0, sigData, 0, 32);
        System.arraycopy(sig.getS(), 0, sigData, 32, 32);*/
       /* byte[] sigData = new byte[64];
        ECKey ecKey = ECKey.fromPrivate(privKey);
        byte[] sigData256 = HashUtils.sha256(signDoc.toByteArray());
        Sha256Hash sha256Hash = Sha256Hash.wrap(sigData256);
        ECKey.ECDSASignature signature = ecKey.sign(sha256Hash);*/
        /*System.arraycopy(signature.r.toByteArray(), 0, sigData, 0, 32);
        System.arraycopy(signature.s.toByteArray(), 0, sigData, 32, 32);*/
        //ECKey.ECDSASignature ecdsaSignature = new ECKey.ECDSASignature(signature.r,signature.s);
        //byte[] sigBytes = ByteUtils.addAll(signature.r.toByteArray(), signature.s.toByteArray());
       /* boolean status = ecKey.verify(sha256Hash,signature);
        try {
            boolean statusByte = ecKey.verify(sha256Hash.getBytes(),signature.encodeToDER());
        } catch (SignatureDecodeException e) {
            e.printStackTrace();
        }*/
        byte[] sigData = new byte[64];
        ECKey ecKey = ECKey.fromPrivate(privKey);
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance( "SHA-256" );
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] toSignHash = digest.digest(signDoc.toByteArray());
        ECKey.ECDSASignature Signature = ecKey.sign(Sha256Hash.wrap(toSignHash));
        System.arraycopy(integerToBytes(Signature.r, 32), 0, sigData, 0, 32);
        System.arraycopy(integerToBytes(Signature.s, 32), 0, sigData, 32, 32);

       /* Signature signer = null;
        try {
            signer = Signature.getInstance("SHA256withECDSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        ECKey ecKey = ECKey.fromPrivate(privKey);
        String pubKey = ecKey.getPublicKeyAsHex();
        ECPoint ecPoint = CURVE.getCurve().decodePoint(Hex.decode(pubKey));
        byte[] encoded = ecPoint.getEncoded(false);
        BigInteger pubKey = new BigInteger(1, Arrays.copyOfRange(encoded, 1, encoded.length));
        ECKeyPair keyPair = new ECKeyPair(privKey, pubKey);
        signer.initSign(key);
        signer.update(data);*/
        //KeyPair keyPair = KeyPairGenerator.getInstance();
        /*byte[] sigData256 = HashUtils.sha256(signDoc.toByteArray());
        try {
            if (Secp256k1Context.isEnabled()) {
                byte[] signature = NativeSecp256k1.sign(sigData256, Utils.bigIntegerToBytes(privKey, 32));
            }

        } catch (NativeSecp256k1Util.AssertFailException e) {
            e.printStackTrace();
        }*/
        /*byte[] sigData = new byte[64];
        BigInteger pubKey = Sign.publicKeyFromPrivate(privKey);
        ECKeyPair keyPair = new ECKeyPair(privKey, pubKey);
        Sign.SignatureData signature = Sign.signMessage(HashUtils.sha256(signDoc.toByteArray()), keyPair, false);
        sigData = ByteUtils.addAll(signature.getR(), signature.getS());*/



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
