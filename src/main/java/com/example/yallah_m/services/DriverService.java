package com.example.yallah_m.services;

import com.example.yallah_m.entities.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> drivers();
    Driver getDriverById(String cin);
    void saveDriver(Driver driver);
    void supprimerDriver(String cin);
}
