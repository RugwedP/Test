package com.example.GitHubDemo.controller;

import com.example.GitHubDemo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class MainController {

    @PostMapping("add")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        System.out.println(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
