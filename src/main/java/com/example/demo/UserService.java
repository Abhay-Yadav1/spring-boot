package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    Database database;
    public UserService(Database database){
        this.database=database;
    }
    public void saveUser(String user){
        System.out.println("User Service is saving");
        database.save(user);
    }
}
