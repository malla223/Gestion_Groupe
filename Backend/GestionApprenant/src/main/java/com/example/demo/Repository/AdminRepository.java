package com.example.demo.Repository;

import com.example.demo.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepository extends JpaRepository <Admin ,Long>{
    Admin findByEmailAndPassword(String email, String password);

    @Query(value="SELECT p FROM Admin p WHERE p.etat='actif' ")
    List<Admin> listAdmin();

    @Query(value = "UPDATE FROM Admin SET etat='inactif' ")
    void deleteAdmin(@Param("id_Admin") Long id_Admin);

    @Query(value = "SELECT p FROM Admin p WHERE p.id_Admin=:id_Admin AND p.etat='actif'")
    Admin getAdminById(@Param("id_Admin") Long id_Admin);
}
