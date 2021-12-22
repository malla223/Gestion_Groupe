import { Component } from '@angular/core';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {
  users: any[];
  list: Apprenant[];
  filterTerm: string;

  constructor(private aservice: ApprenantService, private route: Router) {}

  ngOnInit(): void {
    this.getList();
  }

  getList(): any {
    this.aservice.getAllApprenant()
      .subscribe({
        next: (data) => {
          this.list = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  deleteA(id: any){
    this.aservice.deleteApprenant(id)
      .subscribe(res =>{
          console.log('res');
          this.getList();
      })
  }

  apprenantDetails(id_Apprenant: any){
    this.route.navigateByUrl('/detail', id_Apprenant);
  }
}