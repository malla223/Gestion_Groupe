package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Groupe;
import com.groupeApprenant.demo.Repositories.GroupeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupeServiceImp implements GroupeService{

    @Autowired
    private GroupeRepositories groupeRepositories;

    @Override
    public Groupe add_grp(Groupe groupe) {
        return groupeRepositories.save(groupe);
    }

    @Override
    public Groupe update_grp(Long id, Groupe groupe) {
        Groupe grp = groupeRepositories.findById(id).get();
        grp.setNbreGroupe(groupe.getNbreGroupe());
        grp.setNbreMenbre(groupe.getNbreMenbre());
        grp.setEtat(groupe.getEtat());
        return groupeRepositories.save(grp);
    }

    @Override
    public List<Groupe> list_grp() {
        List<Groupe> liste = new ArrayList<>();
        liste = groupeRepositories.afficher_groupe();
        return liste;
    }

    @Override
    public Groupe afficher_grp_by_id(Long id) {
        return groupeRepositories.findById(id).get();
    }

    @Override
    public void delete_grp(Long id) {
        groupeRepositories.delete_groupe(id);
    }

    /*
    *  @Override
    public void delete_admin(Long id) {
        administrateurRepositories.delete_administrateur(id);
    }*/
}
