package com.example.yallah_m.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Offres {
    @Id
    private Integer id;
    @OneToOne(fetch = FetchType.LAZY)
    private Villes ville_depart;
    @OneToOne(fetch = FetchType.LAZY)
    private Villes ville_arriv;
    private Date heure_depart;
    private Date heure_arriv;
    private Double prix;
}
