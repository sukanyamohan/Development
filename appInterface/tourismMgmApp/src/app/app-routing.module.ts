import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {
  TourismPackagesOverviewComponent
} from "./modules/tourism-packages-overview/tourism-packages-overview.component";
import {SearchComponent} from "./modules/search/search.component";


const routes: Routes = [
  {
  path: '', component: TourismPackagesOverviewComponent
  },
  {
   path: 'search', component: SearchComponent
  }];


  @NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
