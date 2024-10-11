package com.insurance.insurance_management.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;
    private String role;


}
