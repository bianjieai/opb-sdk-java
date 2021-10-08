package irita.sdk.util;

import irita.sdk.util.secp256k1.SecP256K1;
import irita.sdk.util.sm2.BCECUtils;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSAEncoding;
import org.bouncycastle.crypto.signers.StandardDSAEncoding;
import org.bouncycastle.math.ec.ECPoint;

import java.io.IOException;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.InvalidKeySpecException;

public class SecP256K1Utils {

    public static ECPoint getPublicKeyFromPrivkey(BigInteger privkey) {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SecP256K1.DOMAIN_PARAMS);
        ECPublicKeyParameters publicKey = BCECUtils.buildECPublicKeyByPrivateKey(privkeyParameters);
        return publicKey.getQ();
    }

    public static byte[] sign(BigInteger privkey, byte[] signdoc) throws CryptoException {
        ECPrivateKeySpec spec = new ECPrivateKeySpec(privkey, SecP256K1.JDK_EC_SPEC);
        byte[] signature = null;
        try {
            PrivateKey privateKey = KeyFactory.getInstance("EC").generatePrivate(spec);
            Signature ecdsaSign = Signature.getInstance("SHA256withECDSA");
            ecdsaSign.initSign(privateKey);
            ecdsaSign.update(signdoc);
            signature = ecdsaSign.sign();

        } catch (InvalidKeySpecException | NoSuchAlgorithmException | InvalidKeyException | SignatureException e) {
            throw new RuntimeException("sign error: " + e);
        }
        return signature;
//        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SecP256K1.DOMAIN_PARAMS);
//        return SecP256K1.sign(privkeyParameters, "1234567812345678".getBytes(), signdoc);
    }

    public static boolean verify(BigInteger privkey, byte[] srcData, byte[] signature) {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SecP256K1.DOMAIN_PARAMS);
        ECPublicKeyParameters publicKeyParameters = BCECUtils.buildECPublicKeyByPrivateKey(privkeyParameters);
        return SecP256K1.verify(publicKeyParameters, srcData, signature);//todo
    }

    public static BigInteger[] getRSFromSignature(byte[] signature) throws IOException {
        DSAEncoding encoding = new StandardDSAEncoding();
        return encoding.decode(SecP256K1.DOMAIN_PARAMS.getN(), signature);
    }

    public static byte[] getSignatureFromRS(BigInteger[] rs) throws IOException {
        DSAEncoding encoding = new StandardDSAEncoding();
        return encoding.encode(SecP256K1.DOMAIN_PARAMS.getN(), rs[0], rs[1]);
    }
}
