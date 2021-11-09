package irita.sdk.util;

import java.math.BigInteger;
import java.util.Random;

// copy from web3j
public class ByteUtils {
    public static byte[] addAll(byte[] array1, byte... array2) {
        byte[] joinedArray = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return joinedArray;

    }

    public static byte[] toBytesPadded(BigInteger value, int length) {
        byte[] result = new byte[length];
        byte[] bytes = value.toByteArray();
        int bytesLength;
        byte srcOffset;
        if (bytes[0] == 0) {
            bytesLength = bytes.length - 1;
            srcOffset = 1;
        } else {
            bytesLength = bytes.length;
            srcOffset = 0;
        }

        if (bytesLength > length) {
            throw new RuntimeException("Input is too large to put in byte array of size " + length);
        } else {
            int destOffset = length - bytesLength;
            System.arraycopy(bytes, srcOffset, result, destOffset, bytesLength);
            return result;
        }
    }
    public static String getRandomStr(int bytes){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < bytes; i++) {
            //随机判断判断该字符是数字还是字母
            String choice = random.nextInt(2) % 2 == 0 ? "char" : "num";
            if ("char".equalsIgnoreCase(choice)) {
                //随机判断是大写字母还是小写字母
                int start = random.nextInt(2) % 2 == 0 ? 65 : 97;
                sb.append((char) (start + random.nextInt(26)));
            } else if ("num".equalsIgnoreCase(choice)) {
                sb.append(random.nextInt(10));
            }
        }
        return sb.toString();
    }


}
