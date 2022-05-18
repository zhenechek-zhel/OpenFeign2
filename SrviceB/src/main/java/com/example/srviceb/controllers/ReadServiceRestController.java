package com.example.srviceb.controllers;

import com.example.srviceb.models.Person;
import com.example.srviceb.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/read")
public class ReadServiceRestController {
    //Service B write a new INFO

    private final Repository repository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadServiceRestController.class);

    @Autowired
    public ReadServiceRestController(Repository repository) {
        this.repository = repository;
    }

    @GetMapping
    private ResponseEntity<List<Person>> getNewPersons(@RequestParam String msg) {
        LOGGER.info("Read Service have a new message: {}", msg);
        List<Person> persons = repository.findAll();
        persons.forEach(System.out::println);
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

}
