package irita.sdk.exception;

public class IritaSDKException extends RuntimeException {

    private static final long serialVersionUID = 7177887186522102117L;

    public IritaSDKException() {
    }

    public IritaSDKException(String message) {
        super(message);
    }

    public IritaSDKException(String message, Throwable cause) {
        super(message, cause);
    }

    public IritaSDKException(Throwable cause) {
        super(cause);
    }

    public IritaSDKException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
