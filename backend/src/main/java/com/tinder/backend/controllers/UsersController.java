package com.tinder.backend.controllers;

import com.tinder.backend.dao.UsersDao;
import com.tinder.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersDao usersDao;

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
        return usersDao.getUserById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return usersDao.getAllUsers();
    }

    @GetMapping("/likes")
    public List<User> getUsersWithGreatestLikes() {
        return usersDao.getUsersWithGreatestLikes();
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return usersDao.update(user);
    }

    @DeleteMapping("users/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId) {
        usersDao.delete(userId);
    }

    @DeleteMapping("users")
    public void delete() {
        usersDao.delete();
    }

}
