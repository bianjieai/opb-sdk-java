package irita.sdk.key;

import irita.sdk.exception.IritaSDKException;
import irita.sdk.util.Bech32Utils;
import irita.sdk.util.HashUtils;
import irita.sdk.util.SM2Utils;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

public class Sm2KeyManager extends KeyManager {

    public Sm2KeyManager() {
        super();
    }

    public Sm2KeyManager(KeyDAO keyDAO) {
        super(keyDAO);
    }

    @Override
    public KeyInfo toKeyInfo(BigInteger privKey) {
        ECPoint publicKey = SM2Utils.getPublicKeyFromPrivkey(privKey);
        String address = pubKeyToAddress(publicKey);
        return new KeyInfo(address,publicKey,privKey);
    }

    @Override
    public String export(String password) {
        return export(password, getCurrentKeyInfo().getPrivKey().toByteArray());
    }

    @Override
    public String export(String name, String password) {
        if (!keyDAO.has(name)) {
            throw new IritaSDKException(String.format("name %s hasn't existed", name));
        }
        KeyInfo keyInfo = keyDAO.read(name, password);

        byte[] privKeyTemp = keyInfo.getPrivKey().toByteArray();
        return export(password, privKeyTemp);
    }

    @Override
    public AlgoEnum getAlgo() {
        return AlgoEnum.SM2;
    }

    private String pubKeyToAddress(ECPoint publicKey) {
        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] pre20 = new byte[20];
        System.arraycopy(hash, 0, pre20, 0, 20);
        return Bech32Utils.toBech32(getHrp(), pre20);
    }
}
