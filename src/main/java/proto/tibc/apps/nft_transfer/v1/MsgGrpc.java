package proto.tibc.apps.nft_transfer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Msg defines the tibc/nftTransfer Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: tibc/apps/nft_transfer/v1/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "tibc.apps.nft_transfer.v1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer,
      proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> getNftTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NftTransfer",
      requestType = proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer.class,
      responseType = proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer,
      proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> getNftTransferMethod() {
    io.grpc.MethodDescriptor<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer, proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> getNftTransferMethod;
    if ((getNftTransferMethod = MsgGrpc.getNftTransferMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getNftTransferMethod = MsgGrpc.getNftTransferMethod) == null) {
          MsgGrpc.getNftTransferMethod = getNftTransferMethod = 
              io.grpc.MethodDescriptor.<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer, proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tibc.apps.nft_transfer.v1.Msg", "NftTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("NftTransfer"))
                  .build();
          }
        }
     }
     return getNftTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    return new MsgStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MsgBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MsgFutureStub(channel);
  }

  /**
   * <pre>
   * Msg defines the tibc/nftTransfer Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * NftTransfer defines a rpc handler method for MsgNftTransfer.
     * </pre>
     */
    public void nftTransfer(proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer request,
        io.grpc.stub.StreamObserver<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNftTransferMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNftTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer,
                proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse>(
                  this, METHODID_NFT_TRANSFER)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/nftTransfer Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractStub<MsgStub> {
    private MsgStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * NftTransfer defines a rpc handler method for MsgNftTransfer.
     * </pre>
     */
    public void nftTransfer(proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer request,
        io.grpc.stub.StreamObserver<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNftTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/nftTransfer Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractStub<MsgBlockingStub> {
    private MsgBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * NftTransfer defines a rpc handler method for MsgNftTransfer.
     * </pre>
     */
    public proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse nftTransfer(proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer request) {
      return blockingUnaryCall(
          getChannel(), getNftTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the tibc/nftTransfer Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractStub<MsgFutureStub> {
    private MsgFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MsgFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MsgFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * NftTransfer defines a rpc handler method for MsgNftTransfer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse> nftTransfer(
        proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer request) {
      return futureUnaryCall(
          getChannel().newCall(getNftTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NFT_TRANSFER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MsgImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MsgImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NFT_TRANSFER:
          serviceImpl.nftTransfer((proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransfer) request,
              (io.grpc.stub.StreamObserver<proto.tibc.apps.nft_transfer.v1.Tx.MsgNftTransferResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MsgBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.tibc.apps.nft_transfer.v1.Tx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Msg");
    }
  }

  private static final class MsgFileDescriptorSupplier
      extends MsgBaseDescriptorSupplier {
    MsgFileDescriptorSupplier() {}
  }

  private static final class MsgMethodDescriptorSupplier
      extends MsgBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MsgMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MsgGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MsgFileDescriptorSupplier())
              .addMethod(getNftTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
