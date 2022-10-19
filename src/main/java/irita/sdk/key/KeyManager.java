package irita.sdk.key;

import irita.sdk.constant.Constant;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.util.Bip44Utils;
import org.bitcoinj.crypto.DeterministicKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.CertificateException;

public abstract class KeyManager implements Key, MultiKey {
    // this keyPath and hrp just for iris
    private String keyPath = "m/44'/118'/0'/0/0";
    private String BIP44Prifix = "m/44'/118'/";
    private String PartialPath = "0'/0/";
    private String hrp = "iaa";
    private ThreadLocal<KeyInfo> currentKeyInfo = new ThreadLocal<>();
    protected final KeyDAO keyDAO = new MemoryKeyDAO();

    private AlgoEnum algo;

    public abstract AlgoEnum getAlgo();

    public KeyInfo getCurrentKeyInfo() {
        return currentKeyInfo.get();
    }

    public void setCurrentKeyInfo(KeyInfo currentKeyInfo) {
        this.currentKeyInfo.set(currentKeyInfo);
    }

    public KeyDAO getKeyDAO() {
        return keyDAO;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public String getHrp() {
        return hrp;
    }

    public void setHrp(String hrp) {
        this.hrp = hrp;
    }

    @Override
    public String add() throws Exception {
        String mnemonic = Bip44Utils.generateMnemonic();
        recover(mnemonic);
        return mnemonic;
    }

    @Override
    public String add(String name, String password) throws Exception {
        String mnemonic = Bip44Utils.generateMnemonic();
        recover(name, password, mnemonic);
        return mnemonic;
    }

    @Override
    public void recover(String mnemonic) {
        byte[] seed = Bip44Utils.getSeed(mnemonic);
        DeterministicKey dk = Bip44Utils.getDeterministicKey(mnemonic, seed, getKeyPath());
        BigInteger privKey = dk.getPrivKey();
        recover(privKey);
    }

    @Override
    public void recover(String mnemonic, int index) {
        byte[] seed = Bip44Utils.getSeed(mnemonic);
        String keyPath = BIP44Prifix + PartialPath + index;
        DeterministicKey dk = Bip44Utils.getDeterministicKey(mnemonic, seed, keyPath);
        BigInteger privKey = dk.getPrivKey();
        recover(privKey);
    }

    @Override
    public void recover(String name, String password, String mnemonic) {
        if (keyDAO.has(name)) {
            throw new IritaSDKException(String.format("name %s has existed", name));
        }
        recover(mnemonic);
        keyDAO.write(name, password, getCurrentKeyInfo());
    }

    @Override
    public void recover(String name, String password, BigInteger privKey) {
        if (keyDAO.has(name)) {
            throw new IritaSDKException(String.format("name %s has existed", name));
        }
        recover(privKey);
        keyDAO.write(name, password, getCurrentKeyInfo());
    }

    @Override
    public void recover(String name, InputStream keystore, String password) {
        if (keyDAO.has(name)) {
            throw new IritaSDKException(String.format("name %s has existed", name));
        }
        recover(keystore, password);
        keyDAO.write(name, password, getCurrentKeyInfo());
    }

    @Override
    public void recoverFromCA(String name, InputStream caKeystore, String password) {
        if (keyDAO.has(name)) {
            throw new IritaSDKException(String.format("name %s has existed", name));
        }
        recoverFromCA(caKeystore, password);
        keyDAO.write(name, password, getCurrentKeyInfo());
    }

    @Override
    public void recoverFromCA(InputStream caKeystore, String password) {
        try {
            Security.addProvider(new BouncyCastleProvider());
            KeyStore ks = KeyStore.getInstance("PKCS12", "BC");
            ks.load(caKeystore, password.toCharArray());
            BCECPrivateKey privateKey = (BCECPrivateKey) ks.getKey("signKey", password.toCharArray());

            recover(privateKey.getD());
        } catch (UnrecoverableKeyException | CertificateException | KeyStoreException | IOException | NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }

    public void setDefaultKeyDao(BigInteger privKey, ECPoint publicKey, String address) {
        setCurrentKeyInfo(new KeyInfo(address, publicKey, privKey));
        keyDAO.write(Constant.DEFAULT_USER_NAME, null, currentKeyInfo.get());
    }
}
