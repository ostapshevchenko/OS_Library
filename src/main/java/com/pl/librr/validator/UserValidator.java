package com.pl.librr.validator;

import com.pl.librr.model.User;
import com.pl.librr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    UserService user;

    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    public void validate(Object target, Errors errors) {
        User u = (User) target;
        if(!u.getEmail().contains("@") || u.getEmail().length()<=5){
            errors.rejectValue("email","error","Bad email address.");
        }
        if(u.getName().length()<=3){
            errors.rejectValue("name","error","Too small name");
        }
        if(u.getPassword().length()<8){
            errors.rejectValue("password","error","Too small password");
        }
        if(!u.getPassword().equals(u.getConfirm_password())){
            errors.rejectValue("confirm_password","error","Passwords didn't match");
        }
    }
}
