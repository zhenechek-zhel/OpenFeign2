package com.example.srviceb.repository;

import com.example.srviceb.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Person, String> {
}
