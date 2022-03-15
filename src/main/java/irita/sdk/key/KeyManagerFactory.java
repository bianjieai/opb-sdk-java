package irita.sdk.key;

public class KeyManagerFactory {
    private KeyManagerFactory() {
    }

    public static KeyManager createKeyManger(AlgoEnum algo) {
        switch (algo) {
            case SM2:
                return new Sm2KeyManager();
            case SECP256K1:
                return new Secp256k1KeyManger();
            case ETH_SECP256K1:
                return new EthSecp256k1KeyManger();
            default:
                throw new RuntimeException("panic");
        }
    }

    public static KeyManager createDefault() {
        return new Sm2KeyManager();
    }
}
