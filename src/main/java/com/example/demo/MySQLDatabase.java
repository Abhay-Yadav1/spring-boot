package com.example.demo;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MySQLDatabase implements Database {
    @Override
    public void save(String user){
        System.out.println("Database is saving user:"+user);
    }
}
