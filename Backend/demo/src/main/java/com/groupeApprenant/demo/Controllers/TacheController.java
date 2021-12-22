package com.groupeApprenant.demo.Controllers;


import com.groupeApprenant.demo.Models.Tache;
import com.groupeApprenant.demo.Services.TacheServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Controller
@RequestMapping("/api/apprenant")

public class TacheController {

    @Autowired
    TacheServiceImp tacheServiceImp;

    @PostMapping(value = "/addTache")
    @ResponseBody
    public Tache save(@RequestBody Tache tache) {
        return tacheServiceImp.add_tache(tache);
    }

    @GetMapping("/listTache")
    @ResponseBody
    public List<Tache> liste_Tache() {
        return tacheServiceImp.list_tache();
    }

    @PutMapping(value = "/updateTache/{id}")
    @ResponseBody
    public Tache updateTache(@PathVariable("id") Long id, @RequestBody Tache tache) {
        return tacheServiceImp.update_tache(id,tache);
    }

    @GetMapping(value = "/detailTache/{id}")
    @ResponseBody
    public Tache detailTache(@PathVariable("id") Long id) {
        return tacheServiceImp.afficher_tache_by_id(id);
    }

    @DeleteMapping(value = "/deleteTache/{id}")
    public void deleteTache(@PathVariable("id") Long id) {
        tacheServiceImp.delete_tache(id);
    }
}
