package irita.sdk.key;

import irita.sdk.util.Bech32Utils;
import irita.sdk.util.Bip44Utils;
import irita.sdk.util.HashUtils;
import irita.sdk.util.SecP256K1Utils;
import org.bitcoinj.crypto.DeterministicKey;
import org.bouncycastle.math.ec.ECPoint;

import java.io.InputStream;
import java.math.BigInteger;

/**
 * Secp256k1KeyManger will implement in the future
 */
public class Secp256k1KeyManger extends KeyManager {

    @Override
    public void add() throws Exception {
        String mnemonic = Bip44Utils.generateMnemonic();
        recover(mnemonic);
    }

    @Override
    public void recover(String mnemonic) {
        byte[] seed = Bip44Utils.getSeed(mnemonic);
        DeterministicKey dk = Bip44Utils.getDeterministicKey(mnemonic, seed, getKeyPath());
        BigInteger privKey = dk.getPrivKey();
        ECPoint publicKey = SecP256K1Utils.getPublicKeyFromPrivkey(privKey);
        String address = pubKeyToAddress(publicKey);

        super.setAddr(address);
        super.setPublicKey(publicKey);
        super.setPrivKey(privKey);
        super.setMnemonic(mnemonic);
    }

    @Override
    public void recover(BigInteger privKey) {
        ECPoint publicKey = SecP256K1Utils.getPublicKeyFromPrivkey(privKey);
        String address = pubKeyToAddress(publicKey);

        super.setAddr(address);
        super.setPublicKey(publicKey);
        super.setPrivKey(privKey);
    }

    @Override
    public void recover(InputStream keystore, String password) {
        throw new RuntimeException("TODO");
    }

    @Override
    public void recoverFromCA(InputStream caKeystore, String password) {
        throw new RuntimeException("TODO");
    }

    @Override
    public String export(String password) {
        throw new RuntimeException("TODO");
    }

    private String pubKeyToAddress(ECPoint publicKey) {
        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] md160 = HashUtils.ripeMD160(hash);
        byte[] pre20 = new byte[20];
        System.arraycopy(md160, 0, pre20, 0, 20);
        return Bech32Utils.toBech32(getHrp(), pre20);
    }

    @Override
    public AlgoEnum getAlgo() {
        return AlgoEnum.SECP256K1;
    }
}
