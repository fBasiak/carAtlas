package com.github.xxvenonxx.carAtlas.web;

import com.github.xxvenonxx.carAtlas.domain.model.User;
import com.github.xxvenonxx.carAtlas.domain.repository.UserRepository;
import com.github.xxvenonxx.carAtlas.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegisterController {
    private final UserService userService;


    public RegisterController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping
    public String prepareRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String processRegister(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //TODO Tutaj bez redirect:
            return "redirect:/register";
        }
        //TODO Sprawdzenie czy username już istnieje
//        if (userService.checkExists(user.getUsername())) {
//            //1 -> nazwa pola
//            //2 -> kod błędu (jak używamy internacjonalizacji)
//            //3 -> komunikat błędu (jak NIE używamy internacjonalizacji)
//            bindingResult.rejectValue("username", null, "Username already used");
//            return "register";
//        }
            userService.addUser(user);
            return "redirect:login";
        }
    }


