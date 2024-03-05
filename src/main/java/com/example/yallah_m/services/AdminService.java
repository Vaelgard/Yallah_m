package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.entities.Offres;

import java.util.List;

public interface AdminService {
    void ajouterOffres(Offres offres);
    void supprimerOffres(Integer id);
    List<Offres> listOffres();

    List<Client> getClients();
    Client getClientById(String cin);
    void majClient(Client client);
    void supprimerClient(String cin);
    List<Driver> drivers();
    Driver getDriverById(String cin);
    void majDriver(Driver driver);
    void supprimerDriver(String cin);


}
