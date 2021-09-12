package irita.sdk.util;

import irita.sdk.exception.IritaSDKException;
import org.bitcoinj.crypto.ChildNumber;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.MnemonicCode;
import org.bitcoinj.crypto.MnemonicException;
import org.bitcoinj.wallet.DeterministicKeyChain;
import org.bitcoinj.wallet.DeterministicSeed;
import org.bitcoinj.wallet.UnreadableWalletException;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bip44Utils {
    private static final int SHORT_WORD = 12;
    private static final int LONG_WORD = 24;

    public static String generateMnemonic() throws Exception {
        return generateMnemonic(LONG_WORD);
    }

    private static String generateMnemonic(int wordCount) throws IOException, MnemonicException.MnemonicLengthException {
        MnemonicCode mnemonicCode = new MnemonicCode();
        SecureRandom secureRandom = new SecureRandom();

        byte[] initialEntropy = getInitialEntropy(wordCount);
        secureRandom.nextBytes(initialEntropy);
        List<String> wd = mnemonicCode.toMnemonic(initialEntropy);

        if (wd == null || wd.size() != wordCount)
            throw new IritaSDKException("generate word error");

        return wordsToMnemonic(wd);
    }

    private static byte[] getInitialEntropy(int wordCount) {
        byte[] initialEntropy;
        if (wordCount == SHORT_WORD) {
            initialEntropy = new byte[16];
        } else if (wordCount == LONG_WORD) {
            initialEntropy = new byte[32];
        } else {
            throw new IritaSDKException("world count must 12 or 24");
        }
        return initialEntropy;
    }

    public static byte[] getSeed(String mnemonic) {
        List<String> words = mnemonicToWords(mnemonic);
        assert words.size() != 0;
        return MnemonicCode.toSeed(words, "");
    }

    private static List<String> mnemonicToWords(String mnemonic) {
        String[] w = mnemonic.split(" ");
        List<String> words = new ArrayList<>(w.length);
        Collections.addAll(words, w);
        return words;
    }

    private static String wordsToMnemonic(List<String> words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
        }
        return builder.toString();
    }

    public static DeterministicKey getDeterministicKey(String mnemonic, byte[] seed, String path) {
        DeterministicSeed deterministicSeed = null;
        try {
            deterministicSeed = new DeterministicSeed(mnemonic, seed, "", 0);
        } catch (UnreadableWalletException e) {
            e.printStackTrace();
        }

        DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed(deterministicSeed).build();
        return deterministicKeyChain.getKeyByPath(parsePath(path), true);
    }

    private static List<ChildNumber> parsePath(String path) {
        String[] parsedNodes = path.replace("m", "").split("/");
        List<ChildNumber> nodes = new ArrayList<>();

        for (String n : parsedNodes) {
            n = n.replaceAll(" ", "");
            if (n.length() == 0) continue;
            boolean isHard = n.endsWith("'");
            if (isHard) n = n.substring(0, n.length() - 1);
            int nodeNumber = Integer.parseInt(n);
            nodes.add(new ChildNumber(nodeNumber, isHard));
        }

        return nodes;
    }
}
