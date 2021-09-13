package irita.sdk.module.wasm;

// ContractInfo stores a WASM contract instance
public class ContractInfo {
    /**
     * CodeID is the reference to the stored Wasm code
     * Creator address who initially instantiated the contract
     * Admin is an optional address that can execute migrations
     * Label is optional metadata to be stored with a contract instance.
     * Created Tx position when the contract was instantiated.
     * <p>
     * This data should kept internal and not be exposed via query results. Just use for sorting
     */
    private long codeId;
    private String creator;
    private String admin;
    private String label;
    private AbsoluteTxPosition created;


    public static class AbsoluteTxPosition {
        long BlockHeight;
        long TxIndex;
    }

    public long getCodeId() {
        return codeId;
    }

    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AbsoluteTxPosition getCreated() {
        return created;
    }

    public void setCreated(AbsoluteTxPosition created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "ContractInfo{" +
                "codeId=" + codeId +
                ", creator='" + creator + '\'' +
                ", admin='" + admin + '\'' +
                ", label='" + label + '\'' +
                ", created=" + created +
                '}';
    }
}
