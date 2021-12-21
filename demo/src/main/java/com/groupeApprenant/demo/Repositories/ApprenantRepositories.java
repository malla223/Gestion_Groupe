package com.groupeApprenant.demo.Repositories;

import com.groupeApprenant.demo.Models.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ApprenantRepositories extends JpaRepository<Apprenant, Long> {
    @Modifying
    @Query(value="UPDATE  Apprenant SET etat = 'inactif' WHERE id_Apprenant = :id ")
    void delete_apprenant(Long id);
}

