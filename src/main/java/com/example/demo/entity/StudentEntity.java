package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity

public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public void setName(string name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }

    public float getCgpa(){
        return this.cgpa;
    }
}