package com.pl.librr.service;


import com.pl.librr.model.User;

import java.util.List;

public interface UserService {

    void deleteUserByID(int id);

    List<User> findAllUsers();

    User findUserByID(int id);

    void saveUser(User user);

    void updateUser(String email,String name,String password,int id);

}
