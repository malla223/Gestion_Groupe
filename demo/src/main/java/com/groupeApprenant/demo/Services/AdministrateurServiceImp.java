package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Administrateur;
import com.groupeApprenant.demo.Repositories.AdministrateurRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdministrateurServiceImp implements AdministrateurService{

    @Autowired
    private AdministrateurRepositories administrateurRepositories;

    @Override
    public Administrateur add_admin(Administrateur administrateur) {
        return administrateurRepositories.save(administrateur);
    }

    @Override
    public Administrateur update_admin(Long id, Administrateur administrateur) {
        Administrateur admin = administrateurRepositories.findById(id).get();
        admin.setNom(administrateur.getNom());
        admin.setPassword(administrateur.getPassword());
        admin.setEmail(administrateur.getEmail());
        admin.setEtat(administrateur.getEtat());
        return administrateurRepositories.save(admin);
    }

    @Override
    public List<Administrateur> list_admin() {
        List<Administrateur> liste = new ArrayList<>();
        liste = administrateurRepositories.findAll();
        return liste;
    }

    @Override
    public Administrateur afficher_admin_by_id(Long id) {
        return administrateurRepositories.findById(id).get();
    }

    @Override
    public void delete_admin(Long id) {
        administrateurRepositories.delete_administrateur(id);
    }

    @Override
    public Optional<Administrateur> LoginUser(String login, String password) {
        return administrateurRepositories.getUserByLoginAndPassword(login, password);
    }

}
