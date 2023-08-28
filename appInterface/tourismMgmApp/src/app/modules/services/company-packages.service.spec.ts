import { TestBed } from '@angular/core/testing';

import { CompanyPackagesService } from './company-packages.service';

describe('CompanyPackagesService', () => {
  let service: CompanyPackagesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CompanyPackagesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
