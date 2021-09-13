package irita.sdk.util;

import org.bitcoinj.core.Bech32;

public class Bech32Utils {

    public static String toBech32(String hrp, byte[] pubkeyHex) {
        byte[] bits = AddressUtils.convertBits(pubkeyHex, 0, pubkeyHex.length, 8, 5, true);
        return Bech32.encode(hrp, bits);
    }

    public static byte[] fromBech32(String address) {
        Bech32.Bech32Data data = Bech32.decode(address);
        byte[] bits = AddressUtils.convertBits(data.data, 0, data.data.length, 5, 8, true);
        return bits;
    }
}
