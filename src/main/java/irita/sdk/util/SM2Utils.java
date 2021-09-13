package irita.sdk.util;

import irita.sdk.util.sm2.BCECUtils;
import irita.sdk.util.sm2.SM2;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.DSAEncoding;
import org.bouncycastle.crypto.signers.StandardDSAEncoding;
import org.bouncycastle.math.ec.ECPoint;

import java.io.IOException;
import java.math.BigInteger;

public class SM2Utils {

    public static ECPoint getPublicKeyFromPrivkey(BigInteger privkey) {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SM2.DOMAIN_PARAMS);
        ECPublicKeyParameters publicKey = BCECUtils.buildECPublicKeyByPrivateKey(privkeyParameters);
        return publicKey.getQ();
    }

    public static byte[] sign(BigInteger privkey, byte[] signdoc) throws CryptoException {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SM2.DOMAIN_PARAMS);
        return SM2.sign(privkeyParameters, "1234567812345678".getBytes(), signdoc);
    }

    public static boolean verify(BigInteger privkey, byte[] srcData, byte[] signature) {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SM2.DOMAIN_PARAMS);
        ECPublicKeyParameters publicKeyParameters = BCECUtils.buildECPublicKeyByPrivateKey(privkeyParameters);
        return SM2.verify(publicKeyParameters, srcData, signature);
    }

    public static BigInteger[] getRSFromSignature(byte[] signature) throws IOException {
        DSAEncoding encoding = new StandardDSAEncoding();
        return encoding.decode(SM2.DOMAIN_PARAMS.getN(), signature);
    }

    public static byte[] getSignatureFromRS(BigInteger[] rs) throws IOException {
        DSAEncoding encoding = new StandardDSAEncoding();
        return encoding.encode(SM2.DOMAIN_PARAMS.getN(), rs[0], rs[1]);
    }
}
