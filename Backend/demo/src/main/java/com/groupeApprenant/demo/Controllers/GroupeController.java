package com.groupeApprenant.demo.Controllers;
import com.groupeApprenant.demo.Models.Groupe;
import com.groupeApprenant.demo.Services.GroupeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Controller
@RequestMapping("/api/apprenant")

public class GroupeController {
    @Autowired
    GroupeServiceImp groupeServiceImp;

    @PostMapping(value = "/addGroupe")
    @ResponseBody
    public Groupe save(@RequestBody Groupe groupe) {
        return groupeServiceImp.add_grp(groupe);
    }

    @GetMapping("/listGroupe")
    @ResponseBody
    public List<Groupe> liste_Groupe() {
        return groupeServiceImp.list_grp();
    }

    @PutMapping(value = "/updateGroupe/{id}")
    @ResponseBody
    public Groupe updateGroupe(@PathVariable("id") Long id, @RequestBody Groupe groupe) {
        return groupeServiceImp.update_grp(id,groupe);
    }

    @GetMapping(value = "/detailGroupe/{id}")
    @ResponseBody
    public Groupe detailGroupe(@PathVariable("id") Long id) {
        return groupeServiceImp.afficher_grp_by_id(id);
    }

    @DeleteMapping(value = "/deleteGroupe/{id}")
    public void deleteGroupe(@PathVariable("id") Long id) {
        groupeServiceImp.delete_grp(id);
    }
}
