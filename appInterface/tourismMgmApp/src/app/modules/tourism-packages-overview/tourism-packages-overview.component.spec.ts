import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TourismPackagesOverviewComponent } from './tourism-packages-overview.component';

describe('TourismPackagesOverviewComponent', () => {
  let component: TourismPackagesOverviewComponent;
  let fixture: ComponentFixture<TourismPackagesOverviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TourismPackagesOverviewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TourismPackagesOverviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
