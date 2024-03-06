package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,String> {
    Client findClientByCIN(String cin);
}
