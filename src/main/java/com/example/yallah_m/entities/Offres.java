package com.example.yallah_m.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    private String dest_depart;
    private String dest_arriv;
    private Date heure_depart;
    private Date heure_arriv;
    private Double prix;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Villes> villes;
}
