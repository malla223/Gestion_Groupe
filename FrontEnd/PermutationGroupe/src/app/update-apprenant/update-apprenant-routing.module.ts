import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UpdateApprenantPage } from './update-apprenant.page';

const routes: Routes = [
  {
    path: '',
    component: UpdateApprenantPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class UpdateApprenantPageRoutingModule {}
