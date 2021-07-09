package com.github.xxvenonxx.carAtlas.web;

import com.github.xxvenonxx.carAtlas.domain.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String LoginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping
    public String LoginProcess(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/login";
        }
        return "redirect:/";
    }
}
