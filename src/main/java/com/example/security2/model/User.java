/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.security2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.Data;


import javax.persistence.EnumType;
import javax.persistence.Enumerated;


/**
 *
 * @author Артём
 */
@Data
@Entity

@Table(name = "security")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Enumerated(value = EnumType.STRING)
    @Column(name="roles")
    private Role roles;
    
    @Enumerated(value = EnumType.STRING)
    @Column(name="status")
    private Status status;
}
