package irita.sdk.constant;

public class Constant {
	public static final String OPB_PROJECT_KEY_HEADER = "x-api-key";
	public static final String DEFAULT_USER_NAME = "default_username";
	public static final Integer DEFAULT_INDEX = 0;

	// this keyPath and hrp just for iris

	public static final String BIP44_PREFIX = "m/44'/118'/";
	public static final String PARTIAL_PATH = "0'/0/";
	public static final String DEFAULT_HRP = "iaa";

	public static final String IRITA_EVM_CHAIN_ID = "1223";
	public static final String IRITA_EVM_CHAIN_ID_MUL = "2";

	public static final String DYNAMIC_FEE_TX = "/ethermint.evm.v1.DynamicFeeTx";
	public static final String LEGACY_TX = "/ethermint.evm.v1.LegacyTx";
	public static final String ACCESS_LIST_TX = "/ethermint.evm.v1.AccessListTx";
}
