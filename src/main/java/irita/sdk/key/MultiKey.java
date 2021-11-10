package irita.sdk.key;

import java.io.InputStream;
import java.math.BigInteger;

// MultiKey
// support multi mnemonic, keystore recover in one KeyManger
public interface MultiKey {
    String add(String name, String password) throws Exception;

    void recover(String name, String password, String mnemonic);

    void recover(String name, String password, BigInteger privKey);

    void recover(String name, InputStream keystore, String password);

    void recoverFromCA(String name, InputStream caKeystore, String password);

    String export(String name, String password);
}
