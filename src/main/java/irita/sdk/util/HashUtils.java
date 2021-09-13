package irita.sdk.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtils {
    private static final String SHA_256 = "SHA-256";

    public static byte[] sha256(byte[] input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA_256);
            return digest.digest(input);
        } catch (NoSuchAlgorithmException var2) {
            throw new RuntimeException("Couldn't find a SHA-256 provider", var2);
        }
    }

}
