package irita.sdk.constant.enums;

public enum EventEnum {
    STORE_CODE_CODE_ID("store_code", "code_id"),
    INSTANTIATE_CONTRACT_ADDRESS("instantiate", "_contract_address"),
    CREATE_CONTEXT_REQUEST_CONTEXT_ID("create_context", "request_context_id"),
    CREATE_RECORD_RECORD_ID("create_record", "record_id"),
    ;

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
