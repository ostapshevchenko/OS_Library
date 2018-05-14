package com.pl.librr.dao;

import com.pl.librr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface UserDAO extends JpaRepository<User,Integer> {

    @Query("Update User u set u.email=:email, u.name =:name, u.password=:password where id=:id")
    @Transactional
    @Modifying
    void updateUser(@Param("email") String email,
                           @Param("name") String name,
                           @Param("password") String password,
                           @Param("id") int id);

}
