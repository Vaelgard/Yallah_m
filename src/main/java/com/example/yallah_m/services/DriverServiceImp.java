package com.example.yallah_m.services;

import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.repositories.DriverRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class DriverServiceImp implements DriverService{
    private DriverRepository driverRepository;
    @Override
    public List<Driver> drivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriverById(String cin) {
        return driverRepository.findDriverByCIN(cin);
    }

    @Override
    public void saveDriver(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public void supprimerDriver(String cin) {
        driverRepository.deleteById(cin);
    }
}
