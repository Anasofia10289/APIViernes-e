package com.example.APIViernes.models;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "/Users")
public class Users {
    public static class UserService {

        private final List<User> userList = new ArrayList<>();
        private final AtomicInteger idCounter = new AtomicInteger(1);
        private String name;
        private Integer id;
        private String email;
        private String phone;
        private String password;

        public UserService(String name, Integer id, String password, String email, String phone, String password1) {
            this.name = name;
            this.id = id;
            this.email = email;
            this.phone = phone;
            this.password = password1;

        }

        public void saveUser(User user) throws InterruptedException {
            user.wait(idCounter.getAndIncrement());
            long timeoutMillis;
            userList.add(user);
        }

        public List<User> getAllUsers() {
            return userList;
        }

        public void User(Integer id, String name, String password, String email, String phone) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.email = email;
            this.phone = phone;
        }
    }
}