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

	private String hrp = Constant.DEFAULT_HRP;
	protected KeyDAO keyDAO;

	public KeyManager() {
		this.keyDAO = new MemoryKeyDAO();
	}

	public KeyManager(KeyDAO keyDAO){
		if (keyDAO != null) {
			this.keyDAO = keyDAO;
		} else {
			this.keyDAO = new MemoryKeyDAO();
		}
	}

	public abstract AlgoEnum getAlgo();

	public abstract KeyInfo toKeyInfo(BigInteger privKey);

	@Override
	public abstract String toAddr(byte[] publicKey);

	public KeyInfo getCurrentKeyInfo() {
		return keyDAO.read(Constant.DEFAULT_USER_NAME, null);
	}

	public KeyDAO getKeyDAO() {
		return keyDAO;
	}

	public String getHrp() {
		return hrp;
	}

	public void setHrp(String hrp) {
		this.hrp = hrp;
	}

	@Override
	public String add() throws Exception {
		return add(Constant.DEFAULT_USER_NAME, null);
	}

	@Override
	public String add(String name, String password) throws Exception {
		String mnemonic = Bip44Utils.generateMnemonic();
		recover(name, password, mnemonic);
		return mnemonic;
	}

	@Override
	public void recover(String mnemonic) {
		recover(mnemonic, Constant.DEFAULT_INDEX);
	}

	@Override
	public void recover(String mnemonic, int index) {
		recover(Constant.DEFAULT_USER_NAME, null, mnemonic, index);
	}

	@Override
	public void recover(String name, String password, String mnemonic) {
		recover(name, password, mnemonic, Constant.DEFAULT_INDEX);
	}

	@Override
	public void recover(String name, String password, InputStream keystore) {
		recover(name, password, toPrivKey(keystore, password));
	}

	@Override
	public void recover(InputStream keystore, String password) {
		recover(Constant.DEFAULT_USER_NAME, password, keystore);
	}

	@Override
	public void recoverFromCert(InputStream caKeystore, String password) {
		try {
			recoverFromCert(Constant.DEFAULT_USER_NAME, password, caKeystore);
		} catch (UnrecoverableKeyException | CertificateException | KeyStoreException | IOException | NoSuchAlgorithmException | NoSuchProviderException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void recoverFromCert(String name, String password, InputStream caKeystore) throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, IOException {
		recover(name, password, caToPrivKey(caKeystore, password));
	}

	@Override
	public void recover(String name, String password, String mnemonic, int index) {
		recover(name, password, toPrivKey(mnemonic, index));
	}

	@Override
	public void recover(BigInteger privKey) {
		recover(Constant.DEFAULT_USER_NAME, null, privKey);
	}

	@Override
	public void recover(String name, String password, BigInteger privKey) {
		if (!name.equals(Constant.DEFAULT_USER_NAME) && keyDAO.has(name)) {
			throw new IritaSDKException(String.format("name %s has existed", name));
		}
		keyDAO.write(name, password, toKeyInfo(privKey));
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


	private BigInteger caToPrivKey(InputStream caKeystore, String password) throws KeyStoreException, NoSuchProviderException, IOException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException {
		Security.addProvider(new BouncyCastleProvider());
		KeyStore ks = KeyStore.getInstance("PKCS12", "BC");
		ks.load(caKeystore, password.toCharArray());
		BCECPrivateKey privateKey = (BCECPrivateKey) ks.getKey("signKey", password.toCharArray());
		return privateKey.getD();
	}

	private BigInteger toPrivKey(String mnemonic, int index) {
		byte[] seed = Bip44Utils.getSeed(mnemonic);
		String keyPath = Constant.BIP44_PREFIX + Constant.PARTIAL_PATH + index;
		DeterministicKey dk = Bip44Utils.getDeterministicKey(mnemonic, seed, keyPath);
		return dk.getPrivKey();
	}

	private BigInteger toPrivKey(InputStream keystore, String password) {
		BigInteger privKey;
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
			privKey = new BigInteger(1, privKeyTemp);
		} catch (IOException e) {
			throw new IritaSDKException("recover failed", e);
		}
		return privKey;
	}

	public byte[] getPrefixAmino(String algoPrivKeyName) {
		byte[] hash = HashUtils.sha256(algoPrivKeyName.getBytes(StandardCharsets.UTF_8));
		int ptr = 0;
		while (hash[ptr] == 0) {
			ptr++;
		}
		ptr += 3;
		while (hash[ptr] == 0) {
			ptr++;
		}
		byte[] prefix = new byte[5];
		System.arraycopy(hash, ptr, prefix, 0, 4);
		prefix[4] = 32;
		return prefix;
	}
}
