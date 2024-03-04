package com.example.yallah_m.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

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
    @UniqueElements
    private String matricule;
    private String type;
    @ManyToOne(fetch =  FetchType.EAGER)
    private Driver driver;
}
