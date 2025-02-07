package com.crewscale.assignment;

import com.crewscale.assignment.grpc.ProcessServiceGrpc;
import com.crewscale.assignment.grpc.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProcessClient {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9000).usePlaintext().build();
    private final ProcessServiceGrpc.ProcessServiceBlockingStub blockingStub = ProcessServiceGrpc.newBlockingStub(channel);

    public void processNumbers(List<Integer> numbers) {
        StreamResponse.ProcessRequest request = StreamResponse.ProcessRequest.newBuilder()
                .addAllNumbers(numbers)
                .build();

        Iterator<StreamResponse.ProcessResponse> responses = blockingStub.sendProcessedData(request);

        while (responses.hasNext()) {
            StreamResponse.ProcessResponse response = responses.next();
            System.out.println(response.getProcessedNumber());
        }
    }
}

