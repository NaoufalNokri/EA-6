package com.example.AdminBank.models;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private int id;
    private String username;
    private String fullName;
    private String password;
    private String phone;
    private String email;
    private String numCarte1;
    private String nulCarte2;


}
