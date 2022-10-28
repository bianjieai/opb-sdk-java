package irita.sdk.key;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import proto.cosmos.crypto.sm2.Keys;

import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author : ori
 * @date : 2022/10/27 18:51
 */
public enum KeyEnum {
	/**
	 * 国密公钥
	 */
	SM2_PUBKEY("/cosmos.crypto.sm2.PubKey", Keys.PubKey.class, AlgoEnum.SM2, o -> {
		try {
			return o.unpack(Keys.PubKey.class).getKey().toByteArray();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}),
	/**
	 * 国密私钥
	 */
	SM2_PRIV_KEY("/cosmos.crypto.sm2.PrivKey", proto.cosmos.crypto.sm2.Keys.PrivKey.class, AlgoEnum.SM2, o -> {
		try {
			return o.unpack(proto.cosmos.crypto.sm2.Keys.PrivKey.class).getKey().toByteArray();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}),
	/**
	 * secp256k1 公钥
	 */
	SECP256K1_PUBKEY("/cosmos.crypto.secp256k1.PubKey", proto.cosmos.crypto.secp256k1.Keys.PubKey.class, AlgoEnum.SECP256K1, o -> {
		try {
			return o.unpack(proto.cosmos.crypto.secp256k1.Keys.PubKey.class).getKey().toByteArray();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}),
	/**
	 * secp256k1 私钥
	 */
	SECP256K1_PRIV_KEY("/cosmos.crypto.secp256k1.PrivKey", proto.cosmos.crypto.secp256k1.Keys.PrivKey.class, AlgoEnum.SECP256K1, o -> {
		try {
			return o.unpack(proto.cosmos.crypto.secp256k1.Keys.PrivKey.class).getKey().toByteArray();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
			return new byte[]{};
		}
	}),
	;

	private final String typeUrl;
	private final Class<?> className;
	private final AlgoEnum algo;
	private final Function<Any, byte[]> function;

	KeyEnum(String typeUrl, Class<?> className, AlgoEnum algo, Function<Any, byte[]> function) {
		this.typeUrl = typeUrl;
		this.className = className;
		this.algo = algo;
		this.function = function;
	}

	public static KeyEnum tryMatch(Any keyAny) throws NoSuchElementException {
		KeyEnum[] enums = KeyEnum.values();
		for (KeyEnum keyEnum : enums) {
			if (keyEnum.typeUrl.equals(keyAny.getTypeUrl())) {
				return keyEnum;
			}
		}
		throw new NoSuchElementException(keyAny.getTypeUrl());
	}

	public static byte[] tryParseKey(Any keyAny) throws NoSuchElementException {
		KeyEnum keyEnum = tryMatch(keyAny);
		return keyEnum.function.apply(keyAny);
	}

	public String getTypeUrl() {
		return typeUrl;
	}

	public Class<?> getClassName() {
		return className;
	}

	public AlgoEnum getAlgo() {
		return algo;
	}

	public Function<Any, byte[]> getFunction() {
		return function;
	}

	@Override
	public String toString() {
		return "KeyEnum{" +
				"typeUrl='" + typeUrl + '\'' +
				", className=" + className +
				", algo=" + algo +
				'}';
	}
}
