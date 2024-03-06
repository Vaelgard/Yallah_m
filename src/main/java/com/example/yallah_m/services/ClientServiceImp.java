package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ClientServiceImp implements ClientService {
    private ClientRepository clientRepository;
    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(String cin) {
        return clientRepository.findClientByCIN(cin);
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void supprimerClient(String cin) {
        clientRepository.deleteById(cin);
    }
}
