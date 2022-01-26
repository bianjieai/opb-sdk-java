package irita.sdk.key;

import com.codahale.xsalsa20poly1305.SimpleBox;
import irita.sdk.constant.Constant;
import irita.sdk.crypto.ArmoredInputStream;
import irita.sdk.crypto.ArmoredOutputStream;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.util.Bip44Utils;
import irita.sdk.util.HashUtils;
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
import static irita.sdk.crypto.BCryptImpl.decode_base64;
import static irita.sdk.crypto.BCryptImpl.encode_base64;

public abstract class KeyManager implements Key, MultiKey {
    // this keyPath and hrp just for iris
    private String keyPath = "m/44'/118'/0'/0/0";
    private String hrp = "iaa";
    private KeyInfo currentKeyInfo;
    protected final KeyDAO keyDAO = new MemoryKeyDAO();

    private AlgoEnum algo;

    public abstract AlgoEnum getAlgo();

    public KeyInfo getCurrentKeyInfo() {
        return currentKeyInfo;
    }

    public void setCurrentKeyInfo(KeyInfo currentKeyInfo) {
        this.currentKeyInfo = currentKeyInfo;
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
            if (!box.open(encBytes).isPresent()) {
                throw new IritaSDKException("failed decrypt keystore with password");
            }
            byte[] privKeyAmino = box.open(encBytes).get();
            byte[] privKeyTemp = Arrays.copyOfRange(privKeyAmino, 5, privKeyAmino.length);

            BigInteger privKey = new BigInteger(1, privKeyTemp);
            recover(privKey);
        } catch (IOException e) {
            throw new IritaSDKException("recover failed", e);
        }
    }

    public String export(String password, byte[] priKey) {
        byte[] prefixAmino = getPrefixAmino(getAlgo().getPrivKeyName());
        byte[] privKeyAmino;
        if (priKey.length == 33) { // priKey.length is dynamic maybe 32/33
            byte[] dest = new byte[priKey.length - 1];
            System.arraycopy(priKey, 1, dest, 0, dest.length);
            privKeyAmino = ArrayUtils.addAll(prefixAmino, dest);
        } else {
            privKeyAmino = ArrayUtils.addAll(prefixAmino, priKey);
        }

        String salt = BCrypt.gensalt(LOG_ROUNDS);
        String keyHash = BCrypt.hashpw(password, salt);
        byte[] keyHashByte = keyHash.getBytes(StandardCharsets.UTF_8);
        byte[] keyHashSha256 = HashUtils.sha256(keyHashByte);

        SimpleBox box = new SimpleBox(keyHashSha256);
        byte[] encBytes = box.seal(privKeyAmino);

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ArmoredOutputStream aOS = new ArmoredOutputStream(byteStream);
        String realSaltString = salt.substring(REAL_SALT_BEGIN_POS, REAL_SALT_BEGIN_POS + REAL_SALT_BASE64_LEN);
        byte[] realSaltByte = decode_base64(realSaltString, 16);

        aOS.setHeader("salt", Hex.toHexString(realSaltByte).toUpperCase());
        aOS.setHeader("type", getAlgo().getName());
        aOS.setHeader("kdf", "bcrypt");
        try {
            aOS.write(encBytes);
            aOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return byteStream.toString().trim();
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
        currentKeyInfo = new KeyInfo(address, publicKey, privKey);
        keyDAO.write(Constant.DEFAULT_USER_NAME, null, currentKeyInfo);
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
}
