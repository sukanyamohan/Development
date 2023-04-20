package com.app.tourism.packages.respository;

import com.app.tourism.packages.entity.TourismPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourismPackageRepo extends JpaRepository<TourismPackage, Long> {

    public List<TourismPackage> findAllByBranchId(Long id);
}
