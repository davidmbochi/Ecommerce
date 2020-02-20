package com.david.Ecommerce.Ecommerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homePageController {
    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }
}
