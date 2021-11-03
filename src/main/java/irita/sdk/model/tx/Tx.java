package irita.sdk.model.tx;

import proto.cosmos.tx.v1beta1.TxOuterClass;

public class Tx {
    private Body body;
    private TxOuterClass.AuthInfo authInfo;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public TxOuterClass.AuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(TxOuterClass.AuthInfo authInfo) {
        this.authInfo = authInfo;
    }
}
