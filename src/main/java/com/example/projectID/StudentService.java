package com.example.projectID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Component
public class StudentService {

    @Autowired
    StudentRepository repository;

    public void insertInStudent(Student s){
        repository.addIntoStudent(s);
    }

    public Student getToId(int id){
        return repository.getbyID(id);
    }

}

