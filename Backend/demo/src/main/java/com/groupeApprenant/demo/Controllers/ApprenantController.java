package com.groupeApprenant.demo.Controllers;

import com.groupeApprenant.demo.Models.Apprenant;
import com.groupeApprenant.demo.Services.ApprenantServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@Controller
@RequestMapping("/api/apprenant")

public class ApprenantController {

    @Autowired
    ApprenantServiceImp apprenantServiceImp;

    @PostMapping(value = "/addApprenant")
    @ResponseBody
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return apprenantServiceImp.add_app(apprenant);
    }

    @GetMapping("/listApprenant")
    @ResponseBody
    public List<Apprenant> liste_Apprenant() {
        return apprenantServiceImp.list_app();
    }

    @PutMapping(value = "/updateApprenant/{id}")
    @ResponseBody
    public Apprenant updateApprenant(@PathVariable("id") Long id, @RequestBody Apprenant apprenant) {
        return apprenantServiceImp.update_app(id,apprenant);
    }

    @GetMapping(value = "/detailApprenant/{id}")
    @ResponseBody
    public Apprenant detailApprenant(@PathVariable("id") Long id) {
        return apprenantServiceImp.afficher_app_by_id(id);
    }

    @DeleteMapping(value = "/deleteApprenant/{id}")
    public void deleteApprenant(@PathVariable("id") Long id) {
        apprenantServiceImp.delete_app(id);
    }

}
