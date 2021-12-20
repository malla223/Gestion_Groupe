package com.example.demo.Entity;

import com.example.demo.enumeration.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id_groupe;
    private String NbreGroupe;
    private Etat etat = Etat.actif;


    @OneToMany(mappedBy = "groupe")
    private Collection<Apprenant> apprenant ;
    @OneToMany(mappedBy ="tache" )
    private Long id_tache;



}
