
export interface CompanyPackageList {
  companyPackageList: Array<CompanyPackage>;
}
export interface CompanyPackage{
  branchId: number,
  branchName: string,
  website: string,
  contact: string,
  email: string,
  tourismPackageList: Array<TourismPackage>
}
export interface TourismPackage{
  packageId: number,
  branchId: number,
  place: string,
  tariff: number
}

export interface SearchParams{
  branchName: string,
  branchId: string,
  place: string,
  tariff: string
}
