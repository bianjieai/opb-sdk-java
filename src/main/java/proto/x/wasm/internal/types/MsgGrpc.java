package proto.x.wasm.internal.types;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the wasm Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: x/wasm/internal/types/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "cosmwasm.wasm.v1beta1.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Tx.MsgStoreCode,
      Tx.MsgStoreCodeResponse> getStoreCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StoreCode",
      requestType = Tx.MsgStoreCode.class,
      responseType = Tx.MsgStoreCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgStoreCode,
      Tx.MsgStoreCodeResponse> getStoreCodeMethod() {
    io.grpc.MethodDescriptor<Tx.MsgStoreCode, Tx.MsgStoreCodeResponse> getStoreCodeMethod;
    if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStoreCodeMethod = MsgGrpc.getStoreCodeMethod) == null) {
          MsgGrpc.getStoreCodeMethod = getStoreCodeMethod =
              io.grpc.MethodDescriptor.<Tx.MsgStoreCode, Tx.MsgStoreCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StoreCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgStoreCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgStoreCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StoreCode"))
              .build();
        }
      }
    }
    return getStoreCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgInstantiateContract,
      Tx.MsgInstantiateContractResponse> getInstantiateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstantiateContract",
      requestType = Tx.MsgInstantiateContract.class,
      responseType = Tx.MsgInstantiateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgInstantiateContract,
      Tx.MsgInstantiateContractResponse> getInstantiateContractMethod() {
    io.grpc.MethodDescriptor<Tx.MsgInstantiateContract, Tx.MsgInstantiateContractResponse> getInstantiateContractMethod;
    if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getInstantiateContractMethod = MsgGrpc.getInstantiateContractMethod) == null) {
          MsgGrpc.getInstantiateContractMethod = getInstantiateContractMethod =
              io.grpc.MethodDescriptor.<Tx.MsgInstantiateContract, Tx.MsgInstantiateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstantiateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgInstantiateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgInstantiateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("InstantiateContract"))
              .build();
        }
      }
    }
    return getInstantiateContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgExecuteContract,
      Tx.MsgExecuteContractResponse> getExecuteContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteContract",
      requestType = Tx.MsgExecuteContract.class,
      responseType = Tx.MsgExecuteContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgExecuteContract,
      Tx.MsgExecuteContractResponse> getExecuteContractMethod() {
    io.grpc.MethodDescriptor<Tx.MsgExecuteContract, Tx.MsgExecuteContractResponse> getExecuteContractMethod;
    if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getExecuteContractMethod = MsgGrpc.getExecuteContractMethod) == null) {
          MsgGrpc.getExecuteContractMethod = getExecuteContractMethod =
              io.grpc.MethodDescriptor.<Tx.MsgExecuteContract, Tx.MsgExecuteContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgExecuteContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgExecuteContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ExecuteContract"))
              .build();
        }
      }
    }
    return getExecuteContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgMigrateContract,
      Tx.MsgMigrateContractResponse> getMigrateContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MigrateContract",
      requestType = Tx.MsgMigrateContract.class,
      responseType = Tx.MsgMigrateContractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgMigrateContract,
      Tx.MsgMigrateContractResponse> getMigrateContractMethod() {
    io.grpc.MethodDescriptor<Tx.MsgMigrateContract, Tx.MsgMigrateContractResponse> getMigrateContractMethod;
    if ((getMigrateContractMethod = MsgGrpc.getMigrateContractMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getMigrateContractMethod = MsgGrpc.getMigrateContractMethod) == null) {
          MsgGrpc.getMigrateContractMethod = getMigrateContractMethod =
              io.grpc.MethodDescriptor.<Tx.MsgMigrateContract, Tx.MsgMigrateContractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MigrateContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgMigrateContract.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgMigrateContractResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("MigrateContract"))
              .build();
        }
      }
    }
    return getMigrateContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgUpdateAdmin,
      Tx.MsgUpdateAdminResponse> getUpdateAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdmin",
      requestType = Tx.MsgUpdateAdmin.class,
      responseType = Tx.MsgUpdateAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgUpdateAdmin,
      Tx.MsgUpdateAdminResponse> getUpdateAdminMethod() {
    io.grpc.MethodDescriptor<Tx.MsgUpdateAdmin, Tx.MsgUpdateAdminResponse> getUpdateAdminMethod;
    if ((getUpdateAdminMethod = MsgGrpc.getUpdateAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateAdminMethod = MsgGrpc.getUpdateAdminMethod) == null) {
          MsgGrpc.getUpdateAdminMethod = getUpdateAdminMethod =
              io.grpc.MethodDescriptor.<Tx.MsgUpdateAdmin, Tx.MsgUpdateAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateAdmin"))
              .build();
        }
      }
    }
    return getUpdateAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgClearAdmin,
      Tx.MsgClearAdminResponse> getClearAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearAdmin",
      requestType = Tx.MsgClearAdmin.class,
      responseType = Tx.MsgClearAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgClearAdmin,
      Tx.MsgClearAdminResponse> getClearAdminMethod() {
    io.grpc.MethodDescriptor<Tx.MsgClearAdmin, Tx.MsgClearAdminResponse> getClearAdminMethod;
    if ((getClearAdminMethod = MsgGrpc.getClearAdminMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getClearAdminMethod = MsgGrpc.getClearAdminMethod) == null) {
          MsgGrpc.getClearAdminMethod = getClearAdminMethod =
              io.grpc.MethodDescriptor.<Tx.MsgClearAdmin, Tx.MsgClearAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgClearAdmin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgClearAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("ClearAdmin"))
              .build();
        }
      }
    }
    return getClearAdminMethod;
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
   * Msg defines the wasm Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public void storeCode(Tx.MsgStoreCode request,
                          io.grpc.stub.StreamObserver<Tx.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public void instantiateContract(Tx.MsgInstantiateContract request,
                                    io.grpc.stub.StreamObserver<Tx.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInstantiateContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public void executeContract(Tx.MsgExecuteContract request,
                                io.grpc.stub.StreamObserver<Tx.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public void migrateContract(Tx.MsgMigrateContract request,
                                io.grpc.stub.StreamObserver<Tx.MsgMigrateContractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMigrateContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public void updateAdmin(Tx.MsgUpdateAdmin request,
                            io.grpc.stub.StreamObserver<Tx.MsgUpdateAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAdminMethod(), responseObserver);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public void clearAdmin(Tx.MsgClearAdmin request,
                           io.grpc.stub.StreamObserver<Tx.MsgClearAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearAdminMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgStoreCode,
                Tx.MsgStoreCodeResponse>(
                  this, METHODID_STORE_CODE)))
          .addMethod(
            getInstantiateContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgInstantiateContract,
                Tx.MsgInstantiateContractResponse>(
                  this, METHODID_INSTANTIATE_CONTRACT)))
          .addMethod(
            getExecuteContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgExecuteContract,
                Tx.MsgExecuteContractResponse>(
                  this, METHODID_EXECUTE_CONTRACT)))
          .addMethod(
            getMigrateContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgMigrateContract,
                Tx.MsgMigrateContractResponse>(
                  this, METHODID_MIGRATE_CONTRACT)))
          .addMethod(
            getUpdateAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgUpdateAdmin,
                Tx.MsgUpdateAdminResponse>(
                  this, METHODID_UPDATE_ADMIN)))
          .addMethod(
            getClearAdminMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgClearAdmin,
                Tx.MsgClearAdminResponse>(
                  this, METHODID_CLEAR_ADMIN)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the wasm Msg service.
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
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public void storeCode(Tx.MsgStoreCode request,
                          io.grpc.stub.StreamObserver<Tx.MsgStoreCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public void instantiateContract(Tx.MsgInstantiateContract request,
                                    io.grpc.stub.StreamObserver<Tx.MsgInstantiateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public void executeContract(Tx.MsgExecuteContract request,
                                io.grpc.stub.StreamObserver<Tx.MsgExecuteContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public void migrateContract(Tx.MsgMigrateContract request,
                                io.grpc.stub.StreamObserver<Tx.MsgMigrateContractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMigrateContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public void updateAdmin(Tx.MsgUpdateAdmin request,
                            io.grpc.stub.StreamObserver<Tx.MsgUpdateAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public void clearAdmin(Tx.MsgClearAdmin request,
                           io.grpc.stub.StreamObserver<Tx.MsgClearAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearAdminMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the wasm Msg service.
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
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public Tx.MsgStoreCodeResponse storeCode(Tx.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public Tx.MsgInstantiateContractResponse instantiateContract(Tx.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstantiateContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public Tx.MsgExecuteContractResponse executeContract(Tx.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public Tx.MsgMigrateContractResponse migrateContract(Tx.MsgMigrateContract request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMigrateContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public Tx.MsgUpdateAdminResponse updateAdmin(Tx.MsgUpdateAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAdminMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public Tx.MsgClearAdminResponse clearAdmin(Tx.MsgClearAdmin request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearAdminMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the wasm Msg service.
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
     * StoreCode to submit Wasm code to the system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgStoreCodeResponse> storeCode(
        Tx.MsgStoreCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  Instantiate creates a new smart contract instance for the given code id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgInstantiateContractResponse> instantiateContract(
        Tx.MsgInstantiateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstantiateContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute submits the given message data to a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgExecuteContractResponse> executeContract(
        Tx.MsgExecuteContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Migrate runs a code upgrade/ downgrade for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgMigrateContractResponse> migrateContract(
        Tx.MsgMigrateContract request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMigrateContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAdmin sets a new   admin for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgUpdateAdminResponse> updateAdmin(
        Tx.MsgUpdateAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAdminMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ClearAdmin removes any admin stored for a smart contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgClearAdminResponse> clearAdmin(
        Tx.MsgClearAdmin request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearAdminMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_CODE = 0;
  private static final int METHODID_INSTANTIATE_CONTRACT = 1;
  private static final int METHODID_EXECUTE_CONTRACT = 2;
  private static final int METHODID_MIGRATE_CONTRACT = 3;
  private static final int METHODID_UPDATE_ADMIN = 4;
  private static final int METHODID_CLEAR_ADMIN = 5;

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
        case METHODID_STORE_CODE:
          serviceImpl.storeCode((Tx.MsgStoreCode) request,
              (io.grpc.stub.StreamObserver<Tx.MsgStoreCodeResponse>) responseObserver);
          break;
        case METHODID_INSTANTIATE_CONTRACT:
          serviceImpl.instantiateContract((Tx.MsgInstantiateContract) request,
              (io.grpc.stub.StreamObserver<Tx.MsgInstantiateContractResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_CONTRACT:
          serviceImpl.executeContract((Tx.MsgExecuteContract) request,
              (io.grpc.stub.StreamObserver<Tx.MsgExecuteContractResponse>) responseObserver);
          break;
        case METHODID_MIGRATE_CONTRACT:
          serviceImpl.migrateContract((Tx.MsgMigrateContract) request,
              (io.grpc.stub.StreamObserver<Tx.MsgMigrateContractResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ADMIN:
          serviceImpl.updateAdmin((Tx.MsgUpdateAdmin) request,
              (io.grpc.stub.StreamObserver<Tx.MsgUpdateAdminResponse>) responseObserver);
          break;
        case METHODID_CLEAR_ADMIN:
          serviceImpl.clearAdmin((Tx.MsgClearAdmin) request,
              (io.grpc.stub.StreamObserver<Tx.MsgClearAdminResponse>) responseObserver);
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
              .addMethod(getStoreCodeMethod())
              .addMethod(getInstantiateContractMethod())
              .addMethod(getExecuteContractMethod())
              .addMethod(getMigrateContractMethod())
              .addMethod(getUpdateAdminMethod())
              .addMethod(getClearAdminMethod())
              .build();
        }
      }
    }
    return result;
  }
}
