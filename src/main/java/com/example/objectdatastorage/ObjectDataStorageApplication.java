package com.example.objectdatastorage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ObjectDataStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObjectDataStorageApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return strings -> {
            personRepository.deleteAll();
            personRepository.save(new Person(UUID.randomUUID(), "Jonathan", "Cuningham", "03/09/1983"));
            personRepository.save(new Person(UUID.randomUUID(), "Marshmallow", "Cat", "0925/2019"));
        };
    }
}
