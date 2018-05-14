package com.pl.librr.dao;

import com.pl.librr.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



public interface GenreDAO extends JpaRepository<Genre,Integer> {
    @Query("select name from Genre where id=:gID")
    Genre findOneGenreById(@Param("gID")int id);
}
