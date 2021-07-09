package com.github.xxvenonxx.carAtlas.web.app;

import com.github.xxvenonxx.carAtlas.domain.model.Country;
import com.github.xxvenonxx.carAtlas.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/country")
public class CountryController {
    private final CountryService countryService;

    public CountryController( CountryService countryService) {
        this.countryService = countryService;

    }

    @GetMapping("/all")
    public String AllCountries(Model model){
        model.addAttribute("countryList", countryService.getCountries());
        return "app/Country/list";
    }

    @GetMapping("/add")
    public String AddCountry(Model model){
        model.addAttribute("country", new Country());
        return "app/Country/add";
    }
    @PostMapping("/add")
    public String processAddCountry(@Valid Country country, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "app/Country/add";
        }
       countryService.addCountry(country);
        return "redirect:/country/all";
    }

    @GetMapping("/delete")
    public String deleteCountry(Long id, Model model){
        model.addAttribute("country", countryService.getCountryById(id));
        return "/app/Country/del";
    }
    @PostMapping("/delete")
    public String processDeleteCountry(Country country){
        countryService.delCountry(country.getId());
        return "redirect:/country/all";
    }
}

