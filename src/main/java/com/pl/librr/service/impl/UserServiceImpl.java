package com.pl.librr.service.impl;

import com.pl.librr.dao.UserDAO;
import com.pl.librr.model.User;
import com.pl.librr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDAO userDAO;

    public void deleteUserByID(int id) {
        userDAO.delete(id);
    }

    public List<User> findAllUsers() {
        return userDAO.findAll();
    }

    public User findUserByID(int id) {
        return userDAO.findOne(id);
    }

    public void saveUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(String email, String name, String password, int id) {
        userDAO.updateUser(email,name,password,id);
    }
}
