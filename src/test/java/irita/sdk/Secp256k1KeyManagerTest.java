package irita.sdk;

import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Secp256k1KeyManagerTest {
    @Test
    public void recoverFromMnemonic() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(mnemonic);

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1fwgw9ej3yzq6frn8rq7pswfhkdcsq8szsff7ka", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void recoverFromPrivateKey() {
        BigInteger privKey = new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", 16);
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(privKey);

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1fwgw9ej3yzq6frn8rq7pswfhkdcsq8szsff7ka", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void export() {
        BigInteger privKey = new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", 16);
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(privKey);

        String keystore = km.export("1234567890");
        System.out.println(keystore);
    }

    @Test
    @Tag("read keystore from str")
    public void recoverFromKeystore() {
        String keystore = "-----BEGIN TENDERMINT PRIVATE KEY-----\n" +
                "salt: 584CE7CC551DC2F12ED7BE2FC27FB73A\n" +
                "type: secp256k1\n" +
                "kdf: bcrypt\n" +
                "\n" +
                "+s3/pD/aNSZ/7nxQBu+80Lal3qGM8nec1XOdNiZFXTbyWt3aordqmTsLuRpE4lpj\n" +
                "JK6oeN3acJYtnjtCegZ+j6ROqg42jfIsZrgrpV0=\n" +
                "=UwFf\n" +
                "-----END TENDERMINT PRIVATE KEY-----";

        InputStream input = new ByteArrayInputStream(keystore.getBytes(StandardCharsets.UTF_8));
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.SECP256K1);
        km.recover(input, "1234567890");

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1fwgw9ej3yzq6frn8rq7pswfhkdcsq8szsff7ka", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void addNewKm() throws Exception {
        KeyManager km = KeyManagerFactory.createDefault();
        String mnemonic = km.add();
        System.out.println(mnemonic);
    }
}
