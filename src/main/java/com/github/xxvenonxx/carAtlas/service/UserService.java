package com.github.xxvenonxx.carAtlas.service;

import com.github.xxvenonxx.carAtlas.domain.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    void addUser(User userToAdd);
    List<User> getUsers();

}

