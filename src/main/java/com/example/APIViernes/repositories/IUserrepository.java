package com.example.APIViernes.repositories;

import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface IUserrepository {

    User save(User user);

    List<User> findAll();
}
