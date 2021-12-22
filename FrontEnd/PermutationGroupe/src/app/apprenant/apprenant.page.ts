import { Component, OnInit } from '@angular/core';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-apprenant',
  templateUrl: './apprenant.page.html',
  styleUrls: ['./apprenant.page.scss'],
})
export class ApprenantPage implements OnInit {
 

  constructor(private aservice: ApprenantService, private  route: Router) { }

  apprenant : Apprenant = {
    nomApprenant: '',
    emailApprenant: '',
    numero: ''
  };

  ngOnInit() {}

  saveApprenant(): any {
    const data = {
      nomApprenant: this.apprenant.nomApprenant,
      emailApprenant: this.apprenant.emailApprenant,
      numero: this.apprenant.numero
    };

    this.aservice.saveApprenant(data)
      .subscribe({
        next: (res) => {
          console.log(res);
          this.route.navigateByUrl('/tab2')
        },
        error: (e) => console.error(e)
      });
  }
 

}
