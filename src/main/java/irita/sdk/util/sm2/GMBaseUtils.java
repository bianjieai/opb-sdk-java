package irita.sdk.util.sm2;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.Security;

public class GMBaseUtils {
    static {
        Security.addProvider(new BouncyCastleProvider());
    }
}
