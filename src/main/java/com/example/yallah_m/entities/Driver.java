package com.example.yallah_m.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    private String CIN;
    private String nom;
    private String prenom;
    private int age;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
}
