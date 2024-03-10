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
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    private User client;
    @OneToOne(fetch = FetchType.LAZY)
    private Offres offres;
    @ManyToOne(fetch = FetchType.LAZY)
    private User driver;
}
