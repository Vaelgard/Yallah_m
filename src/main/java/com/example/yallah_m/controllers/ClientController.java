package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.User;
import com.example.yallah_m.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class ClientController {
    @Autowired
    private UserService userService;
    @GetMapping("/majUser")
    public String majClient(Model model, String cin){
        User user=userService.getUserById(cin);
        model.addAttribute("clientM",user);
        return "MAJ";
    }
    @PostMapping("/saveUser")
    public void saveClient(@Valid User user){
        userService.saveUser(user);
    }
    @GetMapping("/deleteUser")
    public void deleteClient(Integer id){
        userService.deleteUser(id);
    }

}
