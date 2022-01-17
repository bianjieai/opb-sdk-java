package irita.sdk.key;

import irita.sdk.exception.IritaSDKException;
import irita.sdk.util.Bech32Utils;
import irita.sdk.util.HashUtils;
import irita.sdk.util.SecP256K1Utils;
import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

/**
 * Secp256k1KeyManger will implement in the future
 */
public class Secp256k1KeyManger extends KeyManager {
    @Override
    public void recover(BigInteger privKey) {
        ECPoint publicKey = SecP256K1Utils.getPublicKeyFromPrivkey(privKey);
        String address = pubKeyToAddress(publicKey);
        setDefaultKeyDao(privKey, publicKey, address);
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

        byte[] privKey = keyInfo.getPrivKey().toByteArray();
        return super.export(password, privKey);
    }

    @Override
    public AlgoEnum getAlgo() {
        return AlgoEnum.SECP256K1;
    }

    private String pubKeyToAddress(ECPoint publicKey) {
        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] md160 = HashUtils.ripeMD160(hash);
        byte[] pre20 = new byte[20];
        System.arraycopy(md160, 0, pre20, 0, 20);
        return Bech32Utils.toBech32(getHrp(), pre20);
    }
}
