package com.app.management.tourism.controller;

import com.app.management.tourism.VO.ResponseTemplateVO;
import com.app.management.tourism.VO.TourismPackage;
import com.app.management.tourism.service.CompanyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CompanyControllerTest {

    private CompanyService service;

    @BeforeEach
    void setUp(){
        service = mock(CompanyService.class);
    }

    @Test
    void testGetCompanyPackages(){
        Long id = 2L;
        ResponseTemplateVO response = new ResponseTemplateVO();
        response.setTourismPackages(getTouristPackages());
        when(service.getCompanyPackagesByCompanyId(id)).thenReturn(response);
        ResponseTemplateVO companyPackages = service.getCompanyPackagesByCompanyId(id);
        Assertions.assertEquals(1, companyPackages.getTourismPackages().size());
    }

    private List<TourismPackage> getTouristPackages(){
        List<TourismPackage> tourismPackageList = new ArrayList<>();
        TourismPackage tourismPackage = new TourismPackage();
        tourismPackage.setBranchId(2);
        tourismPackage.setPackageId(1);
        tourismPackage.setPlace("Shimla");
        tourismPackage.setTariff(20000);
        tourismPackageList.add(tourismPackage);
        return tourismPackageList;
    }
}
