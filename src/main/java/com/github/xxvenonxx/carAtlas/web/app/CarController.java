package com.github.xxvenonxx.carAtlas.web.app;

import com.github.xxvenonxx.carAtlas.domain.model.Brand;
import com.github.xxvenonxx.carAtlas.domain.model.Car;
import com.github.xxvenonxx.carAtlas.service.BrandService;
import com.github.xxvenonxx.carAtlas.service.CarService;
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
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    private final BrandService brandService;
    public CarController(CarService carService, BrandService brandService) {
        this.carService = carService;
        this.brandService = brandService;
    }

    @ModelAttribute("allBrands")
    public List<Brand> brandList() {
        return brandService.getBrands();
    }

    @GetMapping("/all")
    public String AllCars(Model model){
        model.addAttribute(carService.getCars());
        return "app/Car/list";
    }
    @GetMapping("/add")
    public String AddCar(Model model){
        model.addAttribute("car", new Car());
        return "app/Car/add";
    }
    @PostMapping("/add")
    public String processAddCar(@Valid Car car, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "app/Car/add";
        }
        carService.addCar(car);
        return "redirect:/car/all";
    }

    @GetMapping("/delete")
    public String deleteCountry(Long id, Model model){
        model.addAttribute("car", carService.getCarById(id));
        return "app/Car/del";
    }
    @PostMapping("/delete")
    public String processDeleteCountry(Car car){
        carService.deleteCar(car.getId());
        return "redirect:/car/all";
    }

    @GetMapping("/edit")
    public String editCar(Long id, Model model){
        model.addAttribute("car", carService.getCarById(id));
        return "app/Car/edit";
    }
    @PostMapping("/edit")
    public String processEditCar(@Valid Car car,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "app/car/edit";
        }
        carService.updateCar(car);
        return "redirect:/car/all";
    }
}


