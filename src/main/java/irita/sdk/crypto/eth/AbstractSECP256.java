package irita.sdk.crypto.eth;


import org.apache.tuweni.bytes.Bytes32;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Optional;

public abstract class AbstractSECP256 implements SignatureAlgorithm {

    protected static final int PRIVATE_KEY_BYTE_LENGTH = 32;
    protected static final int PUBLIC_KEY_BYTE_LENGTH = 64;
    protected static final int SIGNATURE_BYTE_LENGTH = 65;

    public static final String PROVIDER = "BC";

    protected final ECDomainParameters curve;
    protected final BigInteger halfCurveOrder;

    protected final KeyPairGenerator keyPairGenerator;
    protected final BigInteger curveOrder;

    final BigInteger prime;

    protected AbstractSECP256(final String curveName, final BigInteger prime) {
        this.prime = prime;
        Security.addProvider(new BouncyCastleProvider());

        final X9ECParameters params = SECNamedCurves.getByName(curveName);
        curve = new ECDomainParameters(params.getCurve(), params.getG(), params.getN(), params.getH());
        curveOrder = curve.getN();
        halfCurveOrder = curveOrder.shiftRight(1);
        try {
            keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM, PROVIDER);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
        final ECGenParameterSpec ecGenParameterSpec = new ECGenParameterSpec(curveName);
        try {
            keyPairGenerator.initialize(ecGenParameterSpec, SecureRandomProvider.createSecureRandom());
        } catch (final InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        }
    }

    // Decompress a compressed public key (x co-ord and low-bit of y-coord).
    protected ECPoint decompressKey(final BigInteger xBN, final boolean yBit) {
        final X9IntegerConverter x9 = new X9IntegerConverter();
        final byte[] compEnc = x9.integerToBytes(xBN, 1 + x9.getByteLength(curve.getCurve()));
        compEnc[0] = (byte) (yBit ? 0x03 : 0x02);
        // TODO: Find a better way to handle an invalid point compression here.
        // Currently ECCurve#decodePoint throws an IllegalArgumentException.
        return curve.getCurve().decodePoint(compEnc);
    }

    protected BigInteger recoverFromSignature(
            final int recId, final BigInteger r, final BigInteger s, final Bytes32 dataHash) {
        assert (recId >= 0);
        assert (r.signum() >= 0);
        assert (s.signum() >= 0);
        assert (dataHash != null);

        final BigInteger n = curve.getN(); // Curve order.
        final BigInteger i = BigInteger.valueOf((long) recId / 2);
        final BigInteger x = r.add(i.multiply(n));
        if (x.compareTo(prime) >= 0) {
            return null;
        }
        final ECPoint R = decompressKey(x, (recId & 1) == 1);
        if (!R.multiply(n).isInfinity()) {
            return null;
        }
        final BigInteger e = dataHash.toUnsignedBigInteger();
        final BigInteger eInv = BigInteger.ZERO.subtract(e).mod(n);
        final BigInteger rInv = r.modInverse(n);
        final BigInteger srInv = rInv.multiply(s).mod(n);
        final BigInteger eInvrInv = rInv.multiply(eInv).mod(n);
        final ECPoint q = ECAlgorithms.sumOfTwoMultiplies(curve.getG(), eInvrInv, R, srInv);

        if (q.isInfinity()) {
            return null;
        }

        final byte[] qBytes = q.getEncoded(false);
        // We remove the prefix
        return new BigInteger(1, Arrays.copyOfRange(qBytes, 1, qBytes.length));
    }

    @Override
    public Optional<SECPPublicKey> recoverPublicKeyFromSignature(
            final Bytes32 dataHash, final SECPSignature signature) {
        final BigInteger publicKeyBI =
                recoverFromSignature(signature.getRecId(), signature.getR(), signature.getS(), dataHash);
        return Optional.of(SECPPublicKey.create(publicKeyBI, ALGORITHM));
    }

}


