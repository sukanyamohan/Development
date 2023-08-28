import {Component, OnInit} from '@angular/core';
import {CompanyPackagesService} from "../services/company-packages.service";
import {CompanyPackage, CompanyPackageList} from "../interfaces/company-overview";
import {Router} from "@angular/router";

@Component({
  selector: 'app-tourism-packages-overview',
  templateUrl: './tourism-packages-overview.component.html',
  styleUrls: ['./tourism-packages-overview.component.css']
})
export class TourismPackagesOverviewComponent implements OnInit{
  companyPackageList: Array<CompanyPackage> = [];
  constructor(private readonly cpService:CompanyPackagesService, private readonly router: Router) {

  }
  ngOnInit() {
    this.getAllCompanyPackages();
  }

  getAllCompanyPackages(){
    this.cpService.getAllCompanyPackages().subscribe({
      next: (companyPackages) => {
        this.companyPackageList = companyPackages;
        console.log("Inside the next of service call" + this.companyPackageList?.length);
      },
      error: () => {
        console.log("Inside error of service call");
      }
    })
  }

  onSearchClick(){
    this.router.navigateByUrl("search");
  }
}
