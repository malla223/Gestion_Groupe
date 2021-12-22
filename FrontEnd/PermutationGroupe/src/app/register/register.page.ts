import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../Classe/admin';
import { AdminService } from '../services/admin.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.page.html',
  styleUrls: ['./register.page.scss'],
})
export class RegisterPage implements OnInit {

  admin : Admin = {
    nom: '',
    password: '',
    email: '',
    login:''
  };
  constructor(private aservice: AdminService, private route: Router) { }

  ngOnInit() {
  }

  saveA(): any {
    const data = {
      nom: this.admin.nom,
      password: this.admin.password,
      login: this.admin.login,
      email:this.admin.email
    };

    this.aservice.saveAdmin(data)
      .subscribe({
        next: (res) => {
          window.alert("Enregistrer avec succes");
          console.log(res);
          this.route.navigateByUrl('/login')
        },
        error: (e) => console.error(e)
      });
  }
}
