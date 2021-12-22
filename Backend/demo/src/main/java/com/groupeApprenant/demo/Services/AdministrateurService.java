package com.groupeApprenant.demo.Services;

import com.groupeApprenant.demo.Models.Administrateur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface AdministrateurService {

    // Gestion des Administrateurs
    public Administrateur add_admin(Administrateur administrateur);

    public Administrateur update_admin(Long id, Administrateur administrateur);

    public List<Administrateur> list_admin();

    public Administrateur afficher_admin_by_id(Long id);

    public void delete_admin(Long id);

    Administrateur LoginUser(String login, String password);

}
