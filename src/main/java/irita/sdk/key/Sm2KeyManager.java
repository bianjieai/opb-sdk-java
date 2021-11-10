package irita.sdk.key;

import com.codahale.xsalsa20poly1305.SimpleBox;
import irita.sdk.constant.Constant;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.module.crypto.ArmoredInputStream;
import irita.sdk.module.crypto.ArmoredOutputStreamImpl;
import irita.sdk.util.*;
import org.apache.commons.lang3.ArrayUtils;
import org.bitcoinj.crypto.DeterministicKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;
import org.mindrot.jbcrypt.BCrypt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Hashtable;

import static irita.sdk.constant.Armored.*;
import static irita.sdk.module.crypto.BCryptImpl.decode_base64;
import static irita.sdk.module.crypto.BCryptImpl.encode_base64;

public class Sm2KeyManager extends KeyManager {
    @Override
    public void recover(BigInteger privKey) {
        ECPoint publicKey = SM2Utils.getPublicKeyFromPrivkey(privKey);
        String address = pubKeyToAddress(publicKey);

        setDefaultKeyDao(privKey, publicKey, address);
    }

    @Override
    public void recover(InputStream keystore, String password) {
        try {
            ArmoredInputStream aIS = new ArmoredInputStream(keystore);
            String[] headers = aIS.getArmorHeaders();
            Hashtable<String, String> headersTable = new Hashtable<>();
            for (String headersItem : headers) {
                String[] itemSplit = headersItem.split(": ");
                headersTable.put(itemSplit[0], itemSplit[1]);
            }
            byte[] encBytes = new byte[77];
            aIS.read(encBytes);

            byte[] realSaltByte = Hex.decode(headersTable.get("salt"));
            String realSaltString = encode_base64(realSaltByte, 16);
            String salt = PREFIX_SALT + realSaltString;

            String keyHash = BCrypt.hashpw(password, salt);
            byte[] keyHashByte = keyHash.getBytes(StandardCharsets.UTF_8);
            byte[] keyHashSha256 = HashUtils.sha256(keyHashByte);

            SimpleBox box = new SimpleBox(keyHashSha256);
            byte[] privKeyAmino = box.open(encBytes).get();
            byte[] privKeyTemp = Arrays.copyOfRange(privKeyAmino, 5, privKeyAmino.length);

            BigInteger privKey = new BigInteger(1, privKeyTemp);
            recover(privKey);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

    public byte[] getPrefixAmino(String algoPrivKeyName) {
        byte[] hash = HashUtils.sha256(algoPrivKeyName.getBytes(StandardCharsets.UTF_8));
        int ptr = 0;
        while (hash[ptr] == 0) ptr++;
        ptr += 3;
        while (hash[ptr] == 0) ptr++;
        byte[] prefix = new byte[5];
        System.arraycopy(hash, ptr, prefix, 0, 4);
        prefix[4] = 32;
        return prefix;
    }

    private String pubKeyToAddress(ECPoint publicKey) {
        byte[] encoded = publicKey.getEncoded(true);
        byte[] hash = HashUtils.sha256(encoded);
        byte[] pre20 = new byte[20];
        System.arraycopy(hash, 0, pre20, 0, 20);
        return Bech32Utils.toBech32(getHrp(), pre20);
    }

    private String export(String password, byte[] privKeyTemp) {
        byte[] prefixAmino = getPrefixAmino(PRIV_KEY_NAME);
        byte[] privKeyAmino = ArrayUtils.addAll(prefixAmino, privKeyTemp);

        String salt = BCrypt.gensalt(LOG_ROUNDS);
        String keyHash = BCrypt.hashpw(password, salt);
        byte[] keyHashByte = keyHash.getBytes(StandardCharsets.UTF_8);
        byte[] keyHashSha256 = HashUtils.sha256(keyHashByte);

        SimpleBox box = new SimpleBox(keyHashSha256);
        byte[] encBytes = box.seal(privKeyAmino);

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ArmoredOutputStreamImpl aOS = new ArmoredOutputStreamImpl(byteStream);
        String realSaltString = salt.substring(REAL_SALT_BEGIN_POS, REAL_SALT_BEGIN_POS + REAL_SALT_BASE64_LEN);
        byte[] realSaltByte = decode_base64(realSaltString, 16);

        aOS.setHeader("salt", Hex.toHexString(realSaltByte).toUpperCase());
        aOS.setHeader("type", "sm2");
        aOS.setHeader("kdf", "bcrypt");
        try {
            aOS.write(encBytes);
            aOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return byteStream.toString().trim();
    }
}
