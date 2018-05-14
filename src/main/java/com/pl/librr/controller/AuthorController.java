package com.pl.librr.controller;

import com.pl.librr.model.Author;
import com.pl.librr.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/os_library/admin/addAuthor")
    public String addAuthorPage(Model model){
        model.addAttribute("author",new Author());
        return "addAuthor";
    }

    @PostMapping("/os_library/admin/authorAdded")
    public String addAuthor(@ModelAttribute("author")Author author,Model model){
        authorService.saveAuthor(author);
        model.addAttribute("aut",author);
        model.addAttribute("success","Author added : ");
        return "addAuthor";
    }

}
