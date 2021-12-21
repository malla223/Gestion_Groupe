package com.groupeApprenant.demo.Models;

import com.groupeApprenant.demo.Enumeration.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id_groupe;
    private Integer NbreGroupe;
    private Integer NbreMenbre;

    @Enumerated(EnumType.STRING)
    private Etat etat = Etat.actif;

    @ManyToOne
    private Tache tache;
}
