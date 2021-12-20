package com.example.demo.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImp implements AdminService{
    @Autowired
    AdminRepository adminRepository;
    @Override
    public Admin AjouterApprenant(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> afficheApprenant() {
        return adminRepository.listAdmin();
    }

    @Override
    public String supprimerApprenant(Long id) {
        adminRepository.deleteAdmin(id);
        return "apprenant supprimer";
    }

    @Override
    public String ModifierApprenant(Admin admin, Long id) {
        return null;
    }

    @Override
    public Admin afficherById(long id) {
        return adminRepository.getAdminById(id);
    }

    @Override
    public Admin connexionAdmin(String email, String password) {
        return adminRepository.findByEmailAndPassword(email ,password);
    }

}
