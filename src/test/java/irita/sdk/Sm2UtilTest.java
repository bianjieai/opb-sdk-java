package irita.sdk;

import irita.sdk.key.Sm2KeyManager;
import irita.sdk.util.SM2Utils;
import org.bouncycastle.math.ec.ECPoint;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : ori
 * @date : 2022/10/21 14:54
 */
public class Sm2UtilTest {

	@Test
	@Disabled
	public void getPublicKeyFromHexTest() throws Exception {
		Sm2KeyManager km = new Sm2KeyManager();
		km.add();
		ECPoint publicKey = km.getCurrentKeyInfo().getPublicKey();
		String pubKeyStr = publicKey.toString();
		String[] keys = pubKeyStr.replace("(", "").replace(")", "").split(",");
		ECPoint publicKeyFromHex = SM2Utils.getPublicKeyFromHex(keys[0], keys[1]);
		assertEquals(publicKey,publicKeyFromHex);
	}

}
