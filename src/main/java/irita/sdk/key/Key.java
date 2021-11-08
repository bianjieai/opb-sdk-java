package irita.sdk.key;

import java.io.InputStream;
import java.math.BigInteger;

public interface Key {
    String add(String name, String password) throws Exception;

    void recover(String name, String password, String mnemonic);

    void recover(BigInteger privKey);

    void recover(InputStream keystore, String password);

    void recoverFromCA(InputStream caKeystore, String password);

    String export(String password);
}
