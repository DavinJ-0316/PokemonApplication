// Java Program to Demonstrate Department File

// Importing required package modules
package com.example.pokemonServer.entity;

// Importing required classes

import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "TBL_EMPLOYEES")
@Getter
@Setter
@RequiredArgsConstructor
// Class
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false, nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "email")
    private String email;
}
