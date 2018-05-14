package com.pl.librr.service.impl;

import com.pl.librr.dao.GenreDAO;
import com.pl.librr.model.Genre;
import com.pl.librr.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GenreServiceImpl implements GenreService{
    @Autowired
    GenreDAO genreDAO;

    public Genre findOneGenreByID(int id) {
        return genreDAO.findOne(id);
    }

    public List<Genre> findAllGenres() {
        return genreDAO.findAll();
    }

    public void deleteGenreByID(int id) {
        genreDAO.delete(id);
    }
}
