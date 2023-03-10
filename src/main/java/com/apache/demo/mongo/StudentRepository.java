package com.apache.demo.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByFirstNameContaining(String firstName);
}
