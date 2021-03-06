package com.groupeApprenant.demo.Repositories;

import com.groupeApprenant.demo.Models.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface AdministrateurRepositories extends JpaRepository<Administrateur, Long> {

    Administrateur getAdministrateurByLoginAndPassword(String login,  String password);
    @Modifying
    @Query(value="UPDATE  Administrateur SET etat = 'inactif' WHERE id_Admin = :id ")
    void delete_administrateur(@Param("id") Long id);
}
