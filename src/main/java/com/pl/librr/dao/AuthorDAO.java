package com.pl.librr.dao;

import com.pl.librr.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorDAO extends JpaRepository<Author,Integer>{
}
