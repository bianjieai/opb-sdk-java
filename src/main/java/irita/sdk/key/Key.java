package irita.sdk.key;

import java.io.InputStream;
import java.math.BigInteger;

public interface Key {
    String add() throws Exception;

    void recover(String mnemonic);

    void recover(BigInteger privKey);

    void recover(String name, String password, String mnemonic, int index);

    void recover(InputStream keystore, String password);

    void recover(String mnemonic, int index);

    void recoverFromCert(InputStream caKeystore, String password);

    String export(String password);
}
