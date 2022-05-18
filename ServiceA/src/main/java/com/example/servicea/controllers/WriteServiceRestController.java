package com.example.servicea.controllers;

import com.example.servicea.clients.WriteServiceClient;
import com.example.servicea.models.Person;
import com.example.servicea.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/write")
public class WriteServiceRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WriteServiceRestController.class);
    private final Repository repository;
    private final WriteServiceClient client;

    @Autowired
    public WriteServiceRestController(Repository repository, WriteServiceClient client) {
        this.repository = repository;
        this.client = client;
    }



    @PostMapping
    public void writeData(@RequestBody Person person) {
        LOGGER.info("Write service poluchil new person: {} ", person);
        repository.save(person);
        client.getNewPersons("this work from write service");
    }
}
