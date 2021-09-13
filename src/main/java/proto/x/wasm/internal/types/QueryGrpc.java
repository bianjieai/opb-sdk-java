package proto.x.wasm.internal.types;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query provides defines the gRPC querier service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: x/wasm/internal/types/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "cosmwasm.wasm.v1beta1.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryContractInfoRequest,
      QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractInfo",
      requestType = QueryOuterClass.QueryContractInfoRequest.class,
      responseType = QueryOuterClass.QueryContractInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryContractInfoRequest,
      QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryContractInfoRequest, QueryOuterClass.QueryContractInfoResponse> getContractInfoMethod;
    if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractInfoMethod = QueryGrpc.getContractInfoMethod) == null) {
          QueryGrpc.getContractInfoMethod = getContractInfoMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryContractInfoRequest, QueryOuterClass.QueryContractInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractInfo"))
              .build();
        }
      }
    }
    return getContractInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryContractHistoryRequest,
      QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractHistory",
      requestType = QueryOuterClass.QueryContractHistoryRequest.class,
      responseType = QueryOuterClass.QueryContractHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryContractHistoryRequest,
      QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryContractHistoryRequest, QueryOuterClass.QueryContractHistoryResponse> getContractHistoryMethod;
    if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractHistoryMethod = QueryGrpc.getContractHistoryMethod) == null) {
          QueryGrpc.getContractHistoryMethod = getContractHistoryMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryContractHistoryRequest, QueryOuterClass.QueryContractHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractHistory"))
              .build();
        }
      }
    }
    return getContractHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryContractsByCodeRequest,
      QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ContractsByCode",
      requestType = QueryOuterClass.QueryContractsByCodeRequest.class,
      responseType = QueryOuterClass.QueryContractsByCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryContractsByCodeRequest,
      QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryContractsByCodeRequest, QueryOuterClass.QueryContractsByCodeResponse> getContractsByCodeMethod;
    if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getContractsByCodeMethod = QueryGrpc.getContractsByCodeMethod) == null) {
          QueryGrpc.getContractsByCodeMethod = getContractsByCodeMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryContractsByCodeRequest, QueryOuterClass.QueryContractsByCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ContractsByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractsByCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryContractsByCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("ContractsByCode"))
              .build();
        }
      }
    }
    return getContractsByCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryAllContractStateRequest,
      QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllContractState",
      requestType = QueryOuterClass.QueryAllContractStateRequest.class,
      responseType = QueryOuterClass.QueryAllContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryAllContractStateRequest,
      QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryAllContractStateRequest, QueryOuterClass.QueryAllContractStateResponse> getAllContractStateMethod;
    if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getAllContractStateMethod = QueryGrpc.getAllContractStateMethod) == null) {
          QueryGrpc.getAllContractStateMethod = getAllContractStateMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryAllContractStateRequest, QueryOuterClass.QueryAllContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryAllContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryAllContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("AllContractState"))
              .build();
        }
      }
    }
    return getAllContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryRawContractStateRequest,
      QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RawContractState",
      requestType = QueryOuterClass.QueryRawContractStateRequest.class,
      responseType = QueryOuterClass.QueryRawContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryRawContractStateRequest,
      QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryRawContractStateRequest, QueryOuterClass.QueryRawContractStateResponse> getRawContractStateMethod;
    if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRawContractStateMethod = QueryGrpc.getRawContractStateMethod) == null) {
          QueryGrpc.getRawContractStateMethod = getRawContractStateMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryRawContractStateRequest, QueryOuterClass.QueryRawContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RawContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRawContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRawContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RawContractState"))
              .build();
        }
      }
    }
    return getRawContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QuerySmartContractStateRequest,
      QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmartContractState",
      requestType = QueryOuterClass.QuerySmartContractStateRequest.class,
      responseType = QueryOuterClass.QuerySmartContractStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QuerySmartContractStateRequest,
      QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QuerySmartContractStateRequest, QueryOuterClass.QuerySmartContractStateResponse> getSmartContractStateMethod;
    if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSmartContractStateMethod = QueryGrpc.getSmartContractStateMethod) == null) {
          QueryGrpc.getSmartContractStateMethod = getSmartContractStateMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QuerySmartContractStateRequest, QueryOuterClass.QuerySmartContractStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SmartContractState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySmartContractStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySmartContractStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("SmartContractState"))
              .build();
        }
      }
    }
    return getSmartContractStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryCodeRequest,
      QueryOuterClass.QueryCodeResponse> getCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Code",
      requestType = QueryOuterClass.QueryCodeRequest.class,
      responseType = QueryOuterClass.QueryCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryCodeRequest,
      QueryOuterClass.QueryCodeResponse> getCodeMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryCodeRequest, QueryOuterClass.QueryCodeResponse> getCodeMethod;
    if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodeMethod = QueryGrpc.getCodeMethod) == null) {
          QueryGrpc.getCodeMethod = getCodeMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryCodeRequest, QueryOuterClass.QueryCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Code"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Code"))
              .build();
        }
      }
    }
    return getCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryCodesRequest,
      QueryOuterClass.QueryCodesResponse> getCodesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Codes",
      requestType = QueryOuterClass.QueryCodesRequest.class,
      responseType = QueryOuterClass.QueryCodesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryCodesRequest,
      QueryOuterClass.QueryCodesResponse> getCodesMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryCodesRequest, QueryOuterClass.QueryCodesResponse> getCodesMethod;
    if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getCodesMethod = QueryGrpc.getCodesMethod) == null) {
          QueryGrpc.getCodesMethod = getCodesMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryCodesRequest, QueryOuterClass.QueryCodesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Codes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCodesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryCodesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Codes"))
              .build();
        }
      }
    }
    return getCodesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryStub>() {
        @Override
        public QueryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryStub(channel, callOptions);
        }
      };
    return QueryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryBlockingStub>() {
        @Override
        public QueryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryBlockingStub(channel, callOptions);
        }
      };
    return QueryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryFutureStub>() {
        @Override
        public QueryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryFutureStub(channel, callOptions);
        }
      };
    return QueryFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public void contractInfo(QueryOuterClass.QueryContractInfoRequest request,
                             io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public void contractHistory(QueryOuterClass.QueryContractHistoryRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public void contractsByCode(QueryOuterClass.QueryContractsByCodeRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContractsByCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public void allContractState(QueryOuterClass.QueryAllContractStateRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public void rawContractState(QueryOuterClass.QueryRawContractStateRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRawContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public void smartContractState(QueryOuterClass.QuerySmartContractStateRequest request,
                                   io.grpc.stub.StreamObserver<QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSmartContractStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public void code(QueryOuterClass.QueryCodeRequest request,
                     io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public void codes(QueryOuterClass.QueryCodesRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCodesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getContractInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryContractInfoRequest,
                QueryOuterClass.QueryContractInfoResponse>(
                  this, METHODID_CONTRACT_INFO)))
          .addMethod(
            getContractHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryContractHistoryRequest,
                QueryOuterClass.QueryContractHistoryResponse>(
                  this, METHODID_CONTRACT_HISTORY)))
          .addMethod(
            getContractsByCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryContractsByCodeRequest,
                QueryOuterClass.QueryContractsByCodeResponse>(
                  this, METHODID_CONTRACTS_BY_CODE)))
          .addMethod(
            getAllContractStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryAllContractStateRequest,
                QueryOuterClass.QueryAllContractStateResponse>(
                  this, METHODID_ALL_CONTRACT_STATE)))
          .addMethod(
            getRawContractStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryRawContractStateRequest,
                QueryOuterClass.QueryRawContractStateResponse>(
                  this, METHODID_RAW_CONTRACT_STATE)))
          .addMethod(
            getSmartContractStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QuerySmartContractStateRequest,
                QueryOuterClass.QuerySmartContractStateResponse>(
                  this, METHODID_SMART_CONTRACT_STATE)))
          .addMethod(
            getCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryCodeRequest,
                QueryOuterClass.QueryCodeResponse>(
                  this, METHODID_CODE)))
          .addMethod(
            getCodesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryCodesRequest,
                QueryOuterClass.QueryCodesResponse>(
                  this, METHODID_CODES)))
          .build();
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryStub extends io.grpc.stub.AbstractAsyncStub<QueryStub> {
    private QueryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryStub(channel, callOptions);
    }

    /**
     * <pre>
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public void contractInfo(QueryOuterClass.QueryContractInfoRequest request,
                             io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public void contractHistory(QueryOuterClass.QueryContractHistoryRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public void contractsByCode(QueryOuterClass.QueryContractsByCodeRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractsByCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public void allContractState(QueryOuterClass.QueryAllContractStateRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public void rawContractState(QueryOuterClass.QueryRawContractStateRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryRawContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public void smartContractState(QueryOuterClass.QuerySmartContractStateRequest request,
                                   io.grpc.stub.StreamObserver<QueryOuterClass.QuerySmartContractStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public void code(QueryOuterClass.QueryCodeRequest request,
                     io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public void codes(QueryOuterClass.QueryCodesRequest request,
                      io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryBlockingStub> {
    private QueryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public QueryOuterClass.QueryContractInfoResponse contractInfo(QueryOuterClass.QueryContractInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public QueryOuterClass.QueryContractHistoryResponse contractHistory(QueryOuterClass.QueryContractHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public QueryOuterClass.QueryContractsByCodeResponse contractsByCode(QueryOuterClass.QueryContractsByCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContractsByCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public QueryOuterClass.QueryAllContractStateResponse allContractState(QueryOuterClass.QueryAllContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAllContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public QueryOuterClass.QueryRawContractStateResponse rawContractState(QueryOuterClass.QueryRawContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRawContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public QueryOuterClass.QuerySmartContractStateResponse smartContractState(QueryOuterClass.QuerySmartContractStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSmartContractStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public QueryOuterClass.QueryCodeResponse code(QueryOuterClass.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public QueryOuterClass.QueryCodesResponse codes(QueryOuterClass.QueryCodesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCodesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query provides defines the gRPC querier service
   * </pre>
   */
  public static final class QueryFutureStub extends io.grpc.stub.AbstractFutureStub<QueryFutureStub> {
    private QueryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ContractInfo gets the contract meta data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryContractInfoResponse> contractInfo(
        QueryOuterClass.QueryContractInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractHistory gets the contract code history
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryContractHistoryResponse> contractHistory(
        QueryOuterClass.QueryContractHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ContractsByCode lists all smart contracts for a code id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryContractsByCodeResponse> contractsByCode(
        QueryOuterClass.QueryContractsByCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContractsByCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AllContractState gets all raw store data for a single contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryAllContractStateResponse> allContractState(
        QueryOuterClass.QueryAllContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAllContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RawContractState gets single key from the raw store data of a contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryRawContractStateResponse> rawContractState(
        QueryOuterClass.QueryRawContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRawContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SmartContractState get smart query result from the contract
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QuerySmartContractStateResponse> smartContractState(
        QueryOuterClass.QuerySmartContractStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSmartContractStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Code gets the binary code and metadata for a singe wasm code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryCodeResponse> code(
        QueryOuterClass.QueryCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Codes gets the metadata for all stored wasm codes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryCodesResponse> codes(
        QueryOuterClass.QueryCodesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCodesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTRACT_INFO = 0;
  private static final int METHODID_CONTRACT_HISTORY = 1;
  private static final int METHODID_CONTRACTS_BY_CODE = 2;
  private static final int METHODID_ALL_CONTRACT_STATE = 3;
  private static final int METHODID_RAW_CONTRACT_STATE = 4;
  private static final int METHODID_SMART_CONTRACT_STATE = 5;
  private static final int METHODID_CODE = 6;
  private static final int METHODID_CODES = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTRACT_INFO:
          serviceImpl.contractInfo((QueryOuterClass.QueryContractInfoRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractInfoResponse>) responseObserver);
          break;
        case METHODID_CONTRACT_HISTORY:
          serviceImpl.contractHistory((QueryOuterClass.QueryContractHistoryRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractHistoryResponse>) responseObserver);
          break;
        case METHODID_CONTRACTS_BY_CODE:
          serviceImpl.contractsByCode((QueryOuterClass.QueryContractsByCodeRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryContractsByCodeResponse>) responseObserver);
          break;
        case METHODID_ALL_CONTRACT_STATE:
          serviceImpl.allContractState((QueryOuterClass.QueryAllContractStateRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryAllContractStateResponse>) responseObserver);
          break;
        case METHODID_RAW_CONTRACT_STATE:
          serviceImpl.rawContractState((QueryOuterClass.QueryRawContractStateRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryRawContractStateResponse>) responseObserver);
          break;
        case METHODID_SMART_CONTRACT_STATE:
          serviceImpl.smartContractState((QueryOuterClass.QuerySmartContractStateRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QuerySmartContractStateResponse>) responseObserver);
          break;
        case METHODID_CODE:
          serviceImpl.code((QueryOuterClass.QueryCodeRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodeResponse>) responseObserver);
          break;
        case METHODID_CODES:
          serviceImpl.codes((QueryOuterClass.QueryCodesRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryCodesResponse>) responseObserver);
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

  private static abstract class QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return QueryOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Query");
    }
  }

  private static final class QueryFileDescriptorSupplier
      extends QueryBaseDescriptorSupplier {
    QueryFileDescriptorSupplier() {}
  }

  private static final class QueryMethodDescriptorSupplier
      extends QueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryFileDescriptorSupplier())
              .addMethod(getContractInfoMethod())
              .addMethod(getContractHistoryMethod())
              .addMethod(getContractsByCodeMethod())
              .addMethod(getAllContractStateMethod())
              .addMethod(getRawContractStateMethod())
              .addMethod(getSmartContractStateMethod())
              .addMethod(getCodeMethod())
              .addMethod(getCodesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
