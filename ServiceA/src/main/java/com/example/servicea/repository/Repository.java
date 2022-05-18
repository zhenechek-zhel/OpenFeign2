package com.example.servicea.repository;

import com.example.servicea.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Person, String> {
}
