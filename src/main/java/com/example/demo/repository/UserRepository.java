package com.example.demo.repository;

import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<UserDto> users=new ArrayList<>();
    public UserRepository() {
        users.add(new UserDto(1L,"Abhay","abhay@gmail.com"));
        users.add(new UserDto(2L,"Aman","man@gmail.com"));
        users.add(new UserDto(1L,"Abiiy","abiiy@gmail.com"));
    }
    public List<UserDto> findAll(){
        return this.users;
    }
}
