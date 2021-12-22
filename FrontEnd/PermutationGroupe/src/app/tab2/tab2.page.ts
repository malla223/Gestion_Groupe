import { Component } from '@angular/core';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  list: Apprenant[];
  constructor(private aservice: ApprenantService) {}

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
      .subscribe({
        next: (res) => {
          console.log('suprimer');
        },
        error: (e) => console.error(e)
      });
  }

}