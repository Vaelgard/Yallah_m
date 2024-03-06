package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Villes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillesRepository extends JpaRepository<Villes,Integer> {
}
