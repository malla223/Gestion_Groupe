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
public class Administrateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Admin;
    @NotNull
    private String nom;
    @NotNull
    private String email;
    @NotNull
    private String login;
    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Etat etat = Etat.actif;
}
