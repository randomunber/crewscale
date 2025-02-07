package com.crewscale.assignment;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GrpcServerConfiguration {

    @Autowired
    ProcessServiceImpl service;

    @Bean
    public Server rpcServer() throws IOException {
        return ServerBuilder.forPort(9000).addService(service).build().start();
    }
}
