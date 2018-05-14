package com.pl.librr.service;


import com.pl.librr.model.Genre;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GenreService {

    Genre findOneGenreByID(int id);
    List<Genre> findAllGenres();
    void deleteGenreByID(int id);



}
