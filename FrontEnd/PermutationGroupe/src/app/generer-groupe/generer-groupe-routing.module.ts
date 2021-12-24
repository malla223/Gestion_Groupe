import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GenererGroupePage } from './generer-groupe.page';

const routes: Routes = [
  {
    path: '',
    component: GenererGroupePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class GenererGroupePageRoutingModule {}
