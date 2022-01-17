package irita.sdk.key;

import irita.sdk.constant.Armored;

public enum AlgoEnum {
    SECP256K1("secp256k1", Armored.SECP256K1_RIV_KEY_NAME),
    SM2("sm2", Armored.SM2_PRIV_KEY_NAME);


    private final String name;
    private final String privKeyName;

    AlgoEnum(String name, String privKeyName) {
        this.name = name;
        this.privKeyName = privKeyName;
    }

    public String getName() {
        return name;
    }

    public String getPrivKeyName() {
        return privKeyName;
    }
}
