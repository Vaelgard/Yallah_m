package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.services.AdminService;
import com.example.yallah_m.services.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/listClient")
    public List<Client> clients(){
        return clientService.getClients();
    }
    @GetMapping("/majClient")
    public String majClient(Model model, String id){
        Client client=clientService.getClientById(id);
        model.addAttribute("clientM",client);
        return "MAJ";
    }
    @PostMapping("/saveClient")
    public void saveClient(@Valid Client client){
        clientService.saveClient(client);
    }
    @GetMapping("/deleteC")
    public void deleteClient(String id){
        clientService.supprimerClient(id);
    }

}
