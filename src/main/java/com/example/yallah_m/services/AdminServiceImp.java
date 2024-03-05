package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.entities.Offres;
import com.example.yallah_m.repositories.ClientRepository;
import com.example.yallah_m.repositories.DriverRepository;
import com.example.yallah_m.repositories.OffresRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AdminServiceImp implements AdminService {
    private OffresRepository offresRepository;
    private ClientRepository clientRepository;
    private DriverRepository driverRepository;
    @Override
    public void ajouterOffres(Offres offres) {
        offresRepository.save(offres);
    }

    @Override
    public void supprimerOffres(Integer id) {
            offresRepository.deleteById(id);
    }


    @Override
    public List<Offres> listOffres() {
        return offresRepository.findAll();
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(String cin) {
        return clientRepository.findClientByCIN(cin);
    }

    @Override
    public void majClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void supprimerClient(String cin) {
        clientRepository.deleteById(cin);
    }

    @Override
    public List<Driver> drivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriverById(String cin) {
        return driverRepository.findDriverByCIN(cin);
    }

    @Override
    public void majDriver(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public void supprimerDriver(String cin) {
        driverRepository.deleteById(cin);
    }
}
