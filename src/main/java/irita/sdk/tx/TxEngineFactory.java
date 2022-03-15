package irita.sdk.tx;

import irita.sdk.key.KeyManager;

public class TxEngineFactory {
    private TxEngineFactory() {
    }

    public static TxEngine createTxEngine(KeyManager km, String chainID) {
        switch (km.getAlgo()) {
            case SM2:
                return new Sm2TxEngine(km, chainID);
            case SECP256K1:
                return new Secp256k1TxEngine(km, chainID);
            case ETH_SECP256K1:
                return new EthSecp256k1TxEngine(km, chainID);
            default:
                throw new RuntimeException("panic");
        }
    }

    public static TxEngine createDefault(KeyManager km, String chainID) {
        return new Sm2TxEngine(km, chainID);
    }
}
