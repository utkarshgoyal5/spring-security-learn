package com.utkarsh.springsecuritylearn.service;

import com.utkarsh.springsecuritylearn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User("abc", "abc", "abc@abc.xyz"));
        this.users.add(new User("def", "def", "def@def.xyz"));
    }

    //get all users
    public List<User> getAllUsers() {
        return this.users;
    }

    //get single user
    public User getUser(String username) {
        return this.users.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    //add new user
    public User addUser(User user) {
        this.users.add(user);
        return user;
    }
}
