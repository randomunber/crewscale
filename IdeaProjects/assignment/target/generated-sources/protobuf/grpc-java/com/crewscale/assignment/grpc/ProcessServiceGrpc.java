package com.crewscale.assignment.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ProcessServiceGrpc {

  private ProcessServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ProcessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.crewscale.assignment.grpc.StreamResponse.ProcessRequest,
      com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> getSendProcessedDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendProcessedData",
      requestType = com.crewscale.assignment.grpc.StreamResponse.ProcessRequest.class,
      responseType = com.crewscale.assignment.grpc.StreamResponse.ProcessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.crewscale.assignment.grpc.StreamResponse.ProcessRequest,
      com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> getSendProcessedDataMethod() {
    io.grpc.MethodDescriptor<com.crewscale.assignment.grpc.StreamResponse.ProcessRequest, com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> getSendProcessedDataMethod;
    if ((getSendProcessedDataMethod = ProcessServiceGrpc.getSendProcessedDataMethod) == null) {
      synchronized (ProcessServiceGrpc.class) {
        if ((getSendProcessedDataMethod = ProcessServiceGrpc.getSendProcessedDataMethod) == null) {
          ProcessServiceGrpc.getSendProcessedDataMethod = getSendProcessedDataMethod =
              io.grpc.MethodDescriptor.<com.crewscale.assignment.grpc.StreamResponse.ProcessRequest, com.crewscale.assignment.grpc.StreamResponse.ProcessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendProcessedData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crewscale.assignment.grpc.StreamResponse.ProcessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.crewscale.assignment.grpc.StreamResponse.ProcessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProcessServiceMethodDescriptorSupplier("sendProcessedData"))
              .build();
        }
      }
    }
    return getSendProcessedDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProcessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceStub>() {
        @java.lang.Override
        public ProcessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceStub(channel, callOptions);
        }
      };
    return ProcessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProcessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceBlockingStub>() {
        @java.lang.Override
        public ProcessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceBlockingStub(channel, callOptions);
        }
      };
    return ProcessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProcessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProcessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProcessServiceFutureStub>() {
        @java.lang.Override
        public ProcessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProcessServiceFutureStub(channel, callOptions);
        }
      };
    return ProcessServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendProcessedData(com.crewscale.assignment.grpc.StreamResponse.ProcessRequest request,
        io.grpc.stub.StreamObserver<com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendProcessedDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProcessService.
   */
  public static abstract class ProcessServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProcessServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProcessService.
   */
  public static final class ProcessServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProcessServiceStub> {
    private ProcessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendProcessedData(com.crewscale.assignment.grpc.StreamResponse.ProcessRequest request,
        io.grpc.stub.StreamObserver<com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSendProcessedDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProcessService.
   */
  public static final class ProcessServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProcessServiceBlockingStub> {
    private ProcessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.crewscale.assignment.grpc.StreamResponse.ProcessResponse> sendProcessedData(
        com.crewscale.assignment.grpc.StreamResponse.ProcessRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSendProcessedDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProcessService.
   */
  public static final class ProcessServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProcessServiceFutureStub> {
    private ProcessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProcessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProcessServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_PROCESSED_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PROCESSED_DATA:
          serviceImpl.sendProcessedData((com.crewscale.assignment.grpc.StreamResponse.ProcessRequest) request,
              (io.grpc.stub.StreamObserver<com.crewscale.assignment.grpc.StreamResponse.ProcessResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendProcessedDataMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.crewscale.assignment.grpc.StreamResponse.ProcessRequest,
              com.crewscale.assignment.grpc.StreamResponse.ProcessResponse>(
                service, METHODID_SEND_PROCESSED_DATA)))
        .build();
  }

  private static abstract class ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProcessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.crewscale.assignment.grpc.StreamResponse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProcessService");
    }
  }

  private static final class ProcessServiceFileDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier {
    ProcessServiceFileDescriptorSupplier() {}
  }

  private static final class ProcessServiceMethodDescriptorSupplier
      extends ProcessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProcessServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProcessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProcessServiceFileDescriptorSupplier())
              .addMethod(getSendProcessedDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
