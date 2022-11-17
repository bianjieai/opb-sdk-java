package irita.sdk.crypto.eth;


import com.google.common.base.Suppliers;
import org.apache.tuweni.bytes.Bytes;
import org.apache.tuweni.bytes.Bytes32;
import org.apache.tuweni.bytes.DelegatingBytes32;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

public  class Hash  extends DelegatingBytes32 {

    private Hash(final Bytes32 bytes) {
        super(bytes);
    }
    public static final String KECCAK256_ALG = "KECCAK-256";


    private static final Supplier<MessageDigest> KECCAK256_SUPPLIER =
            Suppliers.memoize(() -> messageDigest(KECCAK256_ALG));

    private static MessageDigest messageDigest(final String algorithm) {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (final NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] digestUsingAlgorithm(
            final Bytes input, final Supplier<MessageDigest> digestSupplier) {
        try {
            final MessageDigest digest = (MessageDigest) digestSupplier.get().clone();
            input.update(digest);
            return digest.digest();
        } catch (final CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Bytes32 keccak256(final Bytes input) {
        return Bytes32.wrap(digestUsingAlgorithm(input, KECCAK256_SUPPLIER));
    }

    public static Hash  hash(final Bytes value) {
        return new Hash(keccak256(value));
    }

}
