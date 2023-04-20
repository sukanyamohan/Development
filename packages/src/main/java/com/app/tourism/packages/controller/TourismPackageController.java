package com.app.tourism.packages.controller;

import com.app.tourism.packages.entity.TourismPackage;
import com.app.tourism.packages.service.TourismPackageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
@Slf4j
public class TourismPackageController {

    @Autowired
    private TourismPackageService tourismPackageService;

    @PostMapping("/")
    public TourismPackage savePackage(@RequestBody TourismPackage tpackage){
        return tourismPackageService.savePackage(tpackage);
    }

    @GetMapping("/{id}")
    public List<TourismPackage> getPackages(@PathVariable("id") Long id){
        log.info("Inside getPackages : " + id);
        return tourismPackageService.getPackagesByBranchId(id);
    }
}
