package com.app.management.tourism.VO;


import com.app.management.tourism.entities.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Company company;
    private List<TourismPackage> tourismPackages;

}
