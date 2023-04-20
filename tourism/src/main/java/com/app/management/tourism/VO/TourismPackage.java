package com.app.management.tourism.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourismPackage {
    private long packageId;
    private long branchId;
    private String place;
    private long tariff;
}
