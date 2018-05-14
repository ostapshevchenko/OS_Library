package com.pl.librr.controller;

import com.pl.librr.model.User;
import com.pl.librr.service.UserService;
import com.pl.librr.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    UserValidator userValidator;

    @InitBinder
    public void bind(WebDataBinder binder){
        binder.addValidators(userValidator);
    }

    @GetMapping("/os_library/logIN")
    public String toLogInPage(Model model, Locale locale){
        model.addAttribute("login",new User());
        return "login";
    }
    @PostMapping("/os_library")
    public String createNewUser(@ModelAttribute("login") @Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "login";
        }
        userService.saveUser(user);
        return "welcome";
    }


}
