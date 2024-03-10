package com.example.yallah_m.repositories;

import com.example.yallah_m.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
    User findUserByCIN(String cin);
}
