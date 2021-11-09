package irita.sdk.key;

import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

public class KeyInfo {
    private String name;
    private String address;
    private ECPoint publicKey;
    private BigInteger privKey;
    private AlgoEnum algo;

    public KeyInfo(String name, String address, ECPoint publicKey, BigInteger privKey, AlgoEnum algo) {
        this.name = name;
        this.address = address;
        this.publicKey = publicKey;
        this.privKey = privKey;
        this.algo = algo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public AlgoEnum getAlgo() {
        return algo;
    }

    public void setAlgo(AlgoEnum algo) {
        this.algo = algo;
    }
}
