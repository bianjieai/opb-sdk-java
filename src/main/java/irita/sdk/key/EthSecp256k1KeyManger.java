package irita.sdk.key;

import irita.sdk.exception.IritaSDKException;
import org.bitcoinj.core.Bech32;
import org.bitcoinj.core.ECKey;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;
import org.web3j.crypto.Keys;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

import static org.bitcoinj.core.ECKey.CURVE;

public class EthSecp256k1KeyManger extends KeyManager{

    public EthSecp256k1KeyManger() {
        super();
    }

    public EthSecp256k1KeyManger(KeyDAO keyDAO) {
        super(keyDAO);
    }

    @Override
    public KeyInfo toKeyInfo(BigInteger privKey) {
        ECKey ecKey = ECKey.fromPrivate(privKey);
        String pubKey = ecKey.getPublicKeyAsHex();
        ECPoint publicKey = CURVE.getCurve().decodePoint(Hex.decode(pubKey));
        String address = pubKeyToAddress(publicKey);
        return new KeyInfo(address,publicKey,privKey);
    }

    @Override
    public String toAddr(byte[] publicKey) {
        ECPoint pubKey = CURVE.getCurve().decodePoint(publicKey);
        return pubKeyToAddress(pubKey);
    }

    @Override
    public String export(String password) {
        return null;
    }

    @Override
    public AlgoEnum getAlgo() {
        return AlgoEnum.ETH_SECP256K1;
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


    private String pubKeyToAddress(ECPoint publicKey) {
        byte[] uncompressedPubKey = publicKey.getEncoded(false);
        byte[] pub = new byte[64];
        System.arraycopy(uncompressedPubKey, 1, pub, 0, 64);
        byte[] address = Keys.getAddress(pub);
        String addressResult;
        try {
            byte[] bytes = convertBits(address, 8, 5, true);
            addressResult = Bech32.encode(Bech32.Encoding.BECH32,getHrp(), bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return addressResult;
    }

    private byte[] convertBits(byte[] data, int frombits, int tobits, boolean pad) throws Exception {
        int acc = 0;
        int bits = 0;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int maxv = (1 << tobits) - 1;
        for (int i = 0; i < data.length; i++) {
            int value = data[i] & 0xff;
            if ((value >>> frombits) != 0) {
                throw new Exception("invalid data range: data[" + i + "]=" + value + " (frombits=" + frombits + ")");
            }
            acc = (acc << frombits) | value;
            bits += frombits;
            while (bits >= tobits) {
                bits -= tobits;
                baos.write((acc >>> bits) & maxv);
            }
        }
        if (pad) {
            if (bits > 0) {
                baos.write((acc << (tobits - bits)) & maxv);
            }
        } else if (bits >= frombits) {
            throw new Exception("illegal zero padding");
        } else if (((acc << (tobits - bits)) & maxv) != 0) {
            throw new Exception("non-zero padding");
        }
        return baos.toByteArray();
    }
}
