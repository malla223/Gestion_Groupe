package com.groupeApprenant.demo.Models;

import com.groupeApprenant.demo.Enumeration.Etat;
import com.sun.istack.NotNull;
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
    @NotNull
    private String nomApprenant;
    @NotNull
    private String emailApprenant;
    @NotNull
    private Integer numero;

    @Enumerated(EnumType.STRING)
    private Etat etat = Etat.actif;

    @ManyToOne
    private Administrateur admin;

    @ManyToOne
    private Groupe groupe;
}
