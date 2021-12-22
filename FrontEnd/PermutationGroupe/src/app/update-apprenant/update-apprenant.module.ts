import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { UpdateApprenantPageRoutingModule } from './update-apprenant-routing.module';

import { UpdateApprenantPage } from './update-apprenant.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    UpdateApprenantPageRoutingModule
  ],
  declarations: [UpdateApprenantPage]
})
export class UpdateApprenantPageModule {}
