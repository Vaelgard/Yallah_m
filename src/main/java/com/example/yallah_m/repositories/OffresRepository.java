package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Offres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OffresRepository extends JpaRepository<Offres,Integer> {
    Offres findOffresById(Integer id);

}
