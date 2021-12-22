import { Component, OnInit } from '@angular/core';
import { ActivatedRoute} from '@angular/router';
import { Apprenant } from '../Classe/apprenant';
import { ApprenantService } from '../services/apprenant.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.page.html',
  styleUrls: ['./detail.page.scss'],
})
export class DetailPage implements OnInit {
  id_Apprenant:any;
  apprenant:any;
  constructor(private router: ActivatedRoute, private aservice: ApprenantService) { }

  ngOnInit() {
    this.id_Apprenant = this.router.snapshot.params['id_Apprenant'];
    console.log(this.id_Apprenant);
    
    
    this.aservice.getApprenantById(this.id_Apprenant).subscribe( data => {
      console.log(data);
      
      this.apprenant = data;
    });
  }

}
