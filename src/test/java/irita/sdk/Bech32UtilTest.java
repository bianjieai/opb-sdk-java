package irita.sdk;

import irita.sdk.key.KeyManager;
import irita.sdk.key.KeyManagerFactory;
import irita.sdk.util.Bech32Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bech32UtilTest {
    @Test
    public void Bech32ToHex() {
        String bech32Addr = "iaa185m3p92xjmny8nnuzc6lpmj5lvy884q4k9ey5c";
        String hexAddr = "3D3710954696E643CE7C1635F0EE54FB0873D415";
        assertEquals(hexAddr, Bech32Utils.bech32ToHex(bech32Addr));
    }

    @Test
    public void HexToBech32() {
        String bech32Addr = "iaa185m3p92xjmny8nnuzc6lpmj5lvy884q4k9ey5c";
        String hexAddr = "3D3710954696E643CE7C1635F0EE54FB0873D415";
        KeyManager km = KeyManagerFactory.createDefault();
        String bech32 = Bech32Utils.hexToBech32(km.getHrp(), hexAddr);
        assertEquals(bech32Addr, bech32);
    }
}
