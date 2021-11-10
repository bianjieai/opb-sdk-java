package irita.sdk.key;

import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

public class KeyInfo {
    private String address;
    private ECPoint publicKey;
    private BigInteger privKey;

    public KeyInfo(String address, ECPoint publicKey, BigInteger privKey) {
        this.address = address;
        this.publicKey = publicKey;
        this.privKey = privKey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ECPoint getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(ECPoint publicKey) {
        this.publicKey = publicKey;
    }

    public BigInteger getPrivKey() {
        return privKey;
    }

    public void setPrivKey(BigInteger privKey) {
        this.privKey = privKey;
    }

}
