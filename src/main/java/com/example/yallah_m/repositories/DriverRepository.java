package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,String> {
    Driver findDriverByCIN(String cin);
}
