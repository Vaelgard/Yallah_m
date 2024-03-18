package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.User;
import com.example.yallah_m.services.OffresService;
import com.example.yallah_m.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/dashbordAdmin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminController {
    @Autowired
    private UserService userService;
    private OffresService offresService;
    @GetMapping("/liste")
    public List<User> users(){
        return userService.getUsers();
    }
    @GetMapping("/majClient")
    public String majClient(Model model, String cin){
        User user=userService.getUserById(cin);
        model.addAttribute("clientM",user);
        return "MAJ";
    }
    @GetMapping("/save")
    public void save(@Valid User user){
        userService.saveUser(user);
    }

    @GetMapping("/deleteUser")
    public void deleteClient(Integer id){
        userService.deleteUser(id);
    }
}
