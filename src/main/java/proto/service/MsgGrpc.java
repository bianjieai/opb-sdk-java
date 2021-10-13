package proto.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: service/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.service.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Tx.MsgDefineService,
      Tx.MsgDefineServiceResponse> getDefineServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefineService",
      requestType = Tx.MsgDefineService.class,
      responseType = Tx.MsgDefineServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgDefineService,
      Tx.MsgDefineServiceResponse> getDefineServiceMethod() {
    io.grpc.MethodDescriptor<Tx.MsgDefineService, Tx.MsgDefineServiceResponse> getDefineServiceMethod;
    if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
          MsgGrpc.getDefineServiceMethod = getDefineServiceMethod =
              io.grpc.MethodDescriptor.<Tx.MsgDefineService, Tx.MsgDefineServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefineService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgDefineService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgDefineServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DefineService"))
              .build();
        }
      }
    }
    return getDefineServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgBindService,
      Tx.MsgBindServiceResponse> getBindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindService",
      requestType = Tx.MsgBindService.class,
      responseType = Tx.MsgBindServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgBindService,
      Tx.MsgBindServiceResponse> getBindServiceMethod() {
    io.grpc.MethodDescriptor<Tx.MsgBindService, Tx.MsgBindServiceResponse> getBindServiceMethod;
    if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
          MsgGrpc.getBindServiceMethod = getBindServiceMethod =
              io.grpc.MethodDescriptor.<Tx.MsgBindService, Tx.MsgBindServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBindService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgBindServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindService"))
              .build();
        }
      }
    }
    return getBindServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgUpdateServiceBinding,
      Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceBinding",
      requestType = Tx.MsgUpdateServiceBinding.class,
      responseType = Tx.MsgUpdateServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgUpdateServiceBinding,
      Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod() {
    io.grpc.MethodDescriptor<Tx.MsgUpdateServiceBinding, Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;
    if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
          MsgGrpc.getUpdateServiceBindingMethod = getUpdateServiceBindingMethod =
              io.grpc.MethodDescriptor.<Tx.MsgUpdateServiceBinding, Tx.MsgUpdateServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateServiceBinding"))
              .build();
        }
      }
    }
    return getUpdateServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgSetWithdrawAddress,
      Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawAddress",
      requestType = Tx.MsgSetWithdrawAddress.class,
      responseType = Tx.MsgSetWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgSetWithdrawAddress,
      Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<Tx.MsgSetWithdrawAddress, Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;
    if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
          MsgGrpc.getSetWithdrawAddressMethod = getSetWithdrawAddressMethod =
              io.grpc.MethodDescriptor.<Tx.MsgSetWithdrawAddress, Tx.MsgSetWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetWithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgSetWithdrawAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgSetWithdrawAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawAddress"))
              .build();
        }
      }
    }
    return getSetWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgEnableServiceBinding,
      Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableServiceBinding",
      requestType = Tx.MsgEnableServiceBinding.class,
      responseType = Tx.MsgEnableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgEnableServiceBinding,
      Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod() {
    io.grpc.MethodDescriptor<Tx.MsgEnableServiceBinding, Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;
    if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
          MsgGrpc.getEnableServiceBindingMethod = getEnableServiceBindingMethod =
              io.grpc.MethodDescriptor.<Tx.MsgEnableServiceBinding, Tx.MsgEnableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgEnableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgEnableServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnableServiceBinding"))
              .build();
        }
      }
    }
    return getEnableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgDisableServiceBinding,
      Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableServiceBinding",
      requestType = Tx.MsgDisableServiceBinding.class,
      responseType = Tx.MsgDisableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgDisableServiceBinding,
      Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod() {
    io.grpc.MethodDescriptor<Tx.MsgDisableServiceBinding, Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;
    if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
          MsgGrpc.getDisableServiceBindingMethod = getDisableServiceBindingMethod =
              io.grpc.MethodDescriptor.<Tx.MsgDisableServiceBinding, Tx.MsgDisableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgDisableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgDisableServiceBindingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisableServiceBinding"))
              .build();
        }
      }
    }
    return getDisableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgRefundServiceDeposit,
      Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundServiceDeposit",
      requestType = Tx.MsgRefundServiceDeposit.class,
      responseType = Tx.MsgRefundServiceDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgRefundServiceDeposit,
      Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod() {
    io.grpc.MethodDescriptor<Tx.MsgRefundServiceDeposit, Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;
    if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
          MsgGrpc.getRefundServiceDepositMethod = getRefundServiceDepositMethod =
              io.grpc.MethodDescriptor.<Tx.MsgRefundServiceDeposit, Tx.MsgRefundServiceDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefundServiceDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRefundServiceDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRefundServiceDepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RefundServiceDeposit"))
              .build();
        }
      }
    }
    return getRefundServiceDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgCallService,
      Tx.MsgCallServiceResponse> getCallServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallService",
      requestType = Tx.MsgCallService.class,
      responseType = Tx.MsgCallServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgCallService,
      Tx.MsgCallServiceResponse> getCallServiceMethod() {
    io.grpc.MethodDescriptor<Tx.MsgCallService, Tx.MsgCallServiceResponse> getCallServiceMethod;
    if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
          MsgGrpc.getCallServiceMethod = getCallServiceMethod =
              io.grpc.MethodDescriptor.<Tx.MsgCallService, Tx.MsgCallServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgCallService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgCallServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CallService"))
              .build();
        }
      }
    }
    return getCallServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgRespondService,
      Tx.MsgRespondServiceResponse> getRespondServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondService",
      requestType = Tx.MsgRespondService.class,
      responseType = Tx.MsgRespondServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgRespondService,
      Tx.MsgRespondServiceResponse> getRespondServiceMethod() {
    io.grpc.MethodDescriptor<Tx.MsgRespondService, Tx.MsgRespondServiceResponse> getRespondServiceMethod;
    if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
          MsgGrpc.getRespondServiceMethod = getRespondServiceMethod =
              io.grpc.MethodDescriptor.<Tx.MsgRespondService, Tx.MsgRespondServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRespondService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgRespondServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RespondService"))
              .build();
        }
      }
    }
    return getRespondServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgPauseRequestContext,
      Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseRequestContext",
      requestType = Tx.MsgPauseRequestContext.class,
      responseType = Tx.MsgPauseRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgPauseRequestContext,
      Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod() {
    io.grpc.MethodDescriptor<Tx.MsgPauseRequestContext, Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod;
    if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
          MsgGrpc.getPauseRequestContextMethod = getPauseRequestContextMethod =
              io.grpc.MethodDescriptor.<Tx.MsgPauseRequestContext, Tx.MsgPauseRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgPauseRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgPauseRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseRequestContext"))
              .build();
        }
      }
    }
    return getPauseRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgStartRequestContext,
      Tx.MsgStartRequestContextResponse> getStartRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRequestContext",
      requestType = Tx.MsgStartRequestContext.class,
      responseType = Tx.MsgStartRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgStartRequestContext,
      Tx.MsgStartRequestContextResponse> getStartRequestContextMethod() {
    io.grpc.MethodDescriptor<Tx.MsgStartRequestContext, Tx.MsgStartRequestContextResponse> getStartRequestContextMethod;
    if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
          MsgGrpc.getStartRequestContextMethod = getStartRequestContextMethod =
              io.grpc.MethodDescriptor.<Tx.MsgStartRequestContext, Tx.MsgStartRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgStartRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgStartRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StartRequestContext"))
              .build();
        }
      }
    }
    return getStartRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgKillRequestContext,
      Tx.MsgKillRequestContextResponse> getKillRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KillRequestContext",
      requestType = Tx.MsgKillRequestContext.class,
      responseType = Tx.MsgKillRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgKillRequestContext,
      Tx.MsgKillRequestContextResponse> getKillRequestContextMethod() {
    io.grpc.MethodDescriptor<Tx.MsgKillRequestContext, Tx.MsgKillRequestContextResponse> getKillRequestContextMethod;
    if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
          MsgGrpc.getKillRequestContextMethod = getKillRequestContextMethod =
              io.grpc.MethodDescriptor.<Tx.MsgKillRequestContext, Tx.MsgKillRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KillRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgKillRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgKillRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("KillRequestContext"))
              .build();
        }
      }
    }
    return getKillRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgUpdateRequestContext,
      Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRequestContext",
      requestType = Tx.MsgUpdateRequestContext.class,
      responseType = Tx.MsgUpdateRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgUpdateRequestContext,
      Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod() {
    io.grpc.MethodDescriptor<Tx.MsgUpdateRequestContext, Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;
    if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
          MsgGrpc.getUpdateRequestContextMethod = getUpdateRequestContextMethod =
              io.grpc.MethodDescriptor.<Tx.MsgUpdateRequestContext, Tx.MsgUpdateRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgUpdateRequestContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRequestContext"))
              .build();
        }
      }
    }
    return getUpdateRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Tx.MsgWithdrawEarnedFees,
      Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawEarnedFees",
      requestType = Tx.MsgWithdrawEarnedFees.class,
      responseType = Tx.MsgWithdrawEarnedFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Tx.MsgWithdrawEarnedFees,
      Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod() {
    io.grpc.MethodDescriptor<Tx.MsgWithdrawEarnedFees, Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;
    if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
          MsgGrpc.getWithdrawEarnedFeesMethod = getWithdrawEarnedFeesMethod =
              io.grpc.MethodDescriptor.<Tx.MsgWithdrawEarnedFees, Tx.MsgWithdrawEarnedFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WithdrawEarnedFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgWithdrawEarnedFees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Tx.MsgWithdrawEarnedFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MsgMethodDescriptorSupplier("WithdrawEarnedFees"))
              .build();
        }
      }
    }
    return getWithdrawEarnedFeesMethod;
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
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public void defineService(Tx.MsgDefineService request,
                              io.grpc.stub.StreamObserver<Tx.MsgDefineServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefineServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public void bindService(Tx.MsgBindService request,
                            io.grpc.stub.StreamObserver<Tx.MsgBindServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public void updateServiceBinding(Tx.MsgUpdateServiceBinding request,
                                     io.grpc.stub.StreamObserver<Tx.MsgUpdateServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public void setWithdrawAddress(Tx.MsgSetWithdrawAddress request,
                                   io.grpc.stub.StreamObserver<Tx.MsgSetWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public void enableServiceBinding(Tx.MsgEnableServiceBinding request,
                                     io.grpc.stub.StreamObserver<Tx.MsgEnableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public void disableServiceBinding(Tx.MsgDisableServiceBinding request,
                                      io.grpc.stub.StreamObserver<Tx.MsgDisableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public void refundServiceDeposit(Tx.MsgRefundServiceDeposit request,
                                     io.grpc.stub.StreamObserver<Tx.MsgRefundServiceDepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefundServiceDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public void callService(Tx.MsgCallService request,
                            io.grpc.stub.StreamObserver<Tx.MsgCallServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public void respondService(Tx.MsgRespondService request,
                               io.grpc.stub.StreamObserver<Tx.MsgRespondServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public void pauseRequestContext(Tx.MsgPauseRequestContext request,
                                    io.grpc.stub.StreamObserver<Tx.MsgPauseRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public void startRequestContext(Tx.MsgStartRequestContext request,
                                    io.grpc.stub.StreamObserver<Tx.MsgStartRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public void killRequestContext(Tx.MsgKillRequestContext request,
                                   io.grpc.stub.StreamObserver<Tx.MsgKillRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKillRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public void updateRequestContext(Tx.MsgUpdateRequestContext request,
                                     io.grpc.stub.StreamObserver<Tx.MsgUpdateRequestContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public void withdrawEarnedFees(Tx.MsgWithdrawEarnedFees request,
                                   io.grpc.stub.StreamObserver<Tx.MsgWithdrawEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawEarnedFeesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDefineServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgDefineService,
                Tx.MsgDefineServiceResponse>(
                  this, METHODID_DEFINE_SERVICE)))
          .addMethod(
            getBindServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgBindService,
                Tx.MsgBindServiceResponse>(
                  this, METHODID_BIND_SERVICE)))
          .addMethod(
            getUpdateServiceBindingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgUpdateServiceBinding,
                Tx.MsgUpdateServiceBindingResponse>(
                  this, METHODID_UPDATE_SERVICE_BINDING)))
          .addMethod(
            getSetWithdrawAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgSetWithdrawAddress,
                Tx.MsgSetWithdrawAddressResponse>(
                  this, METHODID_SET_WITHDRAW_ADDRESS)))
          .addMethod(
            getEnableServiceBindingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgEnableServiceBinding,
                Tx.MsgEnableServiceBindingResponse>(
                  this, METHODID_ENABLE_SERVICE_BINDING)))
          .addMethod(
            getDisableServiceBindingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgDisableServiceBinding,
                Tx.MsgDisableServiceBindingResponse>(
                  this, METHODID_DISABLE_SERVICE_BINDING)))
          .addMethod(
            getRefundServiceDepositMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgRefundServiceDeposit,
                Tx.MsgRefundServiceDepositResponse>(
                  this, METHODID_REFUND_SERVICE_DEPOSIT)))
          .addMethod(
            getCallServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgCallService,
                Tx.MsgCallServiceResponse>(
                  this, METHODID_CALL_SERVICE)))
          .addMethod(
            getRespondServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgRespondService,
                Tx.MsgRespondServiceResponse>(
                  this, METHODID_RESPOND_SERVICE)))
          .addMethod(
            getPauseRequestContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgPauseRequestContext,
                Tx.MsgPauseRequestContextResponse>(
                  this, METHODID_PAUSE_REQUEST_CONTEXT)))
          .addMethod(
            getStartRequestContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgStartRequestContext,
                Tx.MsgStartRequestContextResponse>(
                  this, METHODID_START_REQUEST_CONTEXT)))
          .addMethod(
            getKillRequestContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgKillRequestContext,
                Tx.MsgKillRequestContextResponse>(
                  this, METHODID_KILL_REQUEST_CONTEXT)))
          .addMethod(
            getUpdateRequestContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgUpdateRequestContext,
                Tx.MsgUpdateRequestContextResponse>(
                  this, METHODID_UPDATE_REQUEST_CONTEXT)))
          .addMethod(
            getWithdrawEarnedFeesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Tx.MsgWithdrawEarnedFees,
                Tx.MsgWithdrawEarnedFeesResponse>(
                  this, METHODID_WITHDRAW_EARNED_FEES)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public void defineService(Tx.MsgDefineService request,
                              io.grpc.stub.StreamObserver<Tx.MsgDefineServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public void bindService(Tx.MsgBindService request,
                            io.grpc.stub.StreamObserver<Tx.MsgBindServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public void updateServiceBinding(Tx.MsgUpdateServiceBinding request,
                                     io.grpc.stub.StreamObserver<Tx.MsgUpdateServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public void setWithdrawAddress(Tx.MsgSetWithdrawAddress request,
                                   io.grpc.stub.StreamObserver<Tx.MsgSetWithdrawAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public void enableServiceBinding(Tx.MsgEnableServiceBinding request,
                                     io.grpc.stub.StreamObserver<Tx.MsgEnableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public void disableServiceBinding(Tx.MsgDisableServiceBinding request,
                                      io.grpc.stub.StreamObserver<Tx.MsgDisableServiceBindingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public void refundServiceDeposit(Tx.MsgRefundServiceDeposit request,
                                     io.grpc.stub.StreamObserver<Tx.MsgRefundServiceDepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public void callService(Tx.MsgCallService request,
                            io.grpc.stub.StreamObserver<Tx.MsgCallServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public void respondService(Tx.MsgRespondService request,
                               io.grpc.stub.StreamObserver<Tx.MsgRespondServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public void pauseRequestContext(Tx.MsgPauseRequestContext request,
                                    io.grpc.stub.StreamObserver<Tx.MsgPauseRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public void startRequestContext(Tx.MsgStartRequestContext request,
                                    io.grpc.stub.StreamObserver<Tx.MsgStartRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public void killRequestContext(Tx.MsgKillRequestContext request,
                                   io.grpc.stub.StreamObserver<Tx.MsgKillRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public void updateRequestContext(Tx.MsgUpdateRequestContext request,
                                     io.grpc.stub.StreamObserver<Tx.MsgUpdateRequestContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public void withdrawEarnedFees(Tx.MsgWithdrawEarnedFees request,
                                   io.grpc.stub.StreamObserver<Tx.MsgWithdrawEarnedFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawEarnedFeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public Tx.MsgDefineServiceResponse defineService(Tx.MsgDefineService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefineServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public Tx.MsgBindServiceResponse bindService(Tx.MsgBindService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public Tx.MsgUpdateServiceBindingResponse updateServiceBinding(Tx.MsgUpdateServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public Tx.MsgSetWithdrawAddressResponse setWithdrawAddress(Tx.MsgSetWithdrawAddress request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public Tx.MsgEnableServiceBindingResponse enableServiceBinding(Tx.MsgEnableServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public Tx.MsgDisableServiceBindingResponse disableServiceBinding(Tx.MsgDisableServiceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public Tx.MsgRefundServiceDepositResponse refundServiceDeposit(Tx.MsgRefundServiceDeposit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefundServiceDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public Tx.MsgCallServiceResponse callService(Tx.MsgCallService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public Tx.MsgRespondServiceResponse respondService(Tx.MsgRespondService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public Tx.MsgPauseRequestContextResponse pauseRequestContext(Tx.MsgPauseRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public Tx.MsgStartRequestContextResponse startRequestContext(Tx.MsgStartRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public Tx.MsgKillRequestContextResponse killRequestContext(Tx.MsgKillRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKillRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public Tx.MsgUpdateRequestContextResponse updateRequestContext(Tx.MsgUpdateRequestContext request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public Tx.MsgWithdrawEarnedFeesResponse withdrawEarnedFees(Tx.MsgWithdrawEarnedFees request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawEarnedFeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgDefineServiceResponse> defineService(
        Tx.MsgDefineService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgBindServiceResponse> bindService(
        Tx.MsgBindService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgUpdateServiceBindingResponse> updateServiceBinding(
        Tx.MsgUpdateServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgSetWithdrawAddressResponse> setWithdrawAddress(
        Tx.MsgSetWithdrawAddress request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgEnableServiceBindingResponse> enableServiceBinding(
        Tx.MsgEnableServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgDisableServiceBindingResponse> disableServiceBinding(
        Tx.MsgDisableServiceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgRefundServiceDepositResponse> refundServiceDeposit(
        Tx.MsgRefundServiceDeposit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgCallServiceResponse> callService(
        Tx.MsgCallService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgRespondServiceResponse> respondService(
        Tx.MsgRespondService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgPauseRequestContextResponse> pauseRequestContext(
        Tx.MsgPauseRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgStartRequestContextResponse> startRequestContext(
        Tx.MsgStartRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgKillRequestContextResponse> killRequestContext(
        Tx.MsgKillRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgUpdateRequestContextResponse> updateRequestContext(
        Tx.MsgUpdateRequestContext request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Tx.MsgWithdrawEarnedFeesResponse> withdrawEarnedFees(
        Tx.MsgWithdrawEarnedFees request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawEarnedFeesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEFINE_SERVICE = 0;
  private static final int METHODID_BIND_SERVICE = 1;
  private static final int METHODID_UPDATE_SERVICE_BINDING = 2;
  private static final int METHODID_SET_WITHDRAW_ADDRESS = 3;
  private static final int METHODID_ENABLE_SERVICE_BINDING = 4;
  private static final int METHODID_DISABLE_SERVICE_BINDING = 5;
  private static final int METHODID_REFUND_SERVICE_DEPOSIT = 6;
  private static final int METHODID_CALL_SERVICE = 7;
  private static final int METHODID_RESPOND_SERVICE = 8;
  private static final int METHODID_PAUSE_REQUEST_CONTEXT = 9;
  private static final int METHODID_START_REQUEST_CONTEXT = 10;
  private static final int METHODID_KILL_REQUEST_CONTEXT = 11;
  private static final int METHODID_UPDATE_REQUEST_CONTEXT = 12;
  private static final int METHODID_WITHDRAW_EARNED_FEES = 13;

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
        case METHODID_DEFINE_SERVICE:
          serviceImpl.defineService((Tx.MsgDefineService) request,
              (io.grpc.stub.StreamObserver<Tx.MsgDefineServiceResponse>) responseObserver);
          break;
        case METHODID_BIND_SERVICE:
          serviceImpl.bindService((Tx.MsgBindService) request,
              (io.grpc.stub.StreamObserver<Tx.MsgBindServiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_BINDING:
          serviceImpl.updateServiceBinding((Tx.MsgUpdateServiceBinding) request,
              (io.grpc.stub.StreamObserver<Tx.MsgUpdateServiceBindingResponse>) responseObserver);
          break;
        case METHODID_SET_WITHDRAW_ADDRESS:
          serviceImpl.setWithdrawAddress((Tx.MsgSetWithdrawAddress) request,
              (io.grpc.stub.StreamObserver<Tx.MsgSetWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SERVICE_BINDING:
          serviceImpl.enableServiceBinding((Tx.MsgEnableServiceBinding) request,
              (io.grpc.stub.StreamObserver<Tx.MsgEnableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_DISABLE_SERVICE_BINDING:
          serviceImpl.disableServiceBinding((Tx.MsgDisableServiceBinding) request,
              (io.grpc.stub.StreamObserver<Tx.MsgDisableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_REFUND_SERVICE_DEPOSIT:
          serviceImpl.refundServiceDeposit((Tx.MsgRefundServiceDeposit) request,
              (io.grpc.stub.StreamObserver<Tx.MsgRefundServiceDepositResponse>) responseObserver);
          break;
        case METHODID_CALL_SERVICE:
          serviceImpl.callService((Tx.MsgCallService) request,
              (io.grpc.stub.StreamObserver<Tx.MsgCallServiceResponse>) responseObserver);
          break;
        case METHODID_RESPOND_SERVICE:
          serviceImpl.respondService((Tx.MsgRespondService) request,
              (io.grpc.stub.StreamObserver<Tx.MsgRespondServiceResponse>) responseObserver);
          break;
        case METHODID_PAUSE_REQUEST_CONTEXT:
          serviceImpl.pauseRequestContext((Tx.MsgPauseRequestContext) request,
              (io.grpc.stub.StreamObserver<Tx.MsgPauseRequestContextResponse>) responseObserver);
          break;
        case METHODID_START_REQUEST_CONTEXT:
          serviceImpl.startRequestContext((Tx.MsgStartRequestContext) request,
              (io.grpc.stub.StreamObserver<Tx.MsgStartRequestContextResponse>) responseObserver);
          break;
        case METHODID_KILL_REQUEST_CONTEXT:
          serviceImpl.killRequestContext((Tx.MsgKillRequestContext) request,
              (io.grpc.stub.StreamObserver<Tx.MsgKillRequestContextResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REQUEST_CONTEXT:
          serviceImpl.updateRequestContext((Tx.MsgUpdateRequestContext) request,
              (io.grpc.stub.StreamObserver<Tx.MsgUpdateRequestContextResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_EARNED_FEES:
          serviceImpl.withdrawEarnedFees((Tx.MsgWithdrawEarnedFees) request,
              (io.grpc.stub.StreamObserver<Tx.MsgWithdrawEarnedFeesResponse>) responseObserver);
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
              .addMethod(getDefineServiceMethod())
              .addMethod(getBindServiceMethod())
              .addMethod(getUpdateServiceBindingMethod())
              .addMethod(getSetWithdrawAddressMethod())
              .addMethod(getEnableServiceBindingMethod())
              .addMethod(getDisableServiceBindingMethod())
              .addMethod(getRefundServiceDepositMethod())
              .addMethod(getCallServiceMethod())
              .addMethod(getRespondServiceMethod())
              .addMethod(getPauseRequestContextMethod())
              .addMethod(getStartRequestContextMethod())
              .addMethod(getKillRequestContextMethod())
              .addMethod(getUpdateRequestContextMethod())
              .addMethod(getWithdrawEarnedFeesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
