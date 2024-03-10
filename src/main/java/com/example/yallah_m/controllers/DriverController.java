package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.User;
import com.example.yallah_m.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@PreAuthorize("hasAuthority('DRIVER')")
@RequestMapping("Driver")
public class DriverController {
    @Autowired
    private UserService userService;
    @GetMapping("/majDriver")
    public String majDriver(Model model, String cin){
        User driver=userService.getUserById(cin);
        model.addAttribute("driverM",driver);
        return "MAJ";
    }
    @PostMapping("/saveDriver")
    public void saveDriver(@Valid User driver){

        userService.saveUser(driver);
    }
    @GetMapping("/deleteD")
    public void deleteDriver(Integer id){

        userService.deleteUser(id);
    }
    @GetMapping("/listUser")
    public List<User> drivers(){

        return userService.getUsers();
    }

}
