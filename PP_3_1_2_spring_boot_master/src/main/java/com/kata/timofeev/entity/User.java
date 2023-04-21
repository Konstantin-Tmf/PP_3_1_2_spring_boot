package com.kata.timofeev.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String firstName;
    @Column(name = "Surname")
    private String lastName;
    @Column(name = "Age")
    private int age;

}
