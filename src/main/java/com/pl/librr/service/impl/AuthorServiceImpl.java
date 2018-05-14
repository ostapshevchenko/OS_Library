package com.pl.librr.service.impl;

import com.pl.librr.dao.AuthorDAO;
import com.pl.librr.model.Author;
import com.pl.librr.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorDAO authorDAO;

    public List<Author> findAllAuthors() {
        return authorDAO.findAll();
    }

    public void saveAuthor(Author author) {
        authorDAO.save(author);
    }

    public void deleteAuthorById(Integer id) {
        authorDAO.delete(id);
    }

    public void updateAuthor(Integer id) {

    }
}
