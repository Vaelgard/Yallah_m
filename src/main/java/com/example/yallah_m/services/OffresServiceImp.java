package com.example.yallah_m.services;

import com.example.yallah_m.entities.Client;
import com.example.yallah_m.entities.Offres;
import com.example.yallah_m.repositories.OffresRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class OffresServiceImp implements OffresService{
    private OffresRepository offresRepository;
    @Override
    public void ajouterOffres(Offres offres) {
        offresRepository.save(offres);
    }

    @Override
    public Offres getOffreById(Integer id) {
        return offresRepository.findOffresById(id);
    }

    @Override
    public void supprimerOffres(Integer id) {
        offresRepository.deleteById(id);
    }


    @Override
    public List<Offres> listOffres() {
        return offresRepository.findAll();
    }

}
