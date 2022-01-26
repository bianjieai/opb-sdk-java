package irita.sdk.util;

import org.bitcoinj.core.Bech32;
import org.bouncycastle.util.encoders.Hex;

public class Bech32Utils {

    public static String toBech32(String hrp, byte[] pubkeyHex) {
        byte[] bits = AddressUtils.convertBits(pubkeyHex, 0, pubkeyHex.length, 8, 5, true);
        return Bech32.encode(Bech32.Encoding.BECH32, hrp, bits);
    }

    public static byte[] fromBech32(String address) {
        Bech32.Bech32Data data = Bech32.decode(address);
        byte[] bits = AddressUtils.convertBits(data.data, 0, data.data.length, 5, 8, true);
        return bits;
    }

    public static String bech32ToHex(String address) {
        return Hex.toHexString(fromBech32(address)).toUpperCase();
    }

    public static String hexToBech32(String hrp, String hexAddress) {
        return toBech32(hrp, Hex.decode(hexAddress));
    }
}
