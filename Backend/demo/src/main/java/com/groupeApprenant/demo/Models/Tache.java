package com.groupeApprenant.demo.Models;

import com.groupeApprenant.demo.Enumeration.Etat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Tache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Tache;
    private String libelle;

    @Enumerated(EnumType.STRING)
    private Etat etat = Etat.actif;
}
