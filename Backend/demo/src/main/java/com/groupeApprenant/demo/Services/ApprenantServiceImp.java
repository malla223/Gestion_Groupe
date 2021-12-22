package com.groupeApprenant.demo.Services;
import com.groupeApprenant.demo.Models.Apprenant;
import com.groupeApprenant.demo.Repositories.ApprenantRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ApprenantServiceImp implements ApprenantService{
    @Autowired
    private ApprenantRepositories apprenantRepositories;

    @Override
    public Apprenant add_app(Apprenant apprenant) {
        return apprenantRepositories.save(apprenant);
    }

    @Override
    public Apprenant update_app(Long id, Apprenant Apprenant) {
        Apprenant app = apprenantRepositories.findById(id).get();
        app.setNomApprenant(Apprenant.getNomApprenant());
        app.setEmailApprenant(Apprenant.getEmailApprenant());
        app.setNumero(Apprenant.getNumero());
        app.setEtat(Apprenant.getEtat());
        return apprenantRepositories.save(app);
    }

    @Override
    public List<Apprenant> list_app() {
        List<Apprenant> liste = new ArrayList<>();
        liste = apprenantRepositories.findAll();
        return liste;
    }

    @Override
    public Apprenant afficher_app_by_id(Long id) {
        return apprenantRepositories.findById(id).get();

    }

    @Override
    public void delete_app(Long id) {
         apprenantRepositories.delete_apprenant(id);

    }


}
