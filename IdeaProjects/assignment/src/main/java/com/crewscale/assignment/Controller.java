package com.crewscale.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class Controller {

    @Autowired
    ProcessClient client;

    @PostMapping("/processData")
    public ResponseEntity<String> process(@RequestBody List<Integer> integers){

        List<Integer> processedIntegers = integers.stream().filter(x -> x%2 != 0).map(x -> x*2).sorted().toList();

        client.processNumbers(processedIntegers);
        return ResponseEntity.ok(integers.toString());
    }
}
