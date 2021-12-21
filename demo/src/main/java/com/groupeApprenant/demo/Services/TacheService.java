package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Groupe;
import com.groupeApprenant.demo.Models.Tache;

import java.util.List;

public interface TacheService {

    // Gestion des Taches

    public Tache add_tache(Tache tache);

    public Tache update_tache(Long id, Tache tache);

    public List<Tache> list_tache();

    public Tache afficher_tache_by_id(Long id);

    public void delete_tache(Long id);
}
