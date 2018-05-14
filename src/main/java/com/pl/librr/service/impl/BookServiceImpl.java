package com.pl.librr.service.impl;

import com.pl.librr.dao.BookDAO;
import com.pl.librr.model.Book;
import com.pl.librr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDAO bookDAO;

    public List<Book> getAllBooks() {
        return bookDAO.findAll();
    }

    public Book getBookByName(String name) {
        return bookDAO.getBookByName(name);
    }

    public void addBook(Book book) {
        bookDAO.save(book);
    }

    public void deleteBookById(int id) {
        bookDAO.delete(id);
    }

    public void deleteBookByName(String name) {
        bookDAO.deleteBookByName(name);
    }

    public void updateBook(Book book) {
        bookDAO.updateOneBookById(book.getName(),
                                    book.getContent(),
                                    book.getPage_count(),
                                    book.getIsbn(),
                                    book.getDescription(),
                                    book.getGenre().getId(),
                                    book.getAuthor().getId(),
                                    book.getPublisher().getId(),
                                    book.getImage(),
                                    book.getId());
    }
}
