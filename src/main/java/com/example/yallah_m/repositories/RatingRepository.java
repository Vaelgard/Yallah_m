package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
}
