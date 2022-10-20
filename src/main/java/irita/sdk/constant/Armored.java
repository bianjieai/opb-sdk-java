package irita.sdk.constant;

public class Armored {
	public static final String SM2_PRIV_KEY_NAME = "cosmos/PrivKeySm2";
	public static final String SECP256K1_PRIV_KEY_NAME = "tendermint/PrivKeySecp256k1";
	public static final String ETHSECP256K1_PRIV_KEY_NAME = "ethermint/PrivKeyEthSecp256k1";
	public static final String PREFIX_SALT = "$2a$12$";
	public static final int LOG_ROUNDS = 12;
	public static final int REAL_SALT_BEGIN_POS = 7;
	public static final int REAL_SALT_BASE64_LEN = 22;
}
