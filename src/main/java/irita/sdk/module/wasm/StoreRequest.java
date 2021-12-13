package irita.sdk.module.wasm;

import proto.cosmwasm.wasm.v1.Types;

// StoreRequest define a struct for Store method
public class StoreRequest {
    /**
     * WASMByteCode can be raw or gzip compressed
     * WASMFile can be raw or gzip file
     * Source is a valid absolute HTTPS URI to the contract's source code, optional
     * Builder is a valid docker image name with tag, optional
     * InstantiatePermission access control to apply on contract creation, optional
     */
    private byte[] wasmByteCode;
    private String wasmFile;
    private String source;
    private String builder;
    private Types.AccessConfig permission;

    public byte[] getWasmByteCode() {
        return wasmByteCode;
    }

    public void setWasmByteCode(byte[] wasmByteCode) {
        this.wasmByteCode = wasmByteCode;
    }

    public String getWasmFile() {
        return wasmFile;
    }

    public void setWasmFile(String wasmFile) {
        this.wasmFile = wasmFile;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public Types.AccessConfig getPermission() {
        return permission;
    }

    public void setPermission(Types.AccessConfig permission) {
        this.permission = permission;
    }
}



