package irita.sdk.exception;

/**
 * @author : ori
 * @date : 2022/4/18 18:38
 */
public class UnknownMsgException extends IritaSDKException {
	public UnknownMsgException(String typeUrl) {
		super(String.format("not support this typUrl %s", typeUrl));
	}
}
