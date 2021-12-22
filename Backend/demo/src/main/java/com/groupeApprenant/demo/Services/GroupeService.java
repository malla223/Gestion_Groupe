package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Groupe;

import java.util.List;

public interface GroupeService {

    // Gestion des Groupes
    public Groupe add_grp(Groupe groupe);

    public Groupe update_grp(Long id, Groupe groupe);

    public List<Groupe> list_grp();

    public Groupe afficher_grp_by_id(Long id);

    public void delete_grp(Long id);
}

