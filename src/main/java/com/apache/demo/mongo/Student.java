package com.apache.demo.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.sql.Timestamp;
import java.util.List;

@Data
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    private List<String> favoriteSubject;
    private Timestamp createdAt;
}
