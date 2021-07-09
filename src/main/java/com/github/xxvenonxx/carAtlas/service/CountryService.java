package com.github.xxvenonxx.carAtlas.service;



import com.github.xxvenonxx.carAtlas.domain.model.Country;

import java.util.List;

public interface CountryService {
    Country getCountryById(Long countryId);
    Country addCountry(Country countryToAdd);
    void delCountry(Long countryToDel);
    List<Country> getCountries();


}



