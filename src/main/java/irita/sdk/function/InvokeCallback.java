package irita.sdk.function;

// InvokeCallback defines the callback function for service calls
@FunctionalInterface
public interface InvokeCallback {
    void accept(String reqCtxID, String reqID, String output);
}
