package com.shihab.demo.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype")
public class Person {
    private int id;
    private String name;
    @Autowired
    private Student aStudent;


    public Student getaStudent() {
        return aStudent;
    }

    public void setaStudent(Student aStudent) {
        this.aStudent = aStudent;
    }

    public Person() {
        super();
        System.out.println("Object created");
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

    public void show() {
        System.out.println("Show is called");
        aStudent.detect();
    }
}
