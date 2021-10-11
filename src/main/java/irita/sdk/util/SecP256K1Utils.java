package irita.sdk.util;

import irita.sdk.util.secp256k1.SecP256K1;
import irita.sdk.util.sm2.BCECUtils;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Sign;

import java.math.BigInteger;

public class SecP256K1Utils {

    public static ECPoint getPublicKeyFromPrivkey(BigInteger privkey) {
        ECPrivateKeyParameters privkeyParameters = BCECUtils.createECPrivateKeyParameters(privkey, SecP256K1.DOMAIN_PARAMS);
        ECPublicKeyParameters publicKey = BCECUtils.buildECPublicKeyByPrivateKey(privkeyParameters);
        return publicKey.getQ();
    }

    public static byte[] sign(BigInteger privkey, byte[] signdoc) {
        BigInteger pubKey = Sign.publicKeyFromPrivate(privkey);
        ECKeyPair keyPair = new ECKeyPair(privkey, pubKey);
        Sign.SignatureData signature = Sign.signMessage(HashUtils.sha256(signdoc), keyPair, false);
        return ByteUtils.addAll(signature.getR(), signature.getS());
    }
}
