package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(int id) {
        return "User With Id: " + id;
    }

    public void createUser(String name){
        System.out.println("Creating User: " + name);
    }
}
