package com.groupeApprenant.demo.Repositories;

import com.groupeApprenant.demo.Models.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;


@CrossOrigin("*")
@Transactional
public interface ApprenantRepositories extends JpaRepository<Apprenant, Long> {

    @Modifying
    @Query(value="UPDATE  Apprenant SET etat = 'inactif' WHERE id_Apprenant = :id ")
    void delete_apprenant(@Param("id") Long id);

    @Query(value="SELECT ap FROM Apprenant ap WHERE ap.etat = 'actif' ")
    List<Apprenant> afficher_apprenant();

    @Query(value="SELECT ap FROM Apprenant ap WHERE ap.etat = 'actif'AND ap.id_Apprenant=:id_Apprenant ")
    Apprenant getApprenantById(@Param("id_Apprenant") Long id_Apprenant);
}

