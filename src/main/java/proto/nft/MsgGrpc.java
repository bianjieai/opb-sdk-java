package proto.nft;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the htlc Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: nft/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.nft.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Tx.MsgIssueDenom,
      Tx.MsgIssueDenomResponse> getIssueDenomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueDenom",
      requestType = Tx.MsgIssueDenom.class,
      responseType = Tx.MsgIssueDenomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgIssueDenom,
      Tx.MsgIssueDenomResponse> getIssueDenomMethod() {
    io.grpc.MethodDescriptor<Tx.MsgIssueDenom, Tx.MsgIssueDenomResponse> getIssueDenomMethod;
    if ((getIssueDenomMethod = MsgGrpc.getIssueDenomMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getIssueDenomMethod = MsgGrpc.getIssueDenomMethod) == null) {
          MsgGrpc.getIssueDenomMethod = getIssueDenomMethod =
              io.grpc.MethodDescriptor.<Tx.MsgIssueDenom, Tx.MsgIssueDenomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IssueDenom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgIssueDenom.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgIssueDenomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("IssueDenom"))
              .build();
        }
      }
    }
    return getIssueDenomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgMintNFT,
      Tx.MsgMintNFTResponse> getMintNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MintNFT",
      requestType = Tx.MsgMintNFT.class,
      responseType = Tx.MsgMintNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgMintNFT,
      Tx.MsgMintNFTResponse> getMintNFTMethod() {
    io.grpc.MethodDescriptor<Tx.MsgMintNFT, Tx.MsgMintNFTResponse> getMintNFTMethod;
    if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMintNFTMethod = MsgGrpc.getMintNFTMethod) == null) {
          MsgGrpc.getMintNFTMethod = getMintNFTMethod =
              io.grpc.MethodDescriptor.<Tx.MsgMintNFT, Tx.MsgMintNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MintNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgMintNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgMintNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MintNFT"))
              .build();
        }
      }
    }
    return getMintNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgEditNFT,
      Tx.MsgEditNFTResponse> getEditNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditNFT",
      requestType = Tx.MsgEditNFT.class,
      responseType = Tx.MsgEditNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgEditNFT,
      Tx.MsgEditNFTResponse> getEditNFTMethod() {
    io.grpc.MethodDescriptor<Tx.MsgEditNFT, Tx.MsgEditNFTResponse> getEditNFTMethod;
    if ((getEditNFTMethod = MsgGrpc.getEditNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEditNFTMethod = MsgGrpc.getEditNFTMethod) == null) {
          MsgGrpc.getEditNFTMethod = getEditNFTMethod =
              io.grpc.MethodDescriptor.<Tx.MsgEditNFT, Tx.MsgEditNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgEditNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgEditNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EditNFT"))
              .build();
        }
      }
    }
    return getEditNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgTransferNFT,
      Tx.MsgTransferNFTResponse> getTransferNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferNFT",
      requestType = Tx.MsgTransferNFT.class,
      responseType = Tx.MsgTransferNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgTransferNFT,
      Tx.MsgTransferNFTResponse> getTransferNFTMethod() {
    io.grpc.MethodDescriptor<Tx.MsgTransferNFT, Tx.MsgTransferNFTResponse> getTransferNFTMethod;
    if ((getTransferNFTMethod = MsgGrpc.getTransferNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getTransferNFTMethod = MsgGrpc.getTransferNFTMethod) == null) {
          MsgGrpc.getTransferNFTMethod = getTransferNFTMethod =
              io.grpc.MethodDescriptor.<Tx.MsgTransferNFT, Tx.MsgTransferNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgTransferNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgTransferNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("TransferNFT"))
              .build();
        }
      }
    }
    return getTransferNFTMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgBurnNFT,
      Tx.MsgBurnNFTResponse> getBurnNFTMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BurnNFT",
      requestType = Tx.MsgBurnNFT.class,
      responseType = Tx.MsgBurnNFTResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgBurnNFT,
      Tx.MsgBurnNFTResponse> getBurnNFTMethod() {
    io.grpc.MethodDescriptor<Tx.MsgBurnNFT, Tx.MsgBurnNFTResponse> getBurnNFTMethod;
    if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBurnNFTMethod = MsgGrpc.getBurnNFTMethod) == null) {
          MsgGrpc.getBurnNFTMethod = getBurnNFTMethod =
              io.grpc.MethodDescriptor.<Tx.MsgBurnNFT, Tx.MsgBurnNFTResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BurnNFT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBurnNFT.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBurnNFTResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BurnNFT"))
              .build();
        }
      }
    }
    return getBurnNFTMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MsgStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgStub>() {
        @Override
        public MsgStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgStub(channel, callOptions);
        }
      };
    return MsgStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MsgBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgBlockingStub>() {
        @Override
        public MsgBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgBlockingStub(channel, callOptions);
        }
      };
    return MsgBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MsgFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MsgFutureStub>() {
        @Override
        public MsgFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MsgFutureStub(channel, callOptions);
        }
      };
    return MsgFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Msg defines the htlc Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public void issueDenom(Tx.MsgIssueDenom request,
                           io.grpc.stub.StreamObserver<Tx.MsgIssueDenomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIssueDenomMethod(), responseObserver);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public void mintNFT(Tx.MsgMintNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMintNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundHTLC defines a method for editing a nft.
     * </pre>
     */
    public void editNFT(Tx.MsgEditNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgEditNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * TransferNFT defines a method for transferring a nft.
     * </pre>
     */
    public void transferNFT(Tx.MsgTransferNFT request,
                            io.grpc.stub.StreamObserver<Tx.MsgTransferNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferNFTMethod(), responseObserver);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public void burnNFT(Tx.MsgBurnNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnNFTMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIssueDenomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgIssueDenom,
                Tx.MsgIssueDenomResponse>(
                  this, METHODID_ISSUE_DENOM)))
          .addMethod(
            getMintNFTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgMintNFT,
                Tx.MsgMintNFTResponse>(
                  this, METHODID_MINT_NFT)))
          .addMethod(
            getEditNFTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgEditNFT,
                Tx.MsgEditNFTResponse>(
                  this, METHODID_EDIT_NFT)))
          .addMethod(
            getTransferNFTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgTransferNFT,
                Tx.MsgTransferNFTResponse>(
                  this, METHODID_TRANSFER_NFT)))
          .addMethod(
            getBurnNFTMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgBurnNFT,
                Tx.MsgBurnNFTResponse>(
                  this, METHODID_BURN_NFT)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the htlc Msg service.
   * </pre>
   */
  public static final class MsgStub extends io.grpc.stub.AbstractAsyncStub<MsgStub> {
    private MsgStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public void issueDenom(Tx.MsgIssueDenom request,
                           io.grpc.stub.StreamObserver<Tx.MsgIssueDenomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIssueDenomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public void mintNFT(Tx.MsgMintNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgMintNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundHTLC defines a method for editing a nft.
     * </pre>
     */
    public void editNFT(Tx.MsgEditNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgEditNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TransferNFT defines a method for transferring a nft.
     * </pre>
     */
    public void transferNFT(Tx.MsgTransferNFT request,
                            io.grpc.stub.StreamObserver<Tx.MsgTransferNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferNFTMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public void burnNFT(Tx.MsgBurnNFT request,
                        io.grpc.stub.StreamObserver<Tx.MsgBurnNFTResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the htlc Msg service.
   * </pre>
   */
  public static final class MsgBlockingStub extends io.grpc.stub.AbstractBlockingStub<MsgBlockingStub> {
    private MsgBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public Tx.MsgIssueDenomResponse issueDenom(Tx.MsgIssueDenom request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIssueDenomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public Tx.MsgMintNFTResponse mintNFT(Tx.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMintNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundHTLC defines a method for editing a nft.
     * </pre>
     */
    public Tx.MsgEditNFTResponse editNFT(Tx.MsgEditNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TransferNFT defines a method for transferring a nft.
     * </pre>
     */
    public Tx.MsgTransferNFTResponse transferNFT(Tx.MsgTransferNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferNFTMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public Tx.MsgBurnNFTResponse burnNFT(Tx.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnNFTMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the htlc Msg service.
   * </pre>
   */
  public static final class MsgFutureStub extends io.grpc.stub.AbstractFutureStub<MsgFutureStub> {
    private MsgFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MsgFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MsgFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * IssueDenom defines a method for issue a denom.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgIssueDenomResponse> issueDenom(
        Tx.MsgIssueDenom request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIssueDenomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * MintNFT defines a method for mint a new nft
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgMintNFTResponse> mintNFT(
        Tx.MsgMintNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMintNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundHTLC defines a method for editing a nft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgEditNFTResponse> editNFT(
        Tx.MsgEditNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TransferNFT defines a method for transferring a nft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgTransferNFTResponse> transferNFT(
        Tx.MsgTransferNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferNFTMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BurnNFT defines a method for burning a nft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgBurnNFTResponse> burnNFT(
        Tx.MsgBurnNFT request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnNFTMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ISSUE_DENOM = 0;
  private static final int METHODID_MINT_NFT = 1;
  private static final int METHODID_EDIT_NFT = 2;
  private static final int METHODID_TRANSFER_NFT = 3;
  private static final int METHODID_BURN_NFT = 4;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ISSUE_DENOM:
          serviceImpl.issueDenom((Tx.MsgIssueDenom) request,
              (io.grpc.stub.StreamObserver<Tx.MsgIssueDenomResponse>) responseObserver);
          break;
        case METHODID_MINT_NFT:
          serviceImpl.mintNFT((Tx.MsgMintNFT) request,
              (io.grpc.stub.StreamObserver<Tx.MsgMintNFTResponse>) responseObserver);
          break;
        case METHODID_EDIT_NFT:
          serviceImpl.editNFT((Tx.MsgEditNFT) request,
              (io.grpc.stub.StreamObserver<Tx.MsgEditNFTResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_NFT:
          serviceImpl.transferNFT((Tx.MsgTransferNFT) request,
              (io.grpc.stub.StreamObserver<Tx.MsgTransferNFTResponse>) responseObserver);
          break;
        case METHODID_BURN_NFT:
          serviceImpl.burnNFT((Tx.MsgBurnNFT) request,
              (io.grpc.stub.StreamObserver<Tx.MsgBurnNFTResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Tx.getDescriptor();
    }

    @Override
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

    @Override
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
              .addMethod(getIssueDenomMethod())
              .addMethod(getMintNFTMethod())
              .addMethod(getEditNFTMethod())
              .addMethod(getTransferNFTMethod())
              .addMethod(getBurnNFTMethod())
              .build();
        }
      }
    }
    return result;
  }
}
