package com.example.yallah_m.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AdminController {
    @GetMapping("/dashbordAdmin")
    public String dashBoard(){
        return "DashbordAdmin";
    }

}
