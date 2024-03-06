package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageRepository extends JpaRepository<Voyage,Integer> {
}
