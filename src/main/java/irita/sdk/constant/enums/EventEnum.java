package irita.sdk.constant.enums;

public enum EventEnum {
    MESSAGE_CODE_ID("message", "code_id"),
    MESSAGE_CONTRACT_ADDRESS("message", "contract_address");

    private final String type;
    private final String key;

    EventEnum(String type, String key) {
        this.type = type;
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public String getKey() {
        return key;
    }
}
