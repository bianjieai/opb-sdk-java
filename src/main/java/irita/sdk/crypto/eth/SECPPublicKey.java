package irita.sdk.crypto.eth;


import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.MutableBytes;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

import static com.google.common.base.Preconditions.checkNotNull;

public class SECPPublicKey implements java.security.PublicKey {

    public static final int BYTE_LENGTH = 64;

    private final Bytes encoded;
    private final String algorithm;

    public static SECPPublicKey create(final BigInteger key, final String algorithm) {
        return create(toBytes64(key.toByteArray()), algorithm);
    }

    public static SECPPublicKey create(final Bytes encoded, final String algorithm) {
        return new SECPPublicKey(encoded, algorithm);
    }


    private static Bytes toBytes64(final byte[] backing) {
        if (backing.length == BYTE_LENGTH) {
            return Bytes.wrap(backing);
        } else if (backing.length > BYTE_LENGTH) {
            return Bytes.wrap(backing, backing.length - BYTE_LENGTH, BYTE_LENGTH);
        } else {
            final MutableBytes res = MutableBytes.create(BYTE_LENGTH);
            Bytes.wrap(backing).copyTo(res, BYTE_LENGTH - backing.length);
            return res;
        }
    }

    private SECPPublicKey(final Bytes encoded, final String algorithm) {
        checkNotNull(encoded);
        checkNotNull(algorithm);
        this.encoded = encoded;
        this.algorithm = algorithm;
    }

    /**
     * Returns this public key as an {@link ECPoint} of Bouncy Castle, to facilitate cryptographic
     * operations.
     *
     * @param curve The elliptic curve (e.g. SECP256K1) represented as its domain parameters
     * @return This public key represented as an Elliptic Curve point.
     */
    public ECPoint asEcPoint(final ECDomainParameters curve) {
        // 0x04 is the prefix for uncompressed keys.
        final Bytes val = Bytes.concatenate(Bytes.of(0x04), encoded);
        return curve.getCurve().decodePoint(val.toArrayUnsafe());
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof SECPPublicKey)) {
            return false;
        }

        final SECPPublicKey that = (SECPPublicKey) other;
        return this.encoded.equals(that.encoded) && this.algorithm.equals(that.algorithm);
    }

    @Override
    public byte[] getEncoded() {
        return encoded.toArrayUnsafe();
    }

    public Bytes getEncodedBytes() {
        return encoded;
    }

    @Override
    public String getAlgorithm() {
        return algorithm;
    }

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public int hashCode() {
        return encoded.hashCode();
    }

    @Override
    public String toString() {
        return encoded.toString();
    }
}
