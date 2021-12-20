package com.example.demo.Repository;

import com.example.demo.Entity.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
    @Query(value = "SELECT q FROM q WHERE q.etat='actif")
    List<Apprenant> listApprenant();

    @Query(value = "UPDATE FROM Apprenant SET etat='inactif'")
    void  deleteById(@Param("id_Apprenant") Long id_Apprenant);

    @Query(value = "SELECT s FROM Apprenant s WHERE s.id_Apprenant=:id_Apprenant AND s.etat='actif' ")
    Apprenant afficherById(@Param("id_Apprenant") Long id_Apprenant);

}
