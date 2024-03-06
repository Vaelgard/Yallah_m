package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Offres;

import java.util.List;

public interface OffresService {
    void ajouterOffres(Offres offres);
    Offres getOffreById(Integer id);
    void supprimerOffres(Integer id);
    List<Offres> listOffres();
}
