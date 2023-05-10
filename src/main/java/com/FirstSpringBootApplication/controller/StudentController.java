package com.FirstSpringBootApplication.controller;

import com.FirstSpringBootApplication.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Mark", "Spencer");
    }

    // Returning a List of students to the client
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", "Spencer"));
        students.add(new Student("Jane", "Grimes"));
        students.add(new Student("John", "Cook"));
        students.add(new Student("Matthew", "Dome"));
        return students;
    }

    // Returning a student with a URI template variable
    @GetMapping("student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }

    // Rest API to handle a query parameter
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "firstName") String firstName,
                                     @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
