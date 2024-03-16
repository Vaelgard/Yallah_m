package com.example.yallah_m.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String marque;
    @Column(unique = true)
    private String matricule;
    private String type;
    @ManyToOne(fetch = FetchType.EAGER)
    private User driver;
}
