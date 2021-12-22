package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Apprenant;

import java.util.List;

public interface ApprenantService {

    // Gestion des Apprenant
    public Apprenant add_app(Apprenant apprenant);

    public Apprenant update_app(Long id, Apprenant Apprenant);

    public List<Apprenant> list_app();

    public Apprenant afficher_app_by_id(Long id);

    public void delete_app(Long id);
}
