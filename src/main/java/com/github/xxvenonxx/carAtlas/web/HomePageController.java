package com.github.xxvenonxx.carAtlas.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {
    public String HomePage(){
        return "index";
    }
}
