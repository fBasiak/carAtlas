package com.github.xxvenonxx.carAtlas.service.imp;

import com.github.xxvenonxx.carAtlas.domain.model.Brand;
import com.github.xxvenonxx.carAtlas.domain.model.Country;
import com.github.xxvenonxx.carAtlas.domain.repository.BrandRepository;
import com.github.xxvenonxx.carAtlas.domain.repository.CountryRepository;
import com.github.xxvenonxx.carAtlas.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//TODO Używać jak ma to sens - jeden serwis, to @Primary nie jest potrzebne
@Primary
@Slf4j
public class JpaBrandService implements BrandService {
    private final BrandRepository brandRepository;
    //TODO Jak coś jest niepotrzebne to warto usunąć
    private final CountryRepository countryRepository;


    public JpaBrandService(BrandRepository brandRepository, CountryRepository countryRepository) {
        this.brandRepository = brandRepository;
        this.countryRepository = countryRepository;
    }

        @Override
    public Brand getBrandById(Long brandId) {
        return brandRepository.getById(brandId);
    }


    @Override
    public Brand addBrand(Brand brandToAdd) {
        log.info("Saving brand " + brandToAdd);
        return brandRepository.save(brandToAdd);
    }

    @Override
    public void updateBrand(Brand brandToUpdated) {
        log.info("Updating brand " + brandToUpdated);
        //TODO Bardzo dobrze -> pobieramy z bazy i to updatetujemy, a nie to co na wejściu
        Brand brand = getBrandById(brandToUpdated.getId());
        brand.setName(brandToUpdated.getName());
        brand.setFounder(brandToUpdated.getFounder());
        brand.setYear(brandToUpdated.getYear());
        brand.setCountry(brandToUpdated.getCountry());
        brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Long brandId) {
        //TODO Bardzo dobrze, żę najpierw pobierasz to, co jest do zmiany/usunięcia
        //     a potem wykonujesz operacje
        Brand brand = getBrandById(brandId);
        log.info("Deleting brand " + brand);
        brandRepository.delete(brand);
    }

    @Override
    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }




}
