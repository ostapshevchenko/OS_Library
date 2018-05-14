package com.pl.librr.controller;

import com.pl.librr.model.Author;
import com.pl.librr.model.Book;
import com.pl.librr.model.Genre;
import com.pl.librr.service.AuthorService;
import com.pl.librr.service.BookService;
import com.pl.librr.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    GenreService genreService;

    @Autowired
    AuthorService authorServise;

    // page addBook
    @GetMapping("/os_library/admin/addBook")
    public String addPage(Model model){
        List<Genre> genres = genreService.findAllGenres();
        List<Author> authors = authorServise.findAllAuthors();
        model.addAttribute("book",new Book());
        model.addAttribute("genre",genres);
        model.addAttribute("author",authors);
        return "addBook";
    }
    // add new book action
    @PostMapping("/os_library/admin/allBooks")
    public String addBook(@ModelAttribute("book") Book book, Model model){
        model.addAttribute("books", bookService.getAllBooks());
        bookService.addBook(book);
        return "books";
    }
    // back to all books by click on button "Book List"
    @GetMapping("/os_library/admin/books")
    public String books(Model model){
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }
    // delete book
    @GetMapping("/os_library/admin/allBooks/delete/{name}")
    public String delete(@PathVariable("name")String name){
        bookService.deleteBookByName(name);
        return "redirect:/os_library/admin/books";
    }
    // to edit book page
    @GetMapping("/os_library/admin/allBooks/edit/{name}")
    public String editPage(@PathVariable("name")String name, Model model){
        Book book = bookService.getBookByName(name);
        model.addAttribute("editBook", book);
        List<Genre> genres = genreService.findAllGenres();
        List<Author> authors = authorServise.findAllAuthors();
        model.addAttribute("genre",genres);
        model.addAttribute("author",authors);
        return "editBook";
    }
    // editing book action
    @PostMapping("/os_library/admin/allBooks/edited")
    public String bookEditing(@ModelAttribute("editBook")Book book){
        bookService.updateBook(book);
        return "redirect:/os_library/admin/books";
    }

}
