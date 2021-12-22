package com.groupeApprenant.demo.Services;


import com.groupeApprenant.demo.Models.Tache;
import com.groupeApprenant.demo.Repositories.TacheRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TacheServiceImp implements TacheService{

    @Autowired
    private TacheRepositories tacheRepositories;
    @Override
    public Tache add_tache(Tache tache) {
        return tacheRepositories.save(tache);
    }

    @Override
    public Tache update_tache(Long id, Tache tache) {
        Tache tach = tacheRepositories.findById(id).get();
        tach.setLibelle(tache.getLibelle());
        tach.setEtat(tache.getEtat());
        return tacheRepositories.save(tach);
    }

    @Override
    public List<Tache> list_tache() {
        List<Tache> liste = new ArrayList<>();
        liste = tacheRepositories.afficher_tache();
        return liste;
    }

    @Override
    public Tache afficher_tache_by_id(Long id) {
        return tacheRepositories.findById(id).get();
    }

    @Override
    public void delete_tache(Long id) {
        tacheRepositories.delete_tache(id);
    }

}
