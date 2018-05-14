package com.pl.librr.controller;

import com.pl.librr.model.User;
import com.pl.librr.service.BookService;
import com.pl.librr.service.GenreService;
import com.pl.librr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Locale;


@Controller
public class MainController {

    @Autowired
    GenreService genreService;

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    @PostMapping("/os_library/main")
    public String toMainPage(@ModelAttribute("welcome")User user, Model model){
        model.addAttribute("genres",genreService.findAllGenres());
        model.addAttribute("username",user);
        model.addAttribute("books",bookService.getAllBooks());
        return "main";
    }
    @GetMapping("/os_library/main")
    public String mainLocale(Model model,Locale locale){
        model.addAttribute("genres",genreService.findAllGenres());
        model.addAttribute("books",bookService.getAllBooks());
        return "main";
    }



}
