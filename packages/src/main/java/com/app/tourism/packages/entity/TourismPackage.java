package com.app.tourism.packages.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourismPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long packageId;
    private long branchId;
    private String place;
    private long tariff;
}
