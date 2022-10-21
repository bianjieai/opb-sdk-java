package irita.sdk.key;

import irita.sdk.exception.IritaSDKException;

/**
 * @author bianjie
 */
public class KeyManagerFactory {

	private static KeyManagerFactory instance;

	private AlgoEnum algoEnum;
	private KeyDAO keyDAO;

	private KeyManagerFactory() {
		algoEnum = AlgoEnum.SM2;
	}

	public static KeyManagerFactory getInstance() {
		if (instance == null) {
			instance = new KeyManagerFactory();
		}
		return instance;
	}

	public KeyManagerFactory setAlgoEnum(AlgoEnum algoEnum) {
		if (algoEnum == null) {
			throw new IritaSDKException("key algo can't be null");
		}
		this.algoEnum = algoEnum;
		return this;
	}

	public KeyManagerFactory setKeyDAO(KeyDAO keyDAO) {
		this.keyDAO = keyDAO;
		return this;
	}

	public KeyManager build() {
		switch (this.algoEnum) {
			case SM2:
				return new Sm2KeyManager(this.keyDAO);
			case SECP256K1:
				return new Secp256k1KeyManger(this.keyDAO);
			case ETH_SECP256K1:
				return new EthSecp256k1KeyManger(this.keyDAO);
			default:
				throw new RuntimeException("unknown algo");
		}
	}

	/**
	 * create KeyManager with given algo
	 *
	 * @param algo
	 * @return
	 */
	public static KeyManager createKeyManger(AlgoEnum algo) {
		KeyManager keyManager;
		synchronized (KeyManagerFactory.class) {
			keyManager = getInstance()
					.setAlgoEnum(algo)
					.build();
		}
		return keyManager;
	}

	/**
	 * @return a KeyManager with default algo `SM2`
	 */
	public static KeyManager createDefault() {
		return createKeyManger(AlgoEnum.SM2);
	}
}
