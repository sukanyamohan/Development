package com.app.management.tourism.repository;

import com.app.management.tourism.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findByBranchId(Long id);
}
