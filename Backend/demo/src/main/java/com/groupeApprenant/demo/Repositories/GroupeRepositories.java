package com.groupeApprenant.demo.Repositories;

import com.groupeApprenant.demo.Models.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GroupeRepositories extends JpaRepository<Groupe, Long> {
    @Query(value="UPDATE  Groupe SET etat = 'inactif' WHERE id_groupe = :id ")
    void delete_groupe(Long id);
}
