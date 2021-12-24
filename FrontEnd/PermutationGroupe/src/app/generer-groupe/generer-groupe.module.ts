import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { GenererGroupePageRoutingModule } from './generer-groupe-routing.module';

import { GenererGroupePage } from './generer-groupe.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    GenererGroupePageRoutingModule
  ],
  declarations: [GenererGroupePage]
})
export class GenererGroupePageModule {}
