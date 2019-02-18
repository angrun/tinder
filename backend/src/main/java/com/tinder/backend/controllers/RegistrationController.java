package com.tinder.backend.controllers;


import com.tinder.backend.dao.UserRegistrationDao;
import com.tinder.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    UserRegistrationDao userRegistrationDao;

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userRegistrationDao.register(user);
    }

}
