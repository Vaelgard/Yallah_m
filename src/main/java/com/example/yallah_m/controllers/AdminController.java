package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.User;
import com.example.yallah_m.services.OffresService;
import com.example.yallah_m.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/dashbordAdmin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminController {

    UserService userService;
    OffresService offresService;
    @GetMapping
    public List<User> users(){
        return userService.getUsers();
    }
    @GetMapping("/majClient")
    public String majClient(Model model, String cin){
        User user=userService.getUserById(cin);
        model.addAttribute("clientM",user);
        return "MAJ";
    }
    @GetMapping
    public void save(@Valid User user){
        userService.saveUser(user);
    }
    @GetMapping("/deleteUser")
    public void deleteClient(String cin){
        userService.deleteUser(cin);
    }
}
