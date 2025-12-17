package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity

public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY);
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}