package com.example.yallah_m.controllers;

import com.example.yallah_m.entities.Offres;
import com.example.yallah_m.services.OffresService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/offres")
@PreAuthorize("hasAuthority('ADMIN','DRIVER')")
public class OffresController {
    @Autowired
    private OffresService offresService;
    @GetMapping("/liste")
    public List<Offres> offres(){
        return offresService.listOffres();
    }
    @PostMapping("/ajouter")
    public String ajouteroffres(@Valid Offres offres){
        offresService.ajouterOffres(offres);
        return "Offres Ajouter";
    }
    @GetMapping("/maj")
    public String majOffres(Model model, Integer id){
        Offres offres=offresService.getOffreById(id);
        model.addAttribute("offresM",offres);
        return "MAJ";
    }
    @GetMapping("/supp")
    public void suppOffres(Integer id){
        offresService.supprimerOffres(id);
    }

}
