package irita.sdk.client;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;
import irita.sdk.config.ClientConfig;
import irita.sdk.config.OpbConfig;
import irita.sdk.exception.IritaSDKException;

import java.io.IOException;
import java.security.cert.X509Certificate;

public class GrpcFactory {
    private static final String HTTP_PREFIX = "http://";
    private static final String HTTPS_PREFIX = "https://";

    public static Channel createGrpcClient(ClientConfig cliConfig, OpbConfig opbConfig) {
        return createGrpcClient(cliConfig.getGrpcAddr(), opbConfig);
    }

    public static Channel createGrpcClient(String grpcAddr, OpbConfig opbConfig) {
        grpcAddr = removePrefix(grpcAddr);

        String[] split = grpcAddr.split(":");
        if (split.length != 2) {
            throw new IritaSDKException("grpcAddr:\t" + grpcAddr + "is not correct");
        }
        return createGrpcClient(split[0], Integer.parseInt(split[1]), opbConfig);
    }

    public static Channel createGrpcClient(String name, int port, OpbConfig opbConfig) {
        name = removePrefix(name);
        Channel channel = ManagedChannelBuilder.forAddress(name, port).usePlaintext().build();
        channel = ClientInterceptors.intercept(channel, new GrpcBSNInterceptor(opbConfig));
        return channel;
    }

    public static Channel createGrpcClient(ClientConfig cliConfig, OpbConfig opbConfig, X509Certificate[] certificates) throws IOException {
        return createGrpcClient(cliConfig.getGrpcAddr(), opbConfig, certificates);
    }

    public static Channel createGrpcClient(String grpcAddr, OpbConfig opbConfig, X509Certificate[] certificates) throws IOException {
        grpcAddr = removePrefix(grpcAddr);

        String[] split = grpcAddr.split(":");
        if (split.length != 2) {
            throw new IritaSDKException("grpcAddr:\t" + grpcAddr + "is not correct");
        }
        return createGrpcClient(split[0], Integer.parseInt(split[1]), opbConfig, certificates);
    }

    public static Channel createGrpcClient(String name, int port, OpbConfig opbConfig, X509Certificate[] certificates) throws IOException {
        name = removePrefix(name);
        Channel channel;
        if (opbConfig.getSslProvider() != null) {
            channel = NettyChannelBuilder.forAddress(name, port)
                    .negotiationType(NegotiationType.TLS)
                    .sslContext(buildSslContextWithProvider(certificates, opbConfig.getSslProvider()))
                    .build();
        } else {
            channel = NettyChannelBuilder.forAddress(name, port)
                    .negotiationType(NegotiationType.TLS)
                    .sslContext(buildSslContext(certificates))
                    .build();
        }
        channel = ClientInterceptors.intercept(channel, new GrpcBSNInterceptor(opbConfig));
        return channel;
    }

    public static SslContext buildSslContext(X509Certificate[] certificates) throws IOException {
        SslContextBuilder builder = GrpcSslContexts.forClient();
        builder.trustManager(certificates);
        return builder.build();
    }

    public static SslContext buildSslContextWithProvider(X509Certificate[] certificates, SslProvider sslProvider) throws IOException {
        SslContextBuilder builder = GrpcSslContexts.configure(SslContextBuilder.forClient(), sslProvider);
        builder.trustManager(certificates);
        return builder.build();
    }

    private static String removePrefix(String grpcAddr) {
        if (grpcAddr.startsWith(HTTP_PREFIX)) {
            grpcAddr = grpcAddr.substring(HTTP_PREFIX.length());
        }
        if (grpcAddr.startsWith(HTTPS_PREFIX)) {
            grpcAddr = grpcAddr.substring(HTTPS_PREFIX.length());
        }
        return grpcAddr;
    }
}
