package com.pl.librr.service;


import com.pl.librr.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookByName(String name);

    void addBook(Book book);

    void deleteBookById(int id);

    void deleteBookByName(String name);

    void updateBook(Book book);

}
