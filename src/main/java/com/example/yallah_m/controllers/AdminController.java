package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Driver;
import com.example.yallah_m.entities.Offres;
import com.example.yallah_m.services.AdminService;
import jakarta.validation.Valid;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    AdminService adminService;
    @GetMapping("/dashbordAdmin")
    public String dashBoard(){
        return "DashbordAdmin";
    }
    @GetMapping("/dashbordAdmin/listoffres")
    public List<Offres> offres(){
        return adminService.listOffres();
    }
    @PostMapping("/dashbordAdmin/ajouteroffres")
    public String ajouteroffres(@Valid Offres offres){
        adminService.ajouterOffres(offres);
        return "Offres Ajouter";
    }
    @GetMapping("/dashbordAdmin/suppoffres")
    public void suppOffres(Integer id){
        adminService.supprimerOffres(id);
    }
    @GetMapping("/dashbordAdmin/listClient")
    public List<Client> clients(){
        return adminService.getClients();
    }
    @GetMapping("/dashbordAdmin/majClient")
    public String majClient(Model model,String id){
        Client client=adminService.getClientById(id);
        model.addAttribute("clientM",client);
        return "MAJ";
    }
    @PostMapping("/dashbordAdmin/saveClient")
    public void saveClient(@Valid Client client){
        adminService.majClient(client);
    }
    @GetMapping("/dashbordAdmin/deleteC")
    public void deleteClient(String id){
        adminService.supprimerClient(id);
    }
    @GetMapping("/dashbordAdmin/majDriver")
    public String majDriver(Model model,String id){
        Driver driver=adminService.getDriverById(id);
        model.addAttribute("driverM",driver);
        return "MAJ";
    }
    @PostMapping("/dashbordAdmin/saveDriver")
    public void saveDriver(@Valid Driver driver){
        adminService.majDriver(driver);
    }
    @GetMapping("/dashbordAdmin/deleteD")
    public void deleteDriver(String id){
        adminService.supprimerDriver(id);
    }
}
