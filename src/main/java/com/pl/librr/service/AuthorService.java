package com.pl.librr.service;


import com.pl.librr.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAllAuthors();

    void saveAuthor(Author author);

    void deleteAuthorById(Integer id);

    void updateAuthor(Integer id);
}
