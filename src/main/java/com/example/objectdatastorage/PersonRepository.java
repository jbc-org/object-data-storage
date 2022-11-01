package com.example.objectdatastorage;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PersonRepository extends MongoRepository<Person, UUID> {
}
