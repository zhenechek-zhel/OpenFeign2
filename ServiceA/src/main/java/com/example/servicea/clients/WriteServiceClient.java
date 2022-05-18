package com.example.servicea.clients;

import com.example.servicea.models.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "WriteServiceClient", url = "http://localhost:8081")
public interface WriteServiceClient {

    @GetMapping("/read")
    ResponseEntity<List<Person>> getNewPersons(@RequestParam String msg);
}
