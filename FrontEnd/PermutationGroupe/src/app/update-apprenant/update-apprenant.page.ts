import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';

@Component({
  selector: 'app-update-apprenant',
  templateUrl: './update-apprenant.page.html',
  styleUrls: ['./update-apprenant.page.scss'],
})
export class UpdateApprenantPage implements OnInit {

  id_Apprenant: any;
  apprenant: Apprenant = new Apprenant();

  constructor(private aService: ApprenantService,
    private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.id_Apprenant = this.route.snapshot.params['id_Apprenant'];

    this.aService.getApprenantById(this.id_Apprenant).subscribe(data => {
      this.apprenant = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.aService.updateApprenant(this.id_Apprenant, this.apprenant).subscribe( data =>{
      console.log(data);
      this.router.navigateByUrl('/tab2');
    }
    , error => console.log(error));
  }

}
