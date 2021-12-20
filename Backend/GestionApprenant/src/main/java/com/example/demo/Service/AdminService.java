package com.example.demo.Service;

import com.example.demo.Entity.Admin;

import java.util.List;

public interface AdminService {
    Admin AjouterApprenant(Admin admin);
    List<Admin> afficheApprenant();
    String supprimerApprenant(Long id);
    String ModifierApprenant(Admin admin,Long id);
    Admin afficherById(long id);
    Admin connexionAdmin(String email,String  password);

}
