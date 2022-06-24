package proto.opb;

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
 * Msg defines the OPB Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: opb/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irita.opb.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.opb.Tx.MsgMint,
      proto.opb.Tx.MsgMintResponse> getMintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Mint",
      requestType = proto.opb.Tx.MsgMint.class,
      responseType = proto.opb.Tx.MsgMintResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.opb.Tx.MsgMint,
      proto.opb.Tx.MsgMintResponse> getMintMethod() {
    io.grpc.MethodDescriptor<proto.opb.Tx.MsgMint, proto.opb.Tx.MsgMintResponse> getMintMethod;
    if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintMethod = MsgGrpc.getMintMethod) == null) {
          MsgGrpc.getMintMethod = getMintMethod = 
              io.grpc.MethodDescriptor.<proto.opb.Tx.MsgMint, proto.opb.Tx.MsgMintResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irita.opb.Msg", "Mint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.opb.Tx.MsgMint.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.opb.Tx.MsgMintResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Mint"))
                  .build();
          }
        }
     }
     return getMintMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.opb.Tx.MsgReclaim,
      proto.opb.Tx.MsgReclaimResponse> getReclaimMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reclaim",
      requestType = proto.opb.Tx.MsgReclaim.class,
      responseType = proto.opb.Tx.MsgReclaimResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.opb.Tx.MsgReclaim,
      proto.opb.Tx.MsgReclaimResponse> getReclaimMethod() {
    io.grpc.MethodDescriptor<proto.opb.Tx.MsgReclaim, proto.opb.Tx.MsgReclaimResponse> getReclaimMethod;
    if ((getReclaimMethod = MsgGrpc.getReclaimMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getReclaimMethod = MsgGrpc.getReclaimMethod) == null) {
          MsgGrpc.getReclaimMethod = getReclaimMethod = 
              io.grpc.MethodDescriptor.<proto.opb.Tx.MsgReclaim, proto.opb.Tx.MsgReclaimResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irita.opb.Msg", "Reclaim"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.opb.Tx.MsgReclaim.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.opb.Tx.MsgReclaimResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("Reclaim"))
                  .build();
          }
        }
     }
     return getReclaimMethod;
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
   * Msg defines the OPB Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Mint defines a method for minting the base native token.
     * </pre>
     */
    public void mint(proto.opb.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<proto.opb.Tx.MsgMintResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMintMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reclaim defines a method for reclaiming the specified native token
     * from the corresponding escrow.
     * </pre>
     */
    public void reclaim(proto.opb.Tx.MsgReclaim request,
        io.grpc.stub.StreamObserver<proto.opb.Tx.MsgReclaimResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReclaimMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.opb.Tx.MsgMint,
                proto.opb.Tx.MsgMintResponse>(
                  this, METHODID_MINT)))
          .addMethod(
            getReclaimMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.opb.Tx.MsgReclaim,
                proto.opb.Tx.MsgReclaimResponse>(
                  this, METHODID_RECLAIM)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the OPB Msg service.
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
     * Mint defines a method for minting the base native token.
     * </pre>
     */
    public void mint(proto.opb.Tx.MsgMint request,
        io.grpc.stub.StreamObserver<proto.opb.Tx.MsgMintResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reclaim defines a method for reclaiming the specified native token
     * from the corresponding escrow.
     * </pre>
     */
    public void reclaim(proto.opb.Tx.MsgReclaim request,
        io.grpc.stub.StreamObserver<proto.opb.Tx.MsgReclaimResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReclaimMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the OPB Msg service.
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
     * Mint defines a method for minting the base native token.
     * </pre>
     */
    public proto.opb.Tx.MsgMintResponse mint(proto.opb.Tx.MsgMint request) {
      return blockingUnaryCall(
          getChannel(), getMintMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reclaim defines a method for reclaiming the specified native token
     * from the corresponding escrow.
     * </pre>
     */
    public proto.opb.Tx.MsgReclaimResponse reclaim(proto.opb.Tx.MsgReclaim request) {
      return blockingUnaryCall(
          getChannel(), getReclaimMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the OPB Msg service.
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
     * Mint defines a method for minting the base native token.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.opb.Tx.MsgMintResponse> mint(
        proto.opb.Tx.MsgMint request) {
      return futureUnaryCall(
          getChannel().newCall(getMintMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reclaim defines a method for reclaiming the specified native token
     * from the corresponding escrow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.opb.Tx.MsgReclaimResponse> reclaim(
        proto.opb.Tx.MsgReclaim request) {
      return futureUnaryCall(
          getChannel().newCall(getReclaimMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MINT = 0;
  private static final int METHODID_RECLAIM = 1;

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
        case METHODID_MINT:
          serviceImpl.mint((proto.opb.Tx.MsgMint) request,
              (io.grpc.stub.StreamObserver<proto.opb.Tx.MsgMintResponse>) responseObserver);
          break;
        case METHODID_RECLAIM:
          serviceImpl.reclaim((proto.opb.Tx.MsgReclaim) request,
              (io.grpc.stub.StreamObserver<proto.opb.Tx.MsgReclaimResponse>) responseObserver);
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
      return proto.opb.Tx.getDescriptor();
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
              .addMethod(getMintMethod())
              .addMethod(getReclaimMethod())
              .build();
        }
      }
    }
    return result;
  }
}
