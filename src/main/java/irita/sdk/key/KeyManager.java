package irita.sdk.key;

import irita.sdk.exception.IritaSDKException;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public abstract class KeyManager implements Key {
    private BigInteger privKey;
    private ECPoint publicKey;
    private String addr;
    private String mnemonic;
    // this keyPath and hrp just for iris
    private String keyPath = "m/44'/118'/0'/0/0";
    private String hrp = "iaa";

    private AlgoEnum algo;
    private Map<String, KeyInfo> keyDAO = new HashMap();

    public abstract AlgoEnum getAlgo();

    public BigInteger getPrivKey() {
        return privKey;
    }

    public void setPrivKey(BigInteger privKey) {
        this.privKey = privKey;
    }

    public ECPoint getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(ECPoint publicKey) {
        this.publicKey = publicKey;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMnemonic() {
        if (StringUtils.isEmpty(mnemonic)) {
            throw new IritaSDKException("this KeyManger can't export mnemonic");
        }

        return mnemonic;
    }

    protected void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
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

    public void addKeyDAO(String name, String password, KeyInfo keyInfo) {
        this.keyDAO.put(name, keyInfo);
    }

    public KeyInfo getKeyDAO(String name) {
        KeyInfo keyInfo = this.keyDAO.get(name);
        if (keyInfo == null) {
            throw new IritaSDKException(String.format("keyDAO name %s is not exist", name));
        }
        return keyInfo;
    }

    public boolean hasKeyDAO(String name) {
        return this.keyDAO.containsKey(name);
    }

    public void removeKeyDAO(String name) {
        this.keyDAO.remove(name);
    }
}
