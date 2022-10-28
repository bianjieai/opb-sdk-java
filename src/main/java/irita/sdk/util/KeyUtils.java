package irita.sdk.util;

import com.google.protobuf.Any;
import irita.sdk.key.KeyEnum;
import irita.sdk.key.KeyManagerFactory;

/**
 * @author : ori
 * @date : 2022/10/27 19:42
 */
public class KeyUtils {
	public static String parseAddrFromPubKeyAny(Any pubKey) {
		KeyEnum keyEnum = KeyEnum.tryMatch(pubKey);
		return KeyManagerFactory
				.createKeyManager(keyEnum.getAlgo())
				.toAddr(
						keyEnum.getFunction()
								.apply(pubKey)
				);
	}
}
