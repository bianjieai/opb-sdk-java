package irita.sdk.constant.enums;

public enum Role {
    SUPER_ADMIN((byte) 0),
    ADMIN((byte) 1),
    HASH_ADMIN((byte) 2),
    ;

    private final byte value;

    Role(byte role) {
        this.value = role;
    }

    public byte getValue() {
        return value;
    }
}
