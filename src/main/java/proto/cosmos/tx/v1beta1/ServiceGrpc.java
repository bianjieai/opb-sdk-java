package proto.cosmos.tx.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service defines a gRPC service for interacting with transactions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: cosmos/tx/v1beta1/service.proto")
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final String SERVICE_NAME = "cosmos.tx.v1beta1.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServiceOuterClass.SimulateRequest,
      ServiceOuterClass.SimulateResponse> getSimulateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Simulate",
      requestType = ServiceOuterClass.SimulateRequest.class,
      responseType = ServiceOuterClass.SimulateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServiceOuterClass.SimulateRequest,
      ServiceOuterClass.SimulateResponse> getSimulateMethod() {
    io.grpc.MethodDescriptor<ServiceOuterClass.SimulateRequest, ServiceOuterClass.SimulateResponse> getSimulateMethod;
    if ((getSimulateMethod = ServiceGrpc.getSimulateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getSimulateMethod = ServiceGrpc.getSimulateMethod) == null) {
          ServiceGrpc.getSimulateMethod = getSimulateMethod =
              io.grpc.MethodDescriptor.<ServiceOuterClass.SimulateRequest, ServiceOuterClass.SimulateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Simulate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.SimulateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.SimulateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("Simulate"))
              .build();
        }
      }
    }
    return getSimulateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServiceOuterClass.GetTxRequest,
      ServiceOuterClass.GetTxResponse> getGetTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTx",
      requestType = ServiceOuterClass.GetTxRequest.class,
      responseType = ServiceOuterClass.GetTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServiceOuterClass.GetTxRequest,
      ServiceOuterClass.GetTxResponse> getGetTxMethod() {
    io.grpc.MethodDescriptor<ServiceOuterClass.GetTxRequest, ServiceOuterClass.GetTxResponse> getGetTxMethod;
    if ((getGetTxMethod = ServiceGrpc.getGetTxMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTxMethod = ServiceGrpc.getGetTxMethod) == null) {
          ServiceGrpc.getGetTxMethod = getGetTxMethod =
              io.grpc.MethodDescriptor.<ServiceOuterClass.GetTxRequest, ServiceOuterClass.GetTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.GetTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.GetTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTx"))
              .build();
        }
      }
    }
    return getGetTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServiceOuterClass.BroadcastTxRequest,
      ServiceOuterClass.BroadcastTxResponse> getBroadcastTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastTx",
      requestType = ServiceOuterClass.BroadcastTxRequest.class,
      responseType = ServiceOuterClass.BroadcastTxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServiceOuterClass.BroadcastTxRequest,
      ServiceOuterClass.BroadcastTxResponse> getBroadcastTxMethod() {
    io.grpc.MethodDescriptor<ServiceOuterClass.BroadcastTxRequest, ServiceOuterClass.BroadcastTxResponse> getBroadcastTxMethod;
    if ((getBroadcastTxMethod = ServiceGrpc.getBroadcastTxMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getBroadcastTxMethod = ServiceGrpc.getBroadcastTxMethod) == null) {
          ServiceGrpc.getBroadcastTxMethod = getBroadcastTxMethod =
              io.grpc.MethodDescriptor.<ServiceOuterClass.BroadcastTxRequest, ServiceOuterClass.BroadcastTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.BroadcastTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.BroadcastTxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("BroadcastTx"))
              .build();
        }
      }
    }
    return getBroadcastTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServiceOuterClass.GetTxsEventRequest,
      ServiceOuterClass.GetTxsEventResponse> getGetTxsEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTxsEvent",
      requestType = ServiceOuterClass.GetTxsEventRequest.class,
      responseType = ServiceOuterClass.GetTxsEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServiceOuterClass.GetTxsEventRequest,
      ServiceOuterClass.GetTxsEventResponse> getGetTxsEventMethod() {
    io.grpc.MethodDescriptor<ServiceOuterClass.GetTxsEventRequest, ServiceOuterClass.GetTxsEventResponse> getGetTxsEventMethod;
    if ((getGetTxsEventMethod = ServiceGrpc.getGetTxsEventMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTxsEventMethod = ServiceGrpc.getGetTxsEventMethod) == null) {
          ServiceGrpc.getGetTxsEventMethod = getGetTxsEventMethod =
              io.grpc.MethodDescriptor.<ServiceOuterClass.GetTxsEventRequest, ServiceOuterClass.GetTxsEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTxsEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.GetTxsEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServiceOuterClass.GetTxsEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTxsEvent"))
              .build();
        }
      }
    }
    return getGetTxsEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
   * </pre>
   */
  public static abstract class ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public void simulate(ServiceOuterClass.SimulateRequest request,
                         io.grpc.stub.StreamObserver<ServiceOuterClass.SimulateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimulateMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public void getTx(ServiceOuterClass.GetTxRequest request,
                      io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public void broadcastTx(ServiceOuterClass.BroadcastTxRequest request,
                            io.grpc.stub.StreamObserver<ServiceOuterClass.BroadcastTxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBroadcastTxMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public void getTxsEvent(ServiceOuterClass.GetTxsEventRequest request,
                            io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxsEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTxsEventMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimulateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ServiceOuterClass.SimulateRequest,
                ServiceOuterClass.SimulateResponse>(
                  this, METHODID_SIMULATE)))
          .addMethod(
            getGetTxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ServiceOuterClass.GetTxRequest,
                ServiceOuterClass.GetTxResponse>(
                  this, METHODID_GET_TX)))
          .addMethod(
            getBroadcastTxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ServiceOuterClass.BroadcastTxRequest,
                ServiceOuterClass.BroadcastTxResponse>(
                  this, METHODID_BROADCAST_TX)))
          .addMethod(
            getGetTxsEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ServiceOuterClass.GetTxsEventRequest,
                ServiceOuterClass.GetTxsEventResponse>(
                  this, METHODID_GET_TXS_EVENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
   * </pre>
   */
  public static final class ServiceStub extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public void simulate(ServiceOuterClass.SimulateRequest request,
                         io.grpc.stub.StreamObserver<ServiceOuterClass.SimulateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimulateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public void getTx(ServiceOuterClass.GetTxRequest request,
                      io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public void broadcastTx(ServiceOuterClass.BroadcastTxRequest request,
                            io.grpc.stub.StreamObserver<ServiceOuterClass.BroadcastTxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBroadcastTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public void getTxsEvent(ServiceOuterClass.GetTxsEventRequest request,
                            io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxsEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTxsEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
   * </pre>
   */
  public static final class ServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public ServiceOuterClass.SimulateResponse simulate(ServiceOuterClass.SimulateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimulateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public ServiceOuterClass.GetTxResponse getTx(ServiceOuterClass.GetTxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public ServiceOuterClass.BroadcastTxResponse broadcastTx(ServiceOuterClass.BroadcastTxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBroadcastTxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public ServiceOuterClass.GetTxsEventResponse getTxsEvent(ServiceOuterClass.GetTxsEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTxsEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service defines a gRPC service for interacting with transactions.
   * </pre>
   */
  public static final class ServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Simulate simulates executing a transaction for estimating gas usage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ServiceOuterClass.SimulateResponse> simulate(
        ServiceOuterClass.SimulateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimulateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTx fetches a tx by hash.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ServiceOuterClass.GetTxResponse> getTx(
        ServiceOuterClass.GetTxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BroadcastTx broadcast transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ServiceOuterClass.BroadcastTxResponse> broadcastTx(
        ServiceOuterClass.BroadcastTxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBroadcastTxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetTxsEvent fetches txs by event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ServiceOuterClass.GetTxsEventResponse> getTxsEvent(
        ServiceOuterClass.GetTxsEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTxsEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMULATE = 0;
  private static final int METHODID_GET_TX = 1;
  private static final int METHODID_BROADCAST_TX = 2;
  private static final int METHODID_GET_TXS_EVENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMULATE:
          serviceImpl.simulate((ServiceOuterClass.SimulateRequest) request,
              (io.grpc.stub.StreamObserver<ServiceOuterClass.SimulateResponse>) responseObserver);
          break;
        case METHODID_GET_TX:
          serviceImpl.getTx((ServiceOuterClass.GetTxRequest) request,
              (io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxResponse>) responseObserver);
          break;
        case METHODID_BROADCAST_TX:
          serviceImpl.broadcastTx((ServiceOuterClass.BroadcastTxRequest) request,
              (io.grpc.stub.StreamObserver<ServiceOuterClass.BroadcastTxResponse>) responseObserver);
          break;
        case METHODID_GET_TXS_EVENT:
          serviceImpl.getTxsEvent((ServiceOuterClass.GetTxsEventRequest) request,
              (io.grpc.stub.StreamObserver<ServiceOuterClass.GetTxsEventResponse>) responseObserver);
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

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getSimulateMethod())
              .addMethod(getGetTxMethod())
              .addMethod(getBroadcastTxMethod())
              .addMethod(getGetTxsEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
