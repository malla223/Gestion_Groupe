package com.example.demo.Entity;

import com.example.demo.enumeration.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Apprenant;
    private String nomApprenant;
    private String prenomApprenant;
    private String emailApprenant;
    private Integer Telephone;
    private Etat etat = Etat.actif;

    @ManyToOne
    @JoinColumn(name="Apprenant")
    private Groupe groupe;



}


