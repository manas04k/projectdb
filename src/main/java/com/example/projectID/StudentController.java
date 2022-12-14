package com.example.projectID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/get/add-student")
    public void insertStudent(@RequestBody Student s){
        service.insertInStudent(s);
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable("id") int id){
        return service.getToId(id);
    }


}
