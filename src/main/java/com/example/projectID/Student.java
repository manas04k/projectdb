package com.example.projectID;



public class Student {
    private int id;
    private String name;
    private int age;
    private int section;

    public Student(String name, int age, int section, int id) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}

