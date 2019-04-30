package com.example.grpc.test;

import com.example.grpc.proto.GreeterGrpc;
import com.example.grpc.proto.HelloReply;
import com.example.grpc.proto.HelloRequest;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class MessageImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String greeting = "Hello, " +
                request.getName() +
                " ";

        HelloReply response = HelloReply.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void sayHelloAgain(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        String greeting = "Hello, " +
                request.getName() +
                " ";

        HelloReply response = HelloReply.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
