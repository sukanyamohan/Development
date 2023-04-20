package com.app.management.tourism.service;

import com.app.management.tourism.VO.ResponseTemplateVO;
import com.app.management.tourism.VO.TourismPackage;
import com.app.management.tourism.entities.Company;
import com.app.management.tourism.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public Company findByCompanyId(Long id){
        return companyRepository.findByBranchId(id);
    }

    public ResponseTemplateVO getCompanyPackagesByCompanyId(Long id){
        ResponseTemplateVO responseVO = new ResponseTemplateVO();
        Company company = companyRepository.findByBranchId(id);
        TourismPackage[] tourismPackages = restTemplate.getForObject("http://PACKAGE-SERVICE/packages/" + company.getBranchId(), TourismPackage[].class);
        List<TourismPackage> packageList = Arrays.asList(tourismPackages);
        responseVO.setCompany(company);
        responseVO.setTourismPackages(packageList);
        return responseVO;
    }
}


