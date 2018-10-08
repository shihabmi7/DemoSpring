package com.shihab.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class Student  {
    public Student() {
        System.out.println("Student is created....");
    }

    public void detect(){

        System.out.println("Detect  is called....Student is a Perso¡n");

    }
}
