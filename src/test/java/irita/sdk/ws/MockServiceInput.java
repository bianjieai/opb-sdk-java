package irita.sdk.ws;

public class MockServiceInput {
    private irita.sdk.ws.Header Header;
    private Body body;

    public irita.sdk.ws.Header getHeader() {
        return Header;
    }

    public MockServiceInput setHeader(irita.sdk.ws.Header header) {
        Header = header;
        return this;
    }

    public Body getBody() {
        return body;
    }

    public MockServiceInput setBody(Body body) {
        this.body = body;
        return this;
    }
}
