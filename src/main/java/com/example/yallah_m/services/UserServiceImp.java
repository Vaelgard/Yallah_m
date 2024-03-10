package com.example.yallah_m.services;

import com.example.yallah_m.entities.User;
import com.example.yallah_m.repositories.UserRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserServiceImp implements UserService{
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String cin) {
        return userRepository.findUserByCIN(cin);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String cin) {
        userRepository.deleteById(cin);
    }
}
