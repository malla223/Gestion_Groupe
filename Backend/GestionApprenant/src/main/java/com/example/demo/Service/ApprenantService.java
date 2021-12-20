package com.example.demo.Service;

import com.example.demo.Entity.Apprenant;

import java.util.List;

public interface ApprenantService {
    Apprenant AjouterSupprimer(Apprenant apprenant);
    List<Apprenant> afficherApprenant();
    Apprenant afficherById(Long id);
    String MofifierApprenant(Apprenant apprenant,Long id);
    String supprimerApprenant(Long id);

}
