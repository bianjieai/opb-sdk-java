package irita.sdk.client;

import io.grpc.*;
import irita.sdk.constant.Constant;

public class GrpcClientInterceptor implements ClientInterceptor {
    private final String projectKey;
    private final Metadata.Key<String> BSN_HEADER = Metadata.Key.of(Constant.OPB_PROJECT_KEY_HEADER, Metadata.ASCII_STRING_MARSHALLER);

    public GrpcClientInterceptor(String projectKey) {
        this.projectKey = projectKey;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        headers.put(BSN_HEADER, projectKey);
                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };
    }
}
