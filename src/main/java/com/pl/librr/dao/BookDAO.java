package com.pl.librr.dao;

import com.pl.librr.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 02.11.2017.
 */
public interface BookDAO extends JpaRepository<Book,Integer>{

    @Query("from Book b where b.name = :name ")
    Book getBookByName(@Param("name")String name);

    @Query("delete from Book b where b.name = :name")
    @Transactional
    @Modifying
    void deleteBookByName(@Param("name") String name);

    @Query("update Book b set b.name= :name, content = :content , page_count= :page_count, isbn = :isbn, description = :desc, genre_id = :gId, author_id = :aId, publisher_id = :pId, image= :img where id= :id")
    @Transactional
    @Modifying
    void updateOneBookById(@Param("name") String name,
                               @Param("content") byte[] content,
                               @Param("page_count") int page_count,
                               @Param("isbn")String isbn,
                               @Param("desc")String desc,
                               @Param("gId")int gId,
                               @Param("aId")int aId,
                               @Param("pId")int pId,
                               @Param("img")byte[] img,
                               @Param("id")int id);
}
