package com.github.xxvenonxx.carAtlas.web.app;

import com.github.xxvenonxx.carAtlas.domain.model.Brand;
import com.github.xxvenonxx.carAtlas.domain.model.Country;
import com.github.xxvenonxx.carAtlas.domain.repository.BrandRepository;
import com.github.xxvenonxx.carAtlas.service.BrandService;
import com.github.xxvenonxx.carAtlas.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/brand")
public class BrandController {
    private final BrandService brandService;
    private final CountryService countryService;
    private final BrandRepository brandRepository;
    public BrandController(BrandService brandService, CountryService countryService, BrandRepository brandRepository) {
        this.brandService = brandService;
        this.countryService = countryService;
        this.brandRepository = brandRepository;
    }

    @ModelAttribute("allCountries")
    public List<Country> countryList() {
        return countryService.getCountries();
    }

    @GetMapping("/all")
    public String AllBrands(Model model){
        model.addAttribute(brandRepository.findAll());
        return "app/Brand/list";
    }
    @GetMapping("/add")
    public String AddBrand(Model model){
        model.addAttribute("brand", new Brand());
        return "app/Brand/add";
    }
    @PostMapping("/add")
    public String processAddBrand(@Valid Brand brand, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "app/Brand/add";
        }
        brandService.addBrand(brand);
        return "redirect:/brand/all";
    }

    @GetMapping("/delete")
    public String deleteBrand(Long id, Model model){
        model.addAttribute("brand", brandService.getBrandById(id));
        return "app/Brand/del";
    }
    @PostMapping("/delete")
    public String processDeleteBrand(Brand brand){
        brandService.deleteBrand(brand.getId());
        return "redirect:/brand/all";
    }

}


