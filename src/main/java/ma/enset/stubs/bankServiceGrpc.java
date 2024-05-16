package ma.enset.stubs;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class bankServiceGrpc {

  private bankServiceGrpc() {}

  public static final String SERVICE_NAME = "bankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.enset.stubs.Bank.convertCurrencyRequest.class,
      responseType = ma.enset.stubs.Bank.convertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = bankServiceGrpc.getConvertMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getConvertMethod = bankServiceGrpc.getConvertMethod) == null) {
          bankServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bankService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrencyStream",
      requestType = ma.enset.stubs.Bank.convertCurrencyRequest.class,
      responseType = ma.enset.stubs.Bank.convertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = bankServiceGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getGetCurrencyStreamMethod = bankServiceGrpc.getGetCurrencyStreamMethod) == null) {
          bankServiceGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankService", "getCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("getCurrencyStream"))
                  .build();
          }
        }
     }
     return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getPerformSteamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performSteam",
      requestType = ma.enset.stubs.Bank.convertCurrencyRequest.class,
      responseType = ma.enset.stubs.Bank.convertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getPerformSteamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse> getPerformSteamMethod;
    if ((getPerformSteamMethod = bankServiceGrpc.getPerformSteamMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getPerformSteamMethod = bankServiceGrpc.getPerformSteamMethod) == null) {
          bankServiceGrpc.getPerformSteamMethod = getPerformSteamMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankService", "performSteam"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("performSteam"))
                  .build();
          }
        }
     }
     return getPerformSteamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getFullStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStream",
      requestType = ma.enset.stubs.Bank.convertCurrencyRequest.class,
      responseType = ma.enset.stubs.Bank.convertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest,
      ma.enset.stubs.Bank.convertCurrencyResponse> getFullStreamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse> getFullStreamMethod;
    if ((getFullStreamMethod = bankServiceGrpc.getFullStreamMethod) == null) {
      synchronized (bankServiceGrpc.class) {
        if ((getFullStreamMethod = bankServiceGrpc.getFullStreamMethod) == null) {
          bankServiceGrpc.getFullStreamMethod = getFullStreamMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Bank.convertCurrencyRequest, ma.enset.stubs.Bank.convertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bankService", "fullStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Bank.convertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bankServiceMethodDescriptorSupplier("fullStream"))
                  .build();
          }
        }
     }
     return getFullStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bankServiceStub newStub(io.grpc.Channel channel) {
    return new bankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class bankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(ma.enset.stubs.Bank.convertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getCurrencyStream(ma.enset.stubs.Bank.convertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyRequest> performSteam(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformSteamMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.Bank.convertCurrencyRequest,
                ma.enset.stubs.Bank.convertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Bank.convertCurrencyRequest,
                ma.enset.stubs.Bank.convertCurrencyResponse>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerformSteamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Bank.convertCurrencyRequest,
                ma.enset.stubs.Bank.convertCurrencyResponse>(
                  this, METHODID_PERFORM_STEAM)))
          .addMethod(
            getFullStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Bank.convertCurrencyRequest,
                ma.enset.stubs.Bank.convertCurrencyResponse>(
                  this, METHODID_FULL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class bankServiceStub extends io.grpc.stub.AbstractStub<bankServiceStub> {
    private bankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(ma.enset.stubs.Bank.convertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public void getCurrencyStream(ma.enset.stubs.Bank.convertCurrencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyRequest> performSteam(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformSteamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyRequest> fullStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class bankServiceBlockingStub extends io.grpc.stub.AbstractStub<bankServiceBlockingStub> {
    private bankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public ma.enset.stubs.Bank.convertCurrencyResponse convert(ma.enset.stubs.Bank.convertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server streaming model
     * </pre>
     */
    public java.util.Iterator<ma.enset.stubs.Bank.convertCurrencyResponse> getCurrencyStream(
        ma.enset.stubs.Bank.convertCurrencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bankServiceFutureStub extends io.grpc.stub.AbstractStub<bankServiceFutureStub> {
    private bankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.Bank.convertCurrencyResponse> convert(
        ma.enset.stubs.Bank.convertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFORM_STEAM = 2;
  private static final int METHODID_FULL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.enset.stubs.Bank.convertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((ma.enset.stubs.Bank.convertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse>) responseObserver);
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
        case METHODID_PERFORM_STEAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performSteam(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse>) responseObserver);
        case METHODID_FULL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStream(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Bank.convertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class bankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bankService");
    }
  }

  private static final class bankServiceFileDescriptorSupplier
      extends bankServiceBaseDescriptorSupplier {
    bankServiceFileDescriptorSupplier() {}
  }

  private static final class bankServiceMethodDescriptorSupplier
      extends bankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (bankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bankServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerformSteamMethod())
              .addMethod(getFullStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
