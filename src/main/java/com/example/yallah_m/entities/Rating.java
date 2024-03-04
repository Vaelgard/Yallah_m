package com.example.yallah_m.entities;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Rating {
    private Integer id;
    private String comment;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    @OneToOne(fetch = FetchType.LAZY)
    private Offres offres;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
}
