package com.app.management.tourism.controller;

import com.app.management.tourism.VO.ResponseTemplateVO;
import com.app.management.tourism.entities.Company;
import com.app.management.tourism.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tourism/api/v1/branch")
@Slf4j
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping("/add-places")
    public Company addCompany(@RequestBody Company company){
        log.info("Add-places for a company : Company : " + company.getBranchName());
        return service.saveCompany(company);
    }

//    @GetMapping("/{id}")
//    public Company findCompanyById(@PathVariable("id") Long id){
//        return service.findByCompanyId(id);
//    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getCompanyPackages(@PathVariable("id") Long id){
        return service.getCompanyPackagesByCompanyId(id);
    }

}
