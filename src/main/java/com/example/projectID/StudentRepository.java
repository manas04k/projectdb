package com.example.projectID;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
@Component
public class StudentRepository {



    HashMap<Integer, Student> students = new HashMap<>();

    public void addIntoStudent(Student s){

        students.put(s.getId(), s);

    }

    public Student getbyID(int id){

        return students.get(id);

    }


}


