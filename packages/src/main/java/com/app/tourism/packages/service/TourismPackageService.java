package com.app.tourism.packages.service;

import com.app.tourism.packages.entity.TourismPackage;
import com.app.tourism.packages.respository.TourismPackageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourismPackageService {

    @Autowired
    private TourismPackageRepo packageRepo;

    public TourismPackage savePackage(TourismPackage tpackage){
        return packageRepo.save(tpackage);
    }

    public List<TourismPackage> getPackagesByBranchId(Long id){
        return packageRepo.findAllByBranchId(id);
    }
}
