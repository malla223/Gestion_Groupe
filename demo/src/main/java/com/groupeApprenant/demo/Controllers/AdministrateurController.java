package com.groupeApprenant.demo.Controllers;

import com.groupeApprenant.demo.Models.Administrateur;
import com.groupeApprenant.demo.Services.AdministrateurServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@Controller
@RequestMapping("/api/administrateur")

public class AdministrateurController {

    @Autowired
    AdministrateurServiceImp administrateurServiceImp;

    @PostMapping(value = "/addAdministrateur")
    @ResponseBody
    public Administrateur save(@RequestBody Administrateur administrateur) {
        return administrateurServiceImp.add_admin(administrateur);
    }

    @GetMapping("/listAdministrateur")
    @ResponseBody
    public List<Administrateur> liste_administrateur() {
        return administrateurServiceImp.list_admin();
    }


    @PutMapping(value = "/updateAdministrateur/{id}")
    @ResponseBody
    public Administrateur updateAdministrateur(@PathVariable("id") Long id, @RequestBody Administrateur administrateur) {
        return administrateurServiceImp.update_admin(id, administrateur);
    }

    @GetMapping(value = "/detailAdministrateur/{id}")
    @ResponseBody
    public Administrateur detailAdministrateur(@PathVariable("id") Long id) {
        return administrateurServiceImp.afficher_admin_by_id(id);
    }
    @PutMapping("/deleteAdministrateur/{id}")
    public void deleteAdministrateur(@PathVariable("id") Long id) {
        administrateurServiceImp.delete_admin(id);
    }

    @GetMapping("/login/{login}&{password}")
    public Optional<Administrateur> loginUser(@PathVariable("login") String login, @PathVariable("password") String password) {
        return administrateurServiceImp.LoginUser(login, password);
    }

}
