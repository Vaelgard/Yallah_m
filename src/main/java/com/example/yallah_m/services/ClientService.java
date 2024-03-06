package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;

import java.util.List;

public interface ClientService {
    List<Client> getClients();
    Client getClientById(String cin);
    void saveClient(Client client);
    void supprimerClient(String cin);
}
