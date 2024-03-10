package com.example.yallah_m.services;

import com.example.yallah_m.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(String cin);
    void saveUser(User user);
    void deleteUser(String cin);
}
