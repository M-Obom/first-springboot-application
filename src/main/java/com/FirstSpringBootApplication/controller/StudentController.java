package com.FirstSpringBootApplication.controller;

import com.FirstSpringBootApplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Mark", "Spencer");
    }
}
