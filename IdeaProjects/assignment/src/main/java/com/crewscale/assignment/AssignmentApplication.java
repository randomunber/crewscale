package com.crewscale.assignment;

import com.crewscale.assignment.grpc.ProcessServiceGrpc;
import com.crewscale.assignment.grpc.StreamResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) throws InterruptedException, IOException {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
