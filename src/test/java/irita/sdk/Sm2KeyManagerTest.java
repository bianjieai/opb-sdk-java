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

public class Sm2KeyManagerTest {
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

        String keystore = km.export("1234567890");
        System.out.println(keystore);
    }

    @Test
    @Tag("read keystore from str")
    public void recoverFromKeystore1() {
        String keystore = "-----BEGIN TENDERMINT PRIVATE KEY-----\n" +
                "salt: 4C36B74DE23723FD901959F38A98B265\n" +
                "type: sm2\n" +
                "kdf: bcrypt\n" +
                "\n" +
                "tqltk3bgDpJZuAtw2GDNfuJ7lybzcMdDJGWa5DuMZp/BMITl8yI2eoApNt1oenCg\n" +
                "3Ts31l03VQcHvoqloQ/rNOfKBoDrKVbt8QSodKI=\n" +
                "=1gIS\n" +
                "-----END TENDERMINT PRIVATE KEY-----";

        InputStream input = new ByteArrayInputStream(keystore.getBytes(StandardCharsets.UTF_8));
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(input, "1234567890");

        KeyInfo keyInfo = km.getCurrentKeyInfo();
        assertEquals("iaa1ytemz2xqq2s73ut3ys8mcd6zca2564a5lfhtm3", keyInfo.getAddress());
        assertEquals("3c49175daf981965679bf88d2690e22144424e16c84e9d397ddb58b63603eeec", keyInfo.getPrivKey().toString(16));
    }

    @Test
    @Tag("read keystore from file")
    public void recoverFromKeystore2() throws IOException {
        FileInputStream input = new FileInputStream("src/test/resources/priv.key");
        KeyManager km = KeyManagerFactory.createDefault();
        km.recover(input, "1234567890");

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
