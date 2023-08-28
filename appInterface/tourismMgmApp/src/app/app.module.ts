import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TourismPackagesOverviewComponent } from './modules/tourism-packages-overview/tourism-packages-overview.component';
import { HttpClientModule} from "@angular/common/http";
import { SearchComponent } from './modules/search/search.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    TourismPackagesOverviewComponent,
    SearchComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
