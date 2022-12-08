package irita.sdk.client;

import io.grpc.*;
import irita.sdk.config.OpbConfig;

import java.util.Optional;

public class GrpcBSNInterceptor implements ClientInterceptor {
    private final OpbConfig opbConfig;
    private final Metadata.Key<String> PROJECT_ID_HEADER = Metadata.Key.of("projectIdHeader", Metadata.ASCII_STRING_MARSHALLER);
    private final Metadata.Key<String> PROJECT_KEY_HEADER = Metadata.Key.of("projectKeyHeader", Metadata.ASCII_STRING_MARSHALLER);
    private final Metadata.Key<String> CHAIN_ACCOUNT_ADDRESS_HEADER = Metadata.Key.of("chainAccountAddressHeader", Metadata.ASCII_STRING_MARSHALLER);

    public GrpcBSNInterceptor(OpbConfig opbConfig) {
        this.opbConfig = opbConfig;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                if (opbConfig != null) {
                    headers.put(PROJECT_ID_HEADER, Optional.ofNullable(opbConfig.getProjectID()).orElse(""));
                    headers.put(PROJECT_KEY_HEADER, Optional.ofNullable(opbConfig.getProjectKey()).orElse(""));
                    headers.put(CHAIN_ACCOUNT_ADDRESS_HEADER, Optional.ofNullable(opbConfig.getChainAccountAddr()).orElse(""));
                    if (opbConfig.getHeader() != null){
                        for (String key : opbConfig.getHeader().keySet()){
                            headers.put(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), Optional.ofNullable(opbConfig.getHeader().get(key)).orElse(""));
                        }
                    }
                }
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };
    }
}
