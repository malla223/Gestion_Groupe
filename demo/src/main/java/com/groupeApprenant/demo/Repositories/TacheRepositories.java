package com.groupeApprenant.demo.Repositories;


import com.groupeApprenant.demo.Models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TacheRepositories extends JpaRepository<Tache, Long> {
    @Query(value="UPDATE  Tache SET etat = 'inactif' WHERE id_Tache = :id ")
    void delete_tache(@Param("id") Long id);
}
