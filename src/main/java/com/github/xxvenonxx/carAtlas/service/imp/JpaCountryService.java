package com.github.xxvenonxx.carAtlas.service.imp;

import com.github.xxvenonxx.carAtlas.domain.model.Country;
import com.github.xxvenonxx.carAtlas.domain.repository.CountryRepository;
import com.github.xxvenonxx.carAtlas.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@Slf4j
public class JpaCountryService implements CountryService {
    private final CountryRepository countryRepository;

    public JpaCountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }


    @Override
    public Country getCountryById(Long countryId) {
        return countryRepository.getById(countryId);
    }

    @Override
    public Country addCountry(Country countryToAdd) {
        log.info("Saving country " + countryToAdd);
        return countryRepository.save(countryToAdd);
    }


    @Override
    public void delCountry(Long countryId) {
       Country country = getCountryById(countryId);
        log.info("Deleting country " + country);
        countryRepository.delete(country);
    }

    @Override
    public List<Country> getCountries() {
        return countryRepository.findAll();
    }
}
