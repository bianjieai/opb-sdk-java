package irita.sdk.key;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

// MultiKey
// support multi mnemonic, keystore recover in one KeyManger
public interface MultiKey {
    String add(String name, String password) throws Exception;

    void recover(String name, String password, String mnemonic);

    void recover(String name, String password, BigInteger privKey);

    void recover(String name, String password, InputStream keystore);

    void recoverFromCert(String name, String password, InputStream caKeystore) throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, IOException;

    String export(String name, String password);
}
