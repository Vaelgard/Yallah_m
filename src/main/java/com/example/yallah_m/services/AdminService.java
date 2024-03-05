package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.entities.Offres;

import java.util.List;

public interface AdminService {
    abstract void ajouterOffres();
    abstract Offres getOffres();
    abstract Offres modifierOffres();

    abstract List<Offres> listOffres();
    abstract void supprimerOffres();
    abstract Client getClient();
    abstract Client majClient();
    abstract Driver majDriver();


}
