package com.example.objectdatastorage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ObjectDataStorageApplicationTests {

    @MockBean
    PersonRepository personRepository;
    @Test
    void contextLoads() {
    }

}
