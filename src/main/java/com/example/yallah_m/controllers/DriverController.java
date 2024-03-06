package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.services.AdminService;
import com.example.yallah_m.services.DriverService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DriverController {
    @Autowired
    private DriverService driverService;
    @GetMapping("/majDriver")
    public String majDriver(Model model, String id){
        Driver driver=driverService.getDriverById(id);
        model.addAttribute("driverM",driver);
        return "MAJ";
    }
    @PostMapping("/saveDriver")
    public void saveDriver(@Valid Driver driver){
        driverService.saveDriver(driver);
    }
    @GetMapping("/deleteD")
    public void deleteDriver(String id){
        driverService.supprimerDriver(id);
    }

}
