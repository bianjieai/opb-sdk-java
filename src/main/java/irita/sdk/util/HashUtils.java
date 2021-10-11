package irita.sdk.util;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

public class HashUtils {
    private static final String SHA_256 = "SHA-256";
    private static final String RIPEMD_160 = "RipeMD160";

    public static byte[] sha256(byte[] input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA_256);
            return digest.digest(input);
        } catch (NoSuchAlgorithmException var2) {
            throw new RuntimeException("Couldn't find a SHA-256 provider", var2);
        }
    }

    public static byte[] ripeMD160(byte[] data) {
        Security.addProvider(new BouncyCastleProvider());
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(RIPEMD_160);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Couldn't find a RIPEMD_160 provider", e);
        }
        return md.digest(data);
    }

}
