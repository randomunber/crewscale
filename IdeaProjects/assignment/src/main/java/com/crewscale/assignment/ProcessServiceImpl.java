package com.crewscale.assignment;

import com.crewscale.assignment.grpc.ProcessServiceGrpc;
import com.crewscale.assignment.grpc.StreamResponse;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl extends ProcessServiceGrpc.ProcessServiceImplBase {
    @Override
    public void sendProcessedData(StreamResponse.ProcessRequest request,StreamObserver<StreamResponse.ProcessResponse> responseObserver) {
        for (int number : request.getNumbersList()) {
            StreamResponse.ProcessResponse response = StreamResponse.ProcessResponse.newBuilder()
                    .setProcessedNumber(number)
                    .build();
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }
}

