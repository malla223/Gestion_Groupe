package com.example.demo.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Apprenant;
import com.example.demo.Repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ApprenantServiceImp implements ApprenantService{
    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public Apprenant AjouterSupprimer(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public List<Apprenant> afficherApprenant() {
        return apprenantRepository.listApprenant();
    }

    @Override
    public Apprenant afficherById(Long id) {
        return apprenantRepository.afficherById(id);
    }

    @Override
    @Transactional
    public String MofifierApprenant(Apprenant apprenant, Long id) {
        Apprenant modifiApprenant = apprenantRepository.findById(id).get();
        modifiApprenant.setNomApprenant(apprenant.getNomApprenant());
        modifiApprenant.setPrenomApprenant(apprenant.getPrenomApprenant());
        modifiApprenant.setEmailApprenant(apprenant.getEmailApprenant());
        modifiApprenant.setTelephone(apprenant.getTelephone());
        return "apprenant modifier";
    }

    @Override
    public String supprimerApprenant(Long id) {
       apprenantRepository.deleteById(id);
        return "Apprenant supprimer";
    }
}
