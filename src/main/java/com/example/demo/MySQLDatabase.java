package com.example.demo;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class MySQLDatabase implements Database {
    @Override
    public void save(String user){
        System.out.println("Database is saving user:"+user);
    }
}
