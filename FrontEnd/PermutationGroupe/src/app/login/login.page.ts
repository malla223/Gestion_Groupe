import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../services/admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {
  adminUser: any;
  id_Admin: any;
  
  constructor(private aservice: AdminService, private router: Router) {
    localStorage.clear;
    localStorage.removeItem("login");
   }

  ngOnInit() {
  }

  
  onLogin(form: NgForm) {
    this.aservice.connexion(form.value["login"], form.value["password"]).subscribe((res:any)=>{

      console.log("===================="+res);

      localStorage.setItem("admin", res);
      localStorage.setItem("admin", res.admin);
      localStorage.setItem("login", res.login);
      // localStorage.setItem("login", res.admin.login);
      // localStorage.setItem("nom", res.admin.nom);
      // localStorage.setItem("password", res.admin.password);
      // localStorage.setItem("email", res.admin.email);
      this.router.navigateByUrl('/tabs');
    });
}

}
