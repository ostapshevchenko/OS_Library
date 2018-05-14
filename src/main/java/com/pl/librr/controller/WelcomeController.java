package com.pl.librr.controller;

import com.pl.librr.model.User;
import com.pl.librr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class WelcomeController {

    @Autowired
    UserService userService;

    @GetMapping("/os_library")
    public String mainPage(Model model, Locale locale)
    {
        model.addAttribute("user",new User());
        return "welcome";
    }

}
