package com.example.yallah_m.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    @Id
    private String CIN;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
}

