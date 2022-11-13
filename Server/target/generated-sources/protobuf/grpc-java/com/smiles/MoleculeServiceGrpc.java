package com.smiles;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: ChemDataExtract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MoleculeServiceGrpc {

  private MoleculeServiceGrpc() {}

  public static final String SERVICE_NAME = "com.smiles.controller.MoleculeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.smiles.CreateMoleculeRequest,
      com.smiles.CreateMoleculeResponse> getCreateMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMolecule",
      requestType = com.smiles.CreateMoleculeRequest.class,
      responseType = com.smiles.CreateMoleculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.CreateMoleculeRequest,
      com.smiles.CreateMoleculeResponse> getCreateMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.CreateMoleculeRequest, com.smiles.CreateMoleculeResponse> getCreateMoleculeMethod;
    if ((getCreateMoleculeMethod = MoleculeServiceGrpc.getCreateMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getCreateMoleculeMethod = MoleculeServiceGrpc.getCreateMoleculeMethod) == null) {
          MoleculeServiceGrpc.getCreateMoleculeMethod = getCreateMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.CreateMoleculeRequest, com.smiles.CreateMoleculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.CreateMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.CreateMoleculeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("CreateMolecule"))
              .build();
        }
      }
    }
    return getCreateMoleculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smiles.ReadMoleculeRequest,
      com.smiles.ReadMoleculeResponse> getReadMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadMolecule",
      requestType = com.smiles.ReadMoleculeRequest.class,
      responseType = com.smiles.ReadMoleculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.ReadMoleculeRequest,
      com.smiles.ReadMoleculeResponse> getReadMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.ReadMoleculeRequest, com.smiles.ReadMoleculeResponse> getReadMoleculeMethod;
    if ((getReadMoleculeMethod = MoleculeServiceGrpc.getReadMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getReadMoleculeMethod = MoleculeServiceGrpc.getReadMoleculeMethod) == null) {
          MoleculeServiceGrpc.getReadMoleculeMethod = getReadMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.ReadMoleculeRequest, com.smiles.ReadMoleculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.ReadMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.ReadMoleculeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("ReadMolecule"))
              .build();
        }
      }
    }
    return getReadMoleculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smiles.UpdateMoleculeRequest,
      com.smiles.UpdateMoleculeResponse> getUpdateMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMolecule",
      requestType = com.smiles.UpdateMoleculeRequest.class,
      responseType = com.smiles.UpdateMoleculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.UpdateMoleculeRequest,
      com.smiles.UpdateMoleculeResponse> getUpdateMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.UpdateMoleculeRequest, com.smiles.UpdateMoleculeResponse> getUpdateMoleculeMethod;
    if ((getUpdateMoleculeMethod = MoleculeServiceGrpc.getUpdateMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getUpdateMoleculeMethod = MoleculeServiceGrpc.getUpdateMoleculeMethod) == null) {
          MoleculeServiceGrpc.getUpdateMoleculeMethod = getUpdateMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.UpdateMoleculeRequest, com.smiles.UpdateMoleculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.UpdateMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.UpdateMoleculeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("UpdateMolecule"))
              .build();
        }
      }
    }
    return getUpdateMoleculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smiles.DeleteMoleculeRequest,
      com.smiles.DeleteMoleculeResponse> getDeleteMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMolecule",
      requestType = com.smiles.DeleteMoleculeRequest.class,
      responseType = com.smiles.DeleteMoleculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.DeleteMoleculeRequest,
      com.smiles.DeleteMoleculeResponse> getDeleteMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.DeleteMoleculeRequest, com.smiles.DeleteMoleculeResponse> getDeleteMoleculeMethod;
    if ((getDeleteMoleculeMethod = MoleculeServiceGrpc.getDeleteMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getDeleteMoleculeMethod = MoleculeServiceGrpc.getDeleteMoleculeMethod) == null) {
          MoleculeServiceGrpc.getDeleteMoleculeMethod = getDeleteMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.DeleteMoleculeRequest, com.smiles.DeleteMoleculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.DeleteMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.DeleteMoleculeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("DeleteMolecule"))
              .build();
        }
      }
    }
    return getDeleteMoleculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smiles.ListMoleculeRequest,
      com.smiles.ListMoleculeResponse> getListMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMolecule",
      requestType = com.smiles.ListMoleculeRequest.class,
      responseType = com.smiles.ListMoleculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.ListMoleculeRequest,
      com.smiles.ListMoleculeResponse> getListMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.ListMoleculeRequest, com.smiles.ListMoleculeResponse> getListMoleculeMethod;
    if ((getListMoleculeMethod = MoleculeServiceGrpc.getListMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getListMoleculeMethod = MoleculeServiceGrpc.getListMoleculeMethod) == null) {
          MoleculeServiceGrpc.getListMoleculeMethod = getListMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.ListMoleculeRequest, com.smiles.ListMoleculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.ListMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.ListMoleculeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("ListMolecule"))
              .build();
        }
      }
    }
    return getListMoleculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.smiles.GetMoleculeRequest,
      com.google.protobuf.Struct> getGetMoleculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMolecule",
      requestType = com.smiles.GetMoleculeRequest.class,
      responseType = com.google.protobuf.Struct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.smiles.GetMoleculeRequest,
      com.google.protobuf.Struct> getGetMoleculeMethod() {
    io.grpc.MethodDescriptor<com.smiles.GetMoleculeRequest, com.google.protobuf.Struct> getGetMoleculeMethod;
    if ((getGetMoleculeMethod = MoleculeServiceGrpc.getGetMoleculeMethod) == null) {
      synchronized (MoleculeServiceGrpc.class) {
        if ((getGetMoleculeMethod = MoleculeServiceGrpc.getGetMoleculeMethod) == null) {
          MoleculeServiceGrpc.getGetMoleculeMethod = getGetMoleculeMethod =
              io.grpc.MethodDescriptor.<com.smiles.GetMoleculeRequest, com.google.protobuf.Struct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMolecule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.smiles.GetMoleculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Struct.getDefaultInstance()))
              .setSchemaDescriptor(new MoleculeServiceMethodDescriptorSupplier("GetMolecule"))
              .build();
        }
      }
    }
    return getGetMoleculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MoleculeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceStub>() {
        @java.lang.Override
        public MoleculeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MoleculeServiceStub(channel, callOptions);
        }
      };
    return MoleculeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MoleculeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceBlockingStub>() {
        @java.lang.Override
        public MoleculeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MoleculeServiceBlockingStub(channel, callOptions);
        }
      };
    return MoleculeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MoleculeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MoleculeServiceFutureStub>() {
        @java.lang.Override
        public MoleculeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MoleculeServiceFutureStub(channel, callOptions);
        }
      };
    return MoleculeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MoleculeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createMolecule(com.smiles.CreateMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.CreateMoleculeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMoleculeMethod(), responseObserver);
    }

    /**
     */
    public void readMolecule(com.smiles.ReadMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.ReadMoleculeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMoleculeMethod(), responseObserver);
    }

    /**
     */
    public void updateMolecule(com.smiles.UpdateMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.UpdateMoleculeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMoleculeMethod(), responseObserver);
    }

    /**
     */
    public void deleteMolecule(com.smiles.DeleteMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.DeleteMoleculeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMoleculeMethod(), responseObserver);
    }

    /**
     */
    public void listMolecule(com.smiles.ListMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.ListMoleculeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMoleculeMethod(), responseObserver);
    }

    /**
     */
    public void getMolecule(com.smiles.GetMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoleculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.CreateMoleculeRequest,
                com.smiles.CreateMoleculeResponse>(
                  this, METHODID_CREATE_MOLECULE)))
          .addMethod(
            getReadMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.ReadMoleculeRequest,
                com.smiles.ReadMoleculeResponse>(
                  this, METHODID_READ_MOLECULE)))
          .addMethod(
            getUpdateMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.UpdateMoleculeRequest,
                com.smiles.UpdateMoleculeResponse>(
                  this, METHODID_UPDATE_MOLECULE)))
          .addMethod(
            getDeleteMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.DeleteMoleculeRequest,
                com.smiles.DeleteMoleculeResponse>(
                  this, METHODID_DELETE_MOLECULE)))
          .addMethod(
            getListMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.ListMoleculeRequest,
                com.smiles.ListMoleculeResponse>(
                  this, METHODID_LIST_MOLECULE)))
          .addMethod(
            getGetMoleculeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.smiles.GetMoleculeRequest,
                com.google.protobuf.Struct>(
                  this, METHODID_GET_MOLECULE)))
          .build();
    }
  }

  /**
   */
  public static final class MoleculeServiceStub extends io.grpc.stub.AbstractAsyncStub<MoleculeServiceStub> {
    private MoleculeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoleculeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MoleculeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMolecule(com.smiles.CreateMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.CreateMoleculeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMoleculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readMolecule(com.smiles.ReadMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.ReadMoleculeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMoleculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMolecule(com.smiles.UpdateMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.UpdateMoleculeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMoleculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMolecule(com.smiles.DeleteMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.DeleteMoleculeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMoleculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMolecule(com.smiles.ListMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.smiles.ListMoleculeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMoleculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMolecule(com.smiles.GetMoleculeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Struct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMoleculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MoleculeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MoleculeServiceBlockingStub> {
    private MoleculeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoleculeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MoleculeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smiles.CreateMoleculeResponse createMolecule(com.smiles.CreateMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMoleculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smiles.ReadMoleculeResponse readMolecule(com.smiles.ReadMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMoleculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smiles.UpdateMoleculeResponse updateMolecule(com.smiles.UpdateMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMoleculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smiles.DeleteMoleculeResponse deleteMolecule(com.smiles.DeleteMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMoleculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.smiles.ListMoleculeResponse listMolecule(com.smiles.ListMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMoleculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Struct getMolecule(com.smiles.GetMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMoleculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MoleculeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MoleculeServiceFutureStub> {
    private MoleculeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoleculeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MoleculeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smiles.CreateMoleculeResponse> createMolecule(
        com.smiles.CreateMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMoleculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smiles.ReadMoleculeResponse> readMolecule(
        com.smiles.ReadMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMoleculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smiles.UpdateMoleculeResponse> updateMolecule(
        com.smiles.UpdateMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMoleculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smiles.DeleteMoleculeResponse> deleteMolecule(
        com.smiles.DeleteMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMoleculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smiles.ListMoleculeResponse> listMolecule(
        com.smiles.ListMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMoleculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Struct> getMolecule(
        com.smiles.GetMoleculeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMoleculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MOLECULE = 0;
  private static final int METHODID_READ_MOLECULE = 1;
  private static final int METHODID_UPDATE_MOLECULE = 2;
  private static final int METHODID_DELETE_MOLECULE = 3;
  private static final int METHODID_LIST_MOLECULE = 4;
  private static final int METHODID_GET_MOLECULE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MoleculeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MoleculeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MOLECULE:
          serviceImpl.createMolecule((com.smiles.CreateMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.smiles.CreateMoleculeResponse>) responseObserver);
          break;
        case METHODID_READ_MOLECULE:
          serviceImpl.readMolecule((com.smiles.ReadMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.smiles.ReadMoleculeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOLECULE:
          serviceImpl.updateMolecule((com.smiles.UpdateMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.smiles.UpdateMoleculeResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOLECULE:
          serviceImpl.deleteMolecule((com.smiles.DeleteMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.smiles.DeleteMoleculeResponse>) responseObserver);
          break;
        case METHODID_LIST_MOLECULE:
          serviceImpl.listMolecule((com.smiles.ListMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.smiles.ListMoleculeResponse>) responseObserver);
          break;
        case METHODID_GET_MOLECULE:
          serviceImpl.getMolecule((com.smiles.GetMoleculeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Struct>) responseObserver);
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

  private static abstract class MoleculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MoleculeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.smiles.ChemDataExtract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MoleculeService");
    }
  }

  private static final class MoleculeServiceFileDescriptorSupplier
      extends MoleculeServiceBaseDescriptorSupplier {
    MoleculeServiceFileDescriptorSupplier() {}
  }

  private static final class MoleculeServiceMethodDescriptorSupplier
      extends MoleculeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MoleculeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MoleculeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MoleculeServiceFileDescriptorSupplier())
              .addMethod(getCreateMoleculeMethod())
              .addMethod(getReadMoleculeMethod())
              .addMethod(getUpdateMoleculeMethod())
              .addMethod(getDeleteMoleculeMethod())
              .addMethod(getListMoleculeMethod())
              .addMethod(getGetMoleculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
