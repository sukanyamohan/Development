import { Component } from '@angular/core';
import {FormBuilder} from "@angular/forms";
import {CompanyPackagesService} from "../services/company-packages.service";
import {CompanyPackage, SearchParams} from "../interfaces/company-overview";

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  companyPackageList: Array<CompanyPackage> = [];
  searchParams: SearchParams = {
    branchName: '',
    branchId: '',
    place: '',
    tariff: ''
  };
  constructor(private formBuilder: FormBuilder, private readonly cpService:CompanyPackagesService) {
  }
  searchForm = this.formBuilder.group({
    branchName: '',
    branchId: '',
    place: '',
    tariff: ''
  })
  onSearchSubmit(){
    console.log("Inside the onSearchSubmit method")
    this.companyPackageList = [];
    // console.log("Test values : " + this.searchForm.get('branchName')?.value)
    this.searchParams = {
      branchName: this.searchForm.controls['branchName'].value ? this.searchForm.controls['branchName'].value : '',
      branchId: this.searchForm.controls['branchId'].value ? this.searchForm.controls['branchId'].value : '',
      place: this.searchForm.controls['place'].value ? this.searchForm.controls['place'].value : '',
      tariff: this.searchForm.controls['tariff'].value ? this.searchForm.controls['tariff'].value : ''
    };
    this.cpService.getSearchResults(this.searchParams).subscribe({
      next: (results) => {
        this.companyPackageList = results;
        console.log("Inside the next of service call " + this.companyPackageList?.length);
      },
        error: () => {
        console.log("Inside error of search service call");
      }
    })
  }
}
