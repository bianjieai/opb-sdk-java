package irita.sdk.exception;

public class ContractException extends Exception{
    public ContractException() {
        super();
    }

    public ContractException(String message) {
        super(message);
    }

    public ContractException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContractException(Throwable cause) {
        super(cause);
    }

    protected ContractException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
