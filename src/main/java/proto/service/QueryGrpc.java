package proto.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Query creates service with iservice as rpc
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: service/query.proto")
public final class QueryGrpc {

  private QueryGrpc() {}

  public static final String SERVICE_NAME = "irismod.service.Query";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryDefinitionRequest,
      QueryOuterClass.QueryDefinitionResponse> getDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Definition",
      requestType = QueryOuterClass.QueryDefinitionRequest.class,
      responseType = QueryOuterClass.QueryDefinitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryDefinitionRequest,
      QueryOuterClass.QueryDefinitionResponse> getDefinitionMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryDefinitionRequest, QueryOuterClass.QueryDefinitionResponse> getDefinitionMethod;
    if ((getDefinitionMethod = QueryGrpc.getDefinitionMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getDefinitionMethod = QueryGrpc.getDefinitionMethod) == null) {
          QueryGrpc.getDefinitionMethod = getDefinitionMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryDefinitionRequest, QueryOuterClass.QueryDefinitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Definition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryDefinitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Definition"))
              .build();
        }
      }
    }
    return getDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingRequest,
      QueryOuterClass.QueryBindingResponse> getBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Binding",
      requestType = QueryOuterClass.QueryBindingRequest.class,
      responseType = QueryOuterClass.QueryBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingRequest,
      QueryOuterClass.QueryBindingResponse> getBindingMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingRequest, QueryOuterClass.QueryBindingResponse> getBindingMethod;
    if ((getBindingMethod = QueryGrpc.getBindingMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBindingMethod = QueryGrpc.getBindingMethod) == null) {
          QueryGrpc.getBindingMethod = getBindingMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryBindingRequest, QueryOuterClass.QueryBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Binding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBindingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Binding"))
              .build();
        }
      }
    }
    return getBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingsRequest,
      QueryOuterClass.QueryBindingsResponse> getBindingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bindings",
      requestType = QueryOuterClass.QueryBindingsRequest.class,
      responseType = QueryOuterClass.QueryBindingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingsRequest,
      QueryOuterClass.QueryBindingsResponse> getBindingsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryBindingsRequest, QueryOuterClass.QueryBindingsResponse> getBindingsMethod;
    if ((getBindingsMethod = QueryGrpc.getBindingsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getBindingsMethod = QueryGrpc.getBindingsMethod) == null) {
          QueryGrpc.getBindingsMethod = getBindingsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryBindingsRequest, QueryOuterClass.QueryBindingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Bindings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBindingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryBindingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Bindings"))
              .build();
        }
      }
    }
    return getBindingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryWithdrawAddressRequest,
      QueryOuterClass.QueryWithdrawAddressResponse> getWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawAddress",
      requestType = QueryOuterClass.QueryWithdrawAddressRequest.class,
      responseType = QueryOuterClass.QueryWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryWithdrawAddressRequest,
      QueryOuterClass.QueryWithdrawAddressResponse> getWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryWithdrawAddressRequest, QueryOuterClass.QueryWithdrawAddressResponse> getWithdrawAddressMethod;
    if ((getWithdrawAddressMethod = QueryGrpc.getWithdrawAddressMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getWithdrawAddressMethod = QueryGrpc.getWithdrawAddressMethod) == null) {
          QueryGrpc.getWithdrawAddressMethod = getWithdrawAddressMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryWithdrawAddressRequest, QueryOuterClass.QueryWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryWithdrawAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryWithdrawAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("WithdrawAddress"))
              .build();
        }
      }
    }
    return getWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestContextRequest,
      QueryOuterClass.QueryRequestContextResponse> getRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestContext",
      requestType = QueryOuterClass.QueryRequestContextRequest.class,
      responseType = QueryOuterClass.QueryRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestContextRequest,
      QueryOuterClass.QueryRequestContextResponse> getRequestContextMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestContextRequest, QueryOuterClass.QueryRequestContextResponse> getRequestContextMethod;
    if ((getRequestContextMethod = QueryGrpc.getRequestContextMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestContextMethod = QueryGrpc.getRequestContextMethod) == null) {
          QueryGrpc.getRequestContextMethod = getRequestContextMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryRequestContextRequest, QueryOuterClass.QueryRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestContext"))
              .build();
        }
      }
    }
    return getRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestRequest,
      QueryOuterClass.QueryRequestResponse> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Request",
      requestType = QueryOuterClass.QueryRequestRequest.class,
      responseType = QueryOuterClass.QueryRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestRequest,
      QueryOuterClass.QueryRequestResponse> getRequestMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestRequest, QueryOuterClass.QueryRequestResponse> getRequestMethod;
    if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestMethod = QueryGrpc.getRequestMethod) == null) {
          QueryGrpc.getRequestMethod = getRequestMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryRequestRequest, QueryOuterClass.QueryRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Request"))
              .build();
        }
      }
    }
    return getRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsRequest,
      QueryOuterClass.QueryRequestsResponse> getRequestsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Requests",
      requestType = QueryOuterClass.QueryRequestsRequest.class,
      responseType = QueryOuterClass.QueryRequestsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsRequest,
      QueryOuterClass.QueryRequestsResponse> getRequestsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsRequest, QueryOuterClass.QueryRequestsResponse> getRequestsMethod;
    if ((getRequestsMethod = QueryGrpc.getRequestsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestsMethod = QueryGrpc.getRequestsMethod) == null) {
          QueryGrpc.getRequestsMethod = getRequestsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryRequestsRequest, QueryOuterClass.QueryRequestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Requests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Requests"))
              .build();
        }
      }
    }
    return getRequestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsByReqCtxRequest,
      QueryOuterClass.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestsByReqCtx",
      requestType = QueryOuterClass.QueryRequestsByReqCtxRequest.class,
      responseType = QueryOuterClass.QueryRequestsByReqCtxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsByReqCtxRequest,
      QueryOuterClass.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryRequestsByReqCtxRequest, QueryOuterClass.QueryRequestsByReqCtxResponse> getRequestsByReqCtxMethod;
    if ((getRequestsByReqCtxMethod = QueryGrpc.getRequestsByReqCtxMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getRequestsByReqCtxMethod = QueryGrpc.getRequestsByReqCtxMethod) == null) {
          QueryGrpc.getRequestsByReqCtxMethod = getRequestsByReqCtxMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryRequestsByReqCtxRequest, QueryOuterClass.QueryRequestsByReqCtxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestsByReqCtx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestsByReqCtxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryRequestsByReqCtxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("RequestsByReqCtx"))
              .build();
        }
      }
    }
    return getRequestsByReqCtxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryResponseRequest,
      QueryOuterClass.QueryResponseResponse> getResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Response",
      requestType = QueryOuterClass.QueryResponseRequest.class,
      responseType = QueryOuterClass.QueryResponseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryResponseRequest,
      QueryOuterClass.QueryResponseResponse> getResponseMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryResponseRequest, QueryOuterClass.QueryResponseResponse> getResponseMethod;
    if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResponseMethod = QueryGrpc.getResponseMethod) == null) {
          QueryGrpc.getResponseMethod = getResponseMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryResponseRequest, QueryOuterClass.QueryResponseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Response"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryResponseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryResponseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Response"))
              .build();
        }
      }
    }
    return getResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryResponsesRequest,
      QueryOuterClass.QueryResponsesResponse> getResponsesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Responses",
      requestType = QueryOuterClass.QueryResponsesRequest.class,
      responseType = QueryOuterClass.QueryResponsesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryResponsesRequest,
      QueryOuterClass.QueryResponsesResponse> getResponsesMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryResponsesRequest, QueryOuterClass.QueryResponsesResponse> getResponsesMethod;
    if ((getResponsesMethod = QueryGrpc.getResponsesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getResponsesMethod = QueryGrpc.getResponsesMethod) == null) {
          QueryGrpc.getResponsesMethod = getResponsesMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryResponsesRequest, QueryOuterClass.QueryResponsesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Responses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryResponsesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryResponsesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Responses"))
              .build();
        }
      }
    }
    return getResponsesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryEarnedFeesRequest,
      QueryOuterClass.QueryEarnedFeesResponse> getEarnedFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EarnedFees",
      requestType = QueryOuterClass.QueryEarnedFeesRequest.class,
      responseType = QueryOuterClass.QueryEarnedFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryEarnedFeesRequest,
      QueryOuterClass.QueryEarnedFeesResponse> getEarnedFeesMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryEarnedFeesRequest, QueryOuterClass.QueryEarnedFeesResponse> getEarnedFeesMethod;
    if ((getEarnedFeesMethod = QueryGrpc.getEarnedFeesMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getEarnedFeesMethod = QueryGrpc.getEarnedFeesMethod) == null) {
          QueryGrpc.getEarnedFeesMethod = getEarnedFeesMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryEarnedFeesRequest, QueryOuterClass.QueryEarnedFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EarnedFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryEarnedFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryEarnedFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("EarnedFees"))
              .build();
        }
      }
    }
    return getEarnedFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QuerySchemaRequest,
      QueryOuterClass.QuerySchemaResponse> getSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schema",
      requestType = QueryOuterClass.QuerySchemaRequest.class,
      responseType = QueryOuterClass.QuerySchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QuerySchemaRequest,
      QueryOuterClass.QuerySchemaResponse> getSchemaMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QuerySchemaRequest, QueryOuterClass.QuerySchemaResponse> getSchemaMethod;
    if ((getSchemaMethod = QueryGrpc.getSchemaMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getSchemaMethod = QueryGrpc.getSchemaMethod) == null) {
          QueryGrpc.getSchemaMethod = getSchemaMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QuerySchemaRequest, QueryOuterClass.QuerySchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QuerySchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Schema"))
              .build();
        }
      }
    }
    return getSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest,
      QueryOuterClass.QueryParamsResponse> getParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Params",
      requestType = QueryOuterClass.QueryParamsRequest.class,
      responseType = QueryOuterClass.QueryParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest,
      QueryOuterClass.QueryParamsResponse> getParamsMethod() {
    io.grpc.MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> getParamsMethod;
    if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
      synchronized (QueryGrpc.class) {
        if ((getParamsMethod = QueryGrpc.getParamsMethod) == null) {
          QueryGrpc.getParamsMethod = getParamsMethod =
              io.grpc.MethodDescriptor.<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QueryOuterClass.QueryParamsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryMethodDescriptorSupplier("Params"))
              .build();
        }
      }
    }
    return getParamsMethod;
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
   * Query creates service with iservice as rpc
   * </pre>
   */
  public static abstract class QueryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Definition returns service definition
     * </pre>
     */
    public void definition(QueryOuterClass.QueryDefinitionRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryDefinitionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public void binding(QueryOuterClass.QueryBindingRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public void bindings(QueryOuterClass.QueryBindingsRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public void withdrawAddress(QueryOuterClass.QueryWithdrawAddressRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public void requestContext(QueryOuterClass.QueryRequestContextRequest request,
                               io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public void request(QueryOuterClass.QueryRequestRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public void requests(QueryOuterClass.QueryRequestsRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public void requestsByReqCtx(QueryOuterClass.QueryRequestsByReqCtxRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsByReqCtxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestsByReqCtxMethod(), responseObserver);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public void response(QueryOuterClass.QueryResponseRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public void responses(QueryOuterClass.QueryResponsesRequest request,
                          io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponsesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResponsesMethod(), responseObserver);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public void earnedFees(QueryOuterClass.QueryEarnedFeesRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEarnedFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public void schema(QueryOuterClass.QuerySchemaRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QuerySchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public void params(QueryOuterClass.QueryParamsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDefinitionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryDefinitionRequest,
                QueryOuterClass.QueryDefinitionResponse>(
                  this, METHODID_DEFINITION)))
          .addMethod(
            getBindingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryBindingRequest,
                QueryOuterClass.QueryBindingResponse>(
                  this, METHODID_BINDING)))
          .addMethod(
            getBindingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryBindingsRequest,
                QueryOuterClass.QueryBindingsResponse>(
                  this, METHODID_BINDINGS)))
          .addMethod(
            getWithdrawAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryWithdrawAddressRequest,
                QueryOuterClass.QueryWithdrawAddressResponse>(
                  this, METHODID_WITHDRAW_ADDRESS)))
          .addMethod(
            getRequestContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryRequestContextRequest,
                QueryOuterClass.QueryRequestContextResponse>(
                  this, METHODID_REQUEST_CONTEXT)))
          .addMethod(
            getRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryRequestRequest,
                QueryOuterClass.QueryRequestResponse>(
                  this, METHODID_REQUEST)))
          .addMethod(
            getRequestsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryRequestsRequest,
                QueryOuterClass.QueryRequestsResponse>(
                  this, METHODID_REQUESTS)))
          .addMethod(
            getRequestsByReqCtxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryRequestsByReqCtxRequest,
                QueryOuterClass.QueryRequestsByReqCtxResponse>(
                  this, METHODID_REQUESTS_BY_REQ_CTX)))
          .addMethod(
            getResponseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryResponseRequest,
                QueryOuterClass.QueryResponseResponse>(
                  this, METHODID_RESPONSE)))
          .addMethod(
            getResponsesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryResponsesRequest,
                QueryOuterClass.QueryResponsesResponse>(
                  this, METHODID_RESPONSES)))
          .addMethod(
            getEarnedFeesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryEarnedFeesRequest,
                QueryOuterClass.QueryEarnedFeesResponse>(
                  this, METHODID_EARNED_FEES)))
          .addMethod(
            getSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QuerySchemaRequest,
                QueryOuterClass.QuerySchemaResponse>(
                  this, METHODID_SCHEMA)))
          .addMethod(
            getParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QueryOuterClass.QueryParamsRequest,
                QueryOuterClass.QueryParamsResponse>(
                  this, METHODID_PARAMS)))
          .build();
    }
  }

  /**
   * <pre>
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public void definition(QueryOuterClass.QueryDefinitionRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryDefinitionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public void binding(QueryOuterClass.QueryBindingRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public void bindings(QueryOuterClass.QueryBindingsRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public void withdrawAddress(QueryOuterClass.QueryWithdrawAddressRequest request,
                                io.grpc.stub.StreamObserver<QueryOuterClass.QueryWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public void requestContext(QueryOuterClass.QueryRequestContextRequest request,
                               io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public void request(QueryOuterClass.QueryRequestRequest request,
                        io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public void requests(QueryOuterClass.QueryRequestsRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public void requestsByReqCtx(QueryOuterClass.QueryRequestsByReqCtxRequest request,
                                 io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsByReqCtxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestsByReqCtxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public void response(QueryOuterClass.QueryResponseRequest request,
                         io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public void responses(QueryOuterClass.QueryResponsesRequest request,
                          io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponsesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResponsesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public void earnedFees(QueryOuterClass.QueryEarnedFeesRequest request,
                           io.grpc.stub.StreamObserver<QueryOuterClass.QueryEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEarnedFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public void schema(QueryOuterClass.QuerySchemaRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QuerySchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public void params(QueryOuterClass.QueryParamsRequest request,
                       io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public QueryOuterClass.QueryDefinitionResponse definition(QueryOuterClass.QueryDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public QueryOuterClass.QueryBindingResponse binding(QueryOuterClass.QueryBindingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public QueryOuterClass.QueryBindingsResponse bindings(QueryOuterClass.QueryBindingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public QueryOuterClass.QueryWithdrawAddressResponse withdrawAddress(QueryOuterClass.QueryWithdrawAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public QueryOuterClass.QueryRequestContextResponse requestContext(QueryOuterClass.QueryRequestContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public QueryOuterClass.QueryRequestResponse request(QueryOuterClass.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public QueryOuterClass.QueryRequestsResponse requests(QueryOuterClass.QueryRequestsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public QueryOuterClass.QueryRequestsByReqCtxResponse requestsByReqCtx(QueryOuterClass.QueryRequestsByReqCtxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestsByReqCtxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public QueryOuterClass.QueryResponseResponse response(QueryOuterClass.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public QueryOuterClass.QueryResponsesResponse responses(QueryOuterClass.QueryResponsesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResponsesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public QueryOuterClass.QueryEarnedFeesResponse earnedFees(QueryOuterClass.QueryEarnedFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEarnedFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public QueryOuterClass.QuerySchemaResponse schema(QueryOuterClass.QuerySchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public QueryOuterClass.QueryParamsResponse params(QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Query creates service with iservice as rpc
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
     * Definition returns service definition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryDefinitionResponse> definition(
        QueryOuterClass.QueryDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Binding returns service Binding with service name and provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryBindingResponse> binding(
        QueryOuterClass.QueryBindingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bindings returns all service Bindings with service name and owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryBindingsResponse> bindings(
        QueryOuterClass.QueryBindingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawAddress returns the withdraw address of the binding owner
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryWithdrawAddressResponse> withdrawAddress(
        QueryOuterClass.QueryWithdrawAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestContext returns the request context
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryRequestContextResponse> requestContext(
        QueryOuterClass.QueryRequestContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request returns the request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryRequestResponse> request(
        QueryOuterClass.QueryRequestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request returns all requests of one service with provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryRequestsResponse> requests(
        QueryOuterClass.QueryRequestsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RequestsByReqCtx returns all requests of one service call batch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryRequestsByReqCtxResponse> requestsByReqCtx(
        QueryOuterClass.QueryRequestsByReqCtxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestsByReqCtxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Response returns the response of request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryResponseResponse> response(
        QueryOuterClass.QueryResponseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Responses returns all responses of one service call batch
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryResponsesResponse> responses(
        QueryOuterClass.QueryResponsesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResponsesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EarnedFees returns the earned service fee of one provider
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryEarnedFeesResponse> earnedFees(
        QueryOuterClass.QueryEarnedFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEarnedFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Schema returns the schema
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QuerySchemaResponse> schema(
        QueryOuterClass.QuerySchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Params queries the service parameters
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<QueryOuterClass.QueryParamsResponse> params(
        QueryOuterClass.QueryParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEFINITION = 0;
  private static final int METHODID_BINDING = 1;
  private static final int METHODID_BINDINGS = 2;
  private static final int METHODID_WITHDRAW_ADDRESS = 3;
  private static final int METHODID_REQUEST_CONTEXT = 4;
  private static final int METHODID_REQUEST = 5;
  private static final int METHODID_REQUESTS = 6;
  private static final int METHODID_REQUESTS_BY_REQ_CTX = 7;
  private static final int METHODID_RESPONSE = 8;
  private static final int METHODID_RESPONSES = 9;
  private static final int METHODID_EARNED_FEES = 10;
  private static final int METHODID_SCHEMA = 11;
  private static final int METHODID_PARAMS = 12;

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
        case METHODID_DEFINITION:
          serviceImpl.definition((QueryOuterClass.QueryDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryDefinitionResponse>) responseObserver);
          break;
        case METHODID_BINDING:
          serviceImpl.binding((QueryOuterClass.QueryBindingRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingResponse>) responseObserver);
          break;
        case METHODID_BINDINGS:
          serviceImpl.bindings((QueryOuterClass.QueryBindingsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryBindingsResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_ADDRESS:
          serviceImpl.withdrawAddress((QueryOuterClass.QueryWithdrawAddressRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_REQUEST_CONTEXT:
          serviceImpl.requestContext((QueryOuterClass.QueryRequestContextRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestContextResponse>) responseObserver);
          break;
        case METHODID_REQUEST:
          serviceImpl.request((QueryOuterClass.QueryRequestRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestResponse>) responseObserver);
          break;
        case METHODID_REQUESTS:
          serviceImpl.requests((QueryOuterClass.QueryRequestsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsResponse>) responseObserver);
          break;
        case METHODID_REQUESTS_BY_REQ_CTX:
          serviceImpl.requestsByReqCtx((QueryOuterClass.QueryRequestsByReqCtxRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryRequestsByReqCtxResponse>) responseObserver);
          break;
        case METHODID_RESPONSE:
          serviceImpl.response((QueryOuterClass.QueryResponseRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponseResponse>) responseObserver);
          break;
        case METHODID_RESPONSES:
          serviceImpl.responses((QueryOuterClass.QueryResponsesRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryResponsesResponse>) responseObserver);
          break;
        case METHODID_EARNED_FEES:
          serviceImpl.earnedFees((QueryOuterClass.QueryEarnedFeesRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryEarnedFeesResponse>) responseObserver);
          break;
        case METHODID_SCHEMA:
          serviceImpl.schema((QueryOuterClass.QuerySchemaRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QuerySchemaResponse>) responseObserver);
          break;
        case METHODID_PARAMS:
          serviceImpl.params((QueryOuterClass.QueryParamsRequest) request,
              (io.grpc.stub.StreamObserver<QueryOuterClass.QueryParamsResponse>) responseObserver);
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
              .addMethod(getDefinitionMethod())
              .addMethod(getBindingMethod())
              .addMethod(getBindingsMethod())
              .addMethod(getWithdrawAddressMethod())
              .addMethod(getRequestContextMethod())
              .addMethod(getRequestMethod())
              .addMethod(getRequestsMethod())
              .addMethod(getRequestsByReqCtxMethod())
              .addMethod(getResponseMethod())
              .addMethod(getResponsesMethod())
              .addMethod(getEarnedFeesMethod())
              .addMethod(getSchemaMethod())
              .addMethod(getParamsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
