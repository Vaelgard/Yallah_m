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




}
