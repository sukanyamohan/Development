import { Injectable } from '@angular/core';
import {CompanyPackage, CompanyPackageList, SearchParams} from "../interfaces/company-overview";
import {Observable} from "rxjs";
import {HttpClient, HttpHeaders, HttpParams} from "@angular/common/http";
import {query} from "@angular/animations";

@Injectable({
  providedIn: 'root'
})
export class CompanyPackagesService {

  response:string = "";
  constructor(private readonly httpClient: HttpClient) { }

  public getAllCompanyPackages(): Observable<CompanyPackage[]>{
    const headers = new HttpHeaders();
    return this.httpClient.get<CompanyPackage[]>('http://localhost:9013/tourism/company-details', {headers})
  }

  public getCompanyPackagesForCompanyId():Observable<CompanyPackageList>{
    const headers = new HttpHeaders();
    return this.httpClient.get<CompanyPackageList>('http://localhost:9013/tourism/1', {headers})
  }

  public getSearchResults(searchParams:SearchParams):Observable<CompanyPackage[]>{
    const headers = new HttpHeaders();
    // headers.set('Access-Control-Allow-Origin', '*');
    let queryParams = new HttpParams();
    queryParams = queryParams.append("branchName", searchParams.branchName);
    queryParams = queryParams.append("branchId", searchParams.branchId);
    queryParams = queryParams.append("place", searchParams.place);
    queryParams = queryParams.append("tariff", searchParams.tariff);
    return this.httpClient.get<CompanyPackage[]>('http://localhost:9013/tourism/search', {params: queryParams});
    // return this.httpClient.post<CompanyPackageList[]>('http://localhost:9013/tourism/search', searchParams, {headers});
  }
}
