package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;
import org.bitcoinj.core.AddressFormatException;

import java.io.ByteArrayOutputStream;

public class AddressUtils {

    public static void validAddress(String address) throws IritaSDKException {
        try {

            Bech32Utils.fromBech32(address);
        } catch (Exception e) {
            throw new IritaSDKException("address is illegal, reason:" + e.getMessage());
        }
    }

    /**
     * Helper for re-arranging bits into groups.
     */
    public static byte[] convertBits(final byte[] in, final int inStart, final int inLen, final int fromBits,
                                     final int toBits, final boolean pad) throws AddressFormatException {
        int acc = 0;
        int bits = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream(64);
        final int maxv = (1 << toBits) - 1;
        final int max_acc = (1 << (fromBits + toBits - 1)) - 1;
        for (int i = 0; i < inLen; i++) {
            int value = in[i + inStart] & 0xff;
            if ((value >>> fromBits) != 0) {
                throw new AddressFormatException(
                        String.format("Input value '%X' exceeds '%d' bit size", value, fromBits));
            }
            acc = ((acc << fromBits) | value) & max_acc;
            bits += fromBits;
            while (bits >= toBits) {
                bits -= toBits;
                out.write((acc >>> bits) & maxv);
            }
        }
        if (pad) {
            if (bits > 0)
                out.write((acc << (toBits - bits)) & maxv);
        } else if (bits >= fromBits || ((acc << (toBits - bits)) & maxv) != 0) {
            throw new AddressFormatException("Could not convert bits, invalid padding");
        }
        return out.toByteArray();
    }

}
