package com.apache.demo.mongo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("")
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.ok().body(studentRepository.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {

        return ResponseEntity.ok().body(studentRepository.save(student));

    }
}
