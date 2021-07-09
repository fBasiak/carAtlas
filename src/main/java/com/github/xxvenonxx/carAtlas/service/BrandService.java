package com.github.xxvenonxx.carAtlas.service;

import com.github.xxvenonxx.carAtlas.domain.model.Brand;
import com.github.xxvenonxx.carAtlas.domain.model.Country;


import java.util.List;

public interface BrandService {
    Brand getBrandById(Long brandId);
    Brand addBrand(Brand brandToAdd);
    void updateBrand(Brand brandToUpdated);
    void deleteBrand(Long brandId);
    List<Brand> getBrands();

}

