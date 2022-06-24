package proto.service;

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
 * Msg defines the oracle Msg service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: service/tx.proto")
public final class MsgGrpc {

  private MsgGrpc() {}

  public static final String SERVICE_NAME = "irismod.service.Msg";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgDefineService,
      proto.service.Tx.MsgDefineServiceResponse> getDefineServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefineService",
      requestType = proto.service.Tx.MsgDefineService.class,
      responseType = proto.service.Tx.MsgDefineServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgDefineService,
      proto.service.Tx.MsgDefineServiceResponse> getDefineServiceMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgDefineService, proto.service.Tx.MsgDefineServiceResponse> getDefineServiceMethod;
    if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDefineServiceMethod = MsgGrpc.getDefineServiceMethod) == null) {
          MsgGrpc.getDefineServiceMethod = getDefineServiceMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgDefineService, proto.service.Tx.MsgDefineServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "DefineService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgDefineService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgDefineServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DefineService"))
                  .build();
          }
        }
     }
     return getDefineServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgBindService,
      proto.service.Tx.MsgBindServiceResponse> getBindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindService",
      requestType = proto.service.Tx.MsgBindService.class,
      responseType = proto.service.Tx.MsgBindServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgBindService,
      proto.service.Tx.MsgBindServiceResponse> getBindServiceMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgBindService, proto.service.Tx.MsgBindServiceResponse> getBindServiceMethod;
    if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getBindServiceMethod = MsgGrpc.getBindServiceMethod) == null) {
          MsgGrpc.getBindServiceMethod = getBindServiceMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgBindService, proto.service.Tx.MsgBindServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "BindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgBindService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgBindServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("BindService"))
                  .build();
          }
        }
     }
     return getBindServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateServiceBinding,
      proto.service.Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServiceBinding",
      requestType = proto.service.Tx.MsgUpdateServiceBinding.class,
      responseType = proto.service.Tx.MsgUpdateServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateServiceBinding,
      proto.service.Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateServiceBinding, proto.service.Tx.MsgUpdateServiceBindingResponse> getUpdateServiceBindingMethod;
    if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateServiceBindingMethod = MsgGrpc.getUpdateServiceBindingMethod) == null) {
          MsgGrpc.getUpdateServiceBindingMethod = getUpdateServiceBindingMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgUpdateServiceBinding, proto.service.Tx.MsgUpdateServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "UpdateServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgUpdateServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgUpdateServiceBindingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateServiceBinding"))
                  .build();
          }
        }
     }
     return getUpdateServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgSetWithdrawAddress,
      proto.service.Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetWithdrawAddress",
      requestType = proto.service.Tx.MsgSetWithdrawAddress.class,
      responseType = proto.service.Tx.MsgSetWithdrawAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgSetWithdrawAddress,
      proto.service.Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgSetWithdrawAddress, proto.service.Tx.MsgSetWithdrawAddressResponse> getSetWithdrawAddressMethod;
    if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getSetWithdrawAddressMethod = MsgGrpc.getSetWithdrawAddressMethod) == null) {
          MsgGrpc.getSetWithdrawAddressMethod = getSetWithdrawAddressMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgSetWithdrawAddress, proto.service.Tx.MsgSetWithdrawAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "SetWithdrawAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgSetWithdrawAddress.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgSetWithdrawAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("SetWithdrawAddress"))
                  .build();
          }
        }
     }
     return getSetWithdrawAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgEnableServiceBinding,
      proto.service.Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableServiceBinding",
      requestType = proto.service.Tx.MsgEnableServiceBinding.class,
      responseType = proto.service.Tx.MsgEnableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgEnableServiceBinding,
      proto.service.Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgEnableServiceBinding, proto.service.Tx.MsgEnableServiceBindingResponse> getEnableServiceBindingMethod;
    if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getEnableServiceBindingMethod = MsgGrpc.getEnableServiceBindingMethod) == null) {
          MsgGrpc.getEnableServiceBindingMethod = getEnableServiceBindingMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgEnableServiceBinding, proto.service.Tx.MsgEnableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "EnableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgEnableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgEnableServiceBindingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("EnableServiceBinding"))
                  .build();
          }
        }
     }
     return getEnableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgDisableServiceBinding,
      proto.service.Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableServiceBinding",
      requestType = proto.service.Tx.MsgDisableServiceBinding.class,
      responseType = proto.service.Tx.MsgDisableServiceBindingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgDisableServiceBinding,
      proto.service.Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgDisableServiceBinding, proto.service.Tx.MsgDisableServiceBindingResponse> getDisableServiceBindingMethod;
    if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getDisableServiceBindingMethod = MsgGrpc.getDisableServiceBindingMethod) == null) {
          MsgGrpc.getDisableServiceBindingMethod = getDisableServiceBindingMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgDisableServiceBinding, proto.service.Tx.MsgDisableServiceBindingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "DisableServiceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgDisableServiceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgDisableServiceBindingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("DisableServiceBinding"))
                  .build();
          }
        }
     }
     return getDisableServiceBindingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgRefundServiceDeposit,
      proto.service.Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefundServiceDeposit",
      requestType = proto.service.Tx.MsgRefundServiceDeposit.class,
      responseType = proto.service.Tx.MsgRefundServiceDepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgRefundServiceDeposit,
      proto.service.Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgRefundServiceDeposit, proto.service.Tx.MsgRefundServiceDepositResponse> getRefundServiceDepositMethod;
    if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRefundServiceDepositMethod = MsgGrpc.getRefundServiceDepositMethod) == null) {
          MsgGrpc.getRefundServiceDepositMethod = getRefundServiceDepositMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgRefundServiceDeposit, proto.service.Tx.MsgRefundServiceDepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "RefundServiceDeposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgRefundServiceDeposit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgRefundServiceDepositResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RefundServiceDeposit"))
                  .build();
          }
        }
     }
     return getRefundServiceDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgCallService,
      proto.service.Tx.MsgCallServiceResponse> getCallServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallService",
      requestType = proto.service.Tx.MsgCallService.class,
      responseType = proto.service.Tx.MsgCallServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgCallService,
      proto.service.Tx.MsgCallServiceResponse> getCallServiceMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgCallService, proto.service.Tx.MsgCallServiceResponse> getCallServiceMethod;
    if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getCallServiceMethod = MsgGrpc.getCallServiceMethod) == null) {
          MsgGrpc.getCallServiceMethod = getCallServiceMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgCallService, proto.service.Tx.MsgCallServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "CallService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgCallService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgCallServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("CallService"))
                  .build();
          }
        }
     }
     return getCallServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgRespondService,
      proto.service.Tx.MsgRespondServiceResponse> getRespondServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondService",
      requestType = proto.service.Tx.MsgRespondService.class,
      responseType = proto.service.Tx.MsgRespondServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgRespondService,
      proto.service.Tx.MsgRespondServiceResponse> getRespondServiceMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgRespondService, proto.service.Tx.MsgRespondServiceResponse> getRespondServiceMethod;
    if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getRespondServiceMethod = MsgGrpc.getRespondServiceMethod) == null) {
          MsgGrpc.getRespondServiceMethod = getRespondServiceMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgRespondService, proto.service.Tx.MsgRespondServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "RespondService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgRespondService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgRespondServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("RespondService"))
                  .build();
          }
        }
     }
     return getRespondServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgPauseRequestContext,
      proto.service.Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseRequestContext",
      requestType = proto.service.Tx.MsgPauseRequestContext.class,
      responseType = proto.service.Tx.MsgPauseRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgPauseRequestContext,
      proto.service.Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgPauseRequestContext, proto.service.Tx.MsgPauseRequestContextResponse> getPauseRequestContextMethod;
    if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getPauseRequestContextMethod = MsgGrpc.getPauseRequestContextMethod) == null) {
          MsgGrpc.getPauseRequestContextMethod = getPauseRequestContextMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgPauseRequestContext, proto.service.Tx.MsgPauseRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "PauseRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgPauseRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgPauseRequestContextResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("PauseRequestContext"))
                  .build();
          }
        }
     }
     return getPauseRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgStartRequestContext,
      proto.service.Tx.MsgStartRequestContextResponse> getStartRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRequestContext",
      requestType = proto.service.Tx.MsgStartRequestContext.class,
      responseType = proto.service.Tx.MsgStartRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgStartRequestContext,
      proto.service.Tx.MsgStartRequestContextResponse> getStartRequestContextMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgStartRequestContext, proto.service.Tx.MsgStartRequestContextResponse> getStartRequestContextMethod;
    if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getStartRequestContextMethod = MsgGrpc.getStartRequestContextMethod) == null) {
          MsgGrpc.getStartRequestContextMethod = getStartRequestContextMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgStartRequestContext, proto.service.Tx.MsgStartRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "StartRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgStartRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgStartRequestContextResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("StartRequestContext"))
                  .build();
          }
        }
     }
     return getStartRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgKillRequestContext,
      proto.service.Tx.MsgKillRequestContextResponse> getKillRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KillRequestContext",
      requestType = proto.service.Tx.MsgKillRequestContext.class,
      responseType = proto.service.Tx.MsgKillRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgKillRequestContext,
      proto.service.Tx.MsgKillRequestContextResponse> getKillRequestContextMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgKillRequestContext, proto.service.Tx.MsgKillRequestContextResponse> getKillRequestContextMethod;
    if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getKillRequestContextMethod = MsgGrpc.getKillRequestContextMethod) == null) {
          MsgGrpc.getKillRequestContextMethod = getKillRequestContextMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgKillRequestContext, proto.service.Tx.MsgKillRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "KillRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgKillRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgKillRequestContextResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("KillRequestContext"))
                  .build();
          }
        }
     }
     return getKillRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateRequestContext,
      proto.service.Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRequestContext",
      requestType = proto.service.Tx.MsgUpdateRequestContext.class,
      responseType = proto.service.Tx.MsgUpdateRequestContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateRequestContext,
      proto.service.Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgUpdateRequestContext, proto.service.Tx.MsgUpdateRequestContextResponse> getUpdateRequestContextMethod;
    if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getUpdateRequestContextMethod = MsgGrpc.getUpdateRequestContextMethod) == null) {
          MsgGrpc.getUpdateRequestContextMethod = getUpdateRequestContextMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgUpdateRequestContext, proto.service.Tx.MsgUpdateRequestContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "UpdateRequestContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgUpdateRequestContext.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgUpdateRequestContextResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MsgMethodDescriptorSupplier("UpdateRequestContext"))
                  .build();
          }
        }
     }
     return getUpdateRequestContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.service.Tx.MsgWithdrawEarnedFees,
      proto.service.Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WithdrawEarnedFees",
      requestType = proto.service.Tx.MsgWithdrawEarnedFees.class,
      responseType = proto.service.Tx.MsgWithdrawEarnedFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.service.Tx.MsgWithdrawEarnedFees,
      proto.service.Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod() {
    io.grpc.MethodDescriptor<proto.service.Tx.MsgWithdrawEarnedFees, proto.service.Tx.MsgWithdrawEarnedFeesResponse> getWithdrawEarnedFeesMethod;
    if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
      synchronized (MsgGrpc.class) {
        if ((getWithdrawEarnedFeesMethod = MsgGrpc.getWithdrawEarnedFeesMethod) == null) {
          MsgGrpc.getWithdrawEarnedFeesMethod = getWithdrawEarnedFeesMethod = 
              io.grpc.MethodDescriptor.<proto.service.Tx.MsgWithdrawEarnedFees, proto.service.Tx.MsgWithdrawEarnedFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "irismod.service.Msg", "WithdrawEarnedFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgWithdrawEarnedFees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.service.Tx.MsgWithdrawEarnedFeesResponse.getDefaultInstance()))
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
   * Msg defines the oracle Msg service.
   * </pre>
   */
  public static abstract class MsgImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public void defineService(proto.service.Tx.MsgDefineService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgDefineServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDefineServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public void bindService(proto.service.Tx.MsgBindService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgBindServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBindServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public void updateServiceBinding(proto.service.Tx.MsgUpdateServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateServiceBindingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public void setWithdrawAddress(proto.service.Tx.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgSetWithdrawAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetWithdrawAddressMethod(), responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public void enableServiceBinding(proto.service.Tx.MsgEnableServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgEnableServiceBindingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public void disableServiceBinding(proto.service.Tx.MsgDisableServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgDisableServiceBindingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableServiceBindingMethod(), responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public void refundServiceDeposit(proto.service.Tx.MsgRefundServiceDeposit request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgRefundServiceDepositResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRefundServiceDepositMethod(), responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public void callService(proto.service.Tx.MsgCallService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgCallServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCallServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public void respondService(proto.service.Tx.MsgRespondService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgRespondServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRespondServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public void pauseRequestContext(proto.service.Tx.MsgPauseRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgPauseRequestContextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public void startRequestContext(proto.service.Tx.MsgStartRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgStartRequestContextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public void killRequestContext(proto.service.Tx.MsgKillRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgKillRequestContextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKillRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public void updateRequestContext(proto.service.Tx.MsgUpdateRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateRequestContextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateRequestContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public void withdrawEarnedFees(proto.service.Tx.MsgWithdrawEarnedFees request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgWithdrawEarnedFeesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawEarnedFeesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDefineServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgDefineService,
                proto.service.Tx.MsgDefineServiceResponse>(
                  this, METHODID_DEFINE_SERVICE)))
          .addMethod(
            getBindServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgBindService,
                proto.service.Tx.MsgBindServiceResponse>(
                  this, METHODID_BIND_SERVICE)))
          .addMethod(
            getUpdateServiceBindingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgUpdateServiceBinding,
                proto.service.Tx.MsgUpdateServiceBindingResponse>(
                  this, METHODID_UPDATE_SERVICE_BINDING)))
          .addMethod(
            getSetWithdrawAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgSetWithdrawAddress,
                proto.service.Tx.MsgSetWithdrawAddressResponse>(
                  this, METHODID_SET_WITHDRAW_ADDRESS)))
          .addMethod(
            getEnableServiceBindingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgEnableServiceBinding,
                proto.service.Tx.MsgEnableServiceBindingResponse>(
                  this, METHODID_ENABLE_SERVICE_BINDING)))
          .addMethod(
            getDisableServiceBindingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgDisableServiceBinding,
                proto.service.Tx.MsgDisableServiceBindingResponse>(
                  this, METHODID_DISABLE_SERVICE_BINDING)))
          .addMethod(
            getRefundServiceDepositMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgRefundServiceDeposit,
                proto.service.Tx.MsgRefundServiceDepositResponse>(
                  this, METHODID_REFUND_SERVICE_DEPOSIT)))
          .addMethod(
            getCallServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgCallService,
                proto.service.Tx.MsgCallServiceResponse>(
                  this, METHODID_CALL_SERVICE)))
          .addMethod(
            getRespondServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgRespondService,
                proto.service.Tx.MsgRespondServiceResponse>(
                  this, METHODID_RESPOND_SERVICE)))
          .addMethod(
            getPauseRequestContextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgPauseRequestContext,
                proto.service.Tx.MsgPauseRequestContextResponse>(
                  this, METHODID_PAUSE_REQUEST_CONTEXT)))
          .addMethod(
            getStartRequestContextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgStartRequestContext,
                proto.service.Tx.MsgStartRequestContextResponse>(
                  this, METHODID_START_REQUEST_CONTEXT)))
          .addMethod(
            getKillRequestContextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgKillRequestContext,
                proto.service.Tx.MsgKillRequestContextResponse>(
                  this, METHODID_KILL_REQUEST_CONTEXT)))
          .addMethod(
            getUpdateRequestContextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgUpdateRequestContext,
                proto.service.Tx.MsgUpdateRequestContextResponse>(
                  this, METHODID_UPDATE_REQUEST_CONTEXT)))
          .addMethod(
            getWithdrawEarnedFeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.service.Tx.MsgWithdrawEarnedFees,
                proto.service.Tx.MsgWithdrawEarnedFeesResponse>(
                  this, METHODID_WITHDRAW_EARNED_FEES)))
          .build();
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public void defineService(proto.service.Tx.MsgDefineService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgDefineServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public void bindService(proto.service.Tx.MsgBindService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgBindServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public void updateServiceBinding(proto.service.Tx.MsgUpdateServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateServiceBindingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public void setWithdrawAddress(proto.service.Tx.MsgSetWithdrawAddress request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgSetWithdrawAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public void enableServiceBinding(proto.service.Tx.MsgEnableServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgEnableServiceBindingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public void disableServiceBinding(proto.service.Tx.MsgDisableServiceBinding request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgDisableServiceBindingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public void refundServiceDeposit(proto.service.Tx.MsgRefundServiceDeposit request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgRefundServiceDepositResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public void callService(proto.service.Tx.MsgCallService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgCallServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public void respondService(proto.service.Tx.MsgRespondService request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgRespondServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public void pauseRequestContext(proto.service.Tx.MsgPauseRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgPauseRequestContextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public void startRequestContext(proto.service.Tx.MsgStartRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgStartRequestContextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public void killRequestContext(proto.service.Tx.MsgKillRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgKillRequestContextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public void updateRequestContext(proto.service.Tx.MsgUpdateRequestContext request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateRequestContextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public void withdrawEarnedFees(proto.service.Tx.MsgWithdrawEarnedFees request,
        io.grpc.stub.StreamObserver<proto.service.Tx.MsgWithdrawEarnedFeesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWithdrawEarnedFeesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public proto.service.Tx.MsgDefineServiceResponse defineService(proto.service.Tx.MsgDefineService request) {
      return blockingUnaryCall(
          getChannel(), getDefineServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public proto.service.Tx.MsgBindServiceResponse bindService(proto.service.Tx.MsgBindService request) {
      return blockingUnaryCall(
          getChannel(), getBindServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public proto.service.Tx.MsgUpdateServiceBindingResponse updateServiceBinding(proto.service.Tx.MsgUpdateServiceBinding request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public proto.service.Tx.MsgSetWithdrawAddressResponse setWithdrawAddress(proto.service.Tx.MsgSetWithdrawAddress request) {
      return blockingUnaryCall(
          getChannel(), getSetWithdrawAddressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public proto.service.Tx.MsgEnableServiceBindingResponse enableServiceBinding(proto.service.Tx.MsgEnableServiceBinding request) {
      return blockingUnaryCall(
          getChannel(), getEnableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public proto.service.Tx.MsgDisableServiceBindingResponse disableServiceBinding(proto.service.Tx.MsgDisableServiceBinding request) {
      return blockingUnaryCall(
          getChannel(), getDisableServiceBindingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public proto.service.Tx.MsgRefundServiceDepositResponse refundServiceDeposit(proto.service.Tx.MsgRefundServiceDeposit request) {
      return blockingUnaryCall(
          getChannel(), getRefundServiceDepositMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public proto.service.Tx.MsgCallServiceResponse callService(proto.service.Tx.MsgCallService request) {
      return blockingUnaryCall(
          getChannel(), getCallServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public proto.service.Tx.MsgRespondServiceResponse respondService(proto.service.Tx.MsgRespondService request) {
      return blockingUnaryCall(
          getChannel(), getRespondServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public proto.service.Tx.MsgPauseRequestContextResponse pauseRequestContext(proto.service.Tx.MsgPauseRequestContext request) {
      return blockingUnaryCall(
          getChannel(), getPauseRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public proto.service.Tx.MsgStartRequestContextResponse startRequestContext(proto.service.Tx.MsgStartRequestContext request) {
      return blockingUnaryCall(
          getChannel(), getStartRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public proto.service.Tx.MsgKillRequestContextResponse killRequestContext(proto.service.Tx.MsgKillRequestContext request) {
      return blockingUnaryCall(
          getChannel(), getKillRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public proto.service.Tx.MsgUpdateRequestContextResponse updateRequestContext(proto.service.Tx.MsgUpdateRequestContext request) {
      return blockingUnaryCall(
          getChannel(), getUpdateRequestContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public proto.service.Tx.MsgWithdrawEarnedFeesResponse withdrawEarnedFees(proto.service.Tx.MsgWithdrawEarnedFees request) {
      return blockingUnaryCall(
          getChannel(), getWithdrawEarnedFeesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Msg defines the oracle Msg service.
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
     * DefineService defines a method for define a new service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgDefineServiceResponse> defineService(
        proto.service.Tx.MsgDefineService request) {
      return futureUnaryCall(
          getChannel().newCall(getDefineServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BindService defines a method for bind a server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgBindServiceResponse> bindService(
        proto.service.Tx.MsgBindService request) {
      return futureUnaryCall(
          getChannel().newCall(getBindServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateServiceBinding defines a method for update a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgUpdateServiceBindingResponse> updateServiceBinding(
        proto.service.Tx.MsgUpdateServiceBinding request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetWithdrawAddress defines a method for setting a withdraw address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgSetWithdrawAddressResponse> setWithdrawAddress(
        proto.service.Tx.MsgSetWithdrawAddress request) {
      return futureUnaryCall(
          getChannel().newCall(getSetWithdrawAddressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * EnableServiceBinding defines a method for enabling a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgEnableServiceBindingResponse> enableServiceBinding(
        proto.service.Tx.MsgEnableServiceBinding request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableServiceBinding defines a method for disabling a service binding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgDisableServiceBindingResponse> disableServiceBinding(
        proto.service.Tx.MsgDisableServiceBinding request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableServiceBindingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RefundServiceDeposit defines a method for refunding a fee.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgRefundServiceDepositResponse> refundServiceDeposit(
        proto.service.Tx.MsgRefundServiceDeposit request) {
      return futureUnaryCall(
          getChannel().newCall(getRefundServiceDepositMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CallService defines a method for calling a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgCallServiceResponse> callService(
        proto.service.Tx.MsgCallService request) {
      return futureUnaryCall(
          getChannel().newCall(getCallServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RespondService defines a method for responding a service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgRespondServiceResponse> respondService(
        proto.service.Tx.MsgRespondService request) {
      return futureUnaryCall(
          getChannel().newCall(getRespondServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PauseRequestContext defines a method for pausing a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgPauseRequestContextResponse> pauseRequestContext(
        proto.service.Tx.MsgPauseRequestContext request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StartRequestContext defines a method for starting a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgStartRequestContextResponse> startRequestContext(
        proto.service.Tx.MsgStartRequestContext request) {
      return futureUnaryCall(
          getChannel().newCall(getStartRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * KillRequestContext defines a method for killing a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgKillRequestContextResponse> killRequestContext(
        proto.service.Tx.MsgKillRequestContext request) {
      return futureUnaryCall(
          getChannel().newCall(getKillRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateRequestContext defines a method for updating a service call.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgUpdateRequestContextResponse> updateRequestContext(
        proto.service.Tx.MsgUpdateRequestContext request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateRequestContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * WithdrawEarnedFees defines a method for Withdrawing a earned fees.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.service.Tx.MsgWithdrawEarnedFeesResponse> withdrawEarnedFees(
        proto.service.Tx.MsgWithdrawEarnedFees request) {
      return futureUnaryCall(
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEFINE_SERVICE:
          serviceImpl.defineService((proto.service.Tx.MsgDefineService) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgDefineServiceResponse>) responseObserver);
          break;
        case METHODID_BIND_SERVICE:
          serviceImpl.bindService((proto.service.Tx.MsgBindService) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgBindServiceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVICE_BINDING:
          serviceImpl.updateServiceBinding((proto.service.Tx.MsgUpdateServiceBinding) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateServiceBindingResponse>) responseObserver);
          break;
        case METHODID_SET_WITHDRAW_ADDRESS:
          serviceImpl.setWithdrawAddress((proto.service.Tx.MsgSetWithdrawAddress) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgSetWithdrawAddressResponse>) responseObserver);
          break;
        case METHODID_ENABLE_SERVICE_BINDING:
          serviceImpl.enableServiceBinding((proto.service.Tx.MsgEnableServiceBinding) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgEnableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_DISABLE_SERVICE_BINDING:
          serviceImpl.disableServiceBinding((proto.service.Tx.MsgDisableServiceBinding) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgDisableServiceBindingResponse>) responseObserver);
          break;
        case METHODID_REFUND_SERVICE_DEPOSIT:
          serviceImpl.refundServiceDeposit((proto.service.Tx.MsgRefundServiceDeposit) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgRefundServiceDepositResponse>) responseObserver);
          break;
        case METHODID_CALL_SERVICE:
          serviceImpl.callService((proto.service.Tx.MsgCallService) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgCallServiceResponse>) responseObserver);
          break;
        case METHODID_RESPOND_SERVICE:
          serviceImpl.respondService((proto.service.Tx.MsgRespondService) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgRespondServiceResponse>) responseObserver);
          break;
        case METHODID_PAUSE_REQUEST_CONTEXT:
          serviceImpl.pauseRequestContext((proto.service.Tx.MsgPauseRequestContext) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgPauseRequestContextResponse>) responseObserver);
          break;
        case METHODID_START_REQUEST_CONTEXT:
          serviceImpl.startRequestContext((proto.service.Tx.MsgStartRequestContext) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgStartRequestContextResponse>) responseObserver);
          break;
        case METHODID_KILL_REQUEST_CONTEXT:
          serviceImpl.killRequestContext((proto.service.Tx.MsgKillRequestContext) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgKillRequestContextResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REQUEST_CONTEXT:
          serviceImpl.updateRequestContext((proto.service.Tx.MsgUpdateRequestContext) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgUpdateRequestContextResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW_EARNED_FEES:
          serviceImpl.withdrawEarnedFees((proto.service.Tx.MsgWithdrawEarnedFees) request,
              (io.grpc.stub.StreamObserver<proto.service.Tx.MsgWithdrawEarnedFeesResponse>) responseObserver);
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
      return proto.service.Tx.getDescriptor();
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
