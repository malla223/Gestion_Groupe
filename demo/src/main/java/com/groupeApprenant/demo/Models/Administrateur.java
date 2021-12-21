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
public class Administrateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Admin;
    private String nom;
    private String email;
    private String login;
    private String password;

    @Enumerated(EnumType.STRING)
    private Etat etat = Etat.actif;
}
