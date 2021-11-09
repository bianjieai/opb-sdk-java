package irita.sdk;

import irita.sdk.key.AlgoEnum;
import irita.sdk.key.KeyInfo;
import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyManagerTest {
    @Test
    public void recoverFromMnemonic() {
        String mnemonic = "opera vivid pride shallow brick crew found resist decade neck expect apple chalk belt sick author know try tank detail tree impact hand best";
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(mnemonic);

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void recoverFromPrivateKey() {
        BigInteger privKey = new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", 16);
        KeyManager km = KeyManagerFactory.createKeyManger(AlgoEnum.SM2);
        km.recover(privKey);

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void export() {
        BigInteger privKey = new BigInteger("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", 16);
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(privKey);

        String keystore = km.export("123456");
        System.out.println(keystore);
    }

    @Test
    @Tag("read keystore from str")
    public void recoverFromKeystore1() throws IOException {
        String keystore = "-----BEGIN TENDERMINT PRIVATE KEY-----\n" +
                "salt: 183EF9B57DEF8EF8C3AD9D21DE672E1B\n" +
                "type: sm2\n" +
                "kdf: bcrypt\n" +
                "\n" +
                "cpreEPwi0X3yIdsAIf94fR6s8L1TnDAQd/r4ifID6GmQX5a+4ehMmnTp2JjDpUe5\n" +
                "kpgRI7CzF0DjKpPLvY9V9ZSXJFN42LHWscxqQ1E=\n" +
                "=nJvd\n" +
                "-----END TENDERMINT PRIVATE KEY-----";

        InputStream input = new ByteArrayInputStream(keystore.getBytes(StandardCharsets.UTF_8));
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(input, "123456");

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    @Tag("read keystore from file")
    public void recoverFromKeystore2() throws IOException {
        FileInputStream input = new FileInputStream("src/test/resources/priv.key");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(input, "123456");

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    public void recoverFromCAKeystore() throws Exception {
        FileInputStream input = new FileInputStream("src/test/resources/ca.JKS");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recoverFromCA(input, "123456");

        assertEquals("iaa1sul8jyesxq5nuwstyj5lzzsdc2sedeehl365qk", km.getCurrentKeyInfo().getAddress());
    }

    @Test
    public void addNewKm() throws Exception {
        KeyManager km = KeyManagerFactory.createDefault();
        String mnemonic = km.add();
        System.out.println(mnemonic);
    }
}
