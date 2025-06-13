package com.example.APIViernes.services;

import com.example.APIViernes.repositories.IUserrepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private IUserrepository IUserrepository;

    public void IUserrepository(IUserrepository IUserrepository) {
        this.IUserrepository = IUserrepository;
    }

    public User setUser(User user) {
        return IUserrepository.save(user);
    }

    public List<User> obtenerTodosLosUser() {
        return IUserrepository.findAll();
    }

    public List<User> getAllUsers() {
        return null;
    }
}
