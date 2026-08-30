package com.example.demo.repository;

import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class UserRepository {
    List<UserDto> users=new ArrayList<>();
    public UserRepository() {
        users.add(new UserDto(UUID.randomUUID().toString(),"Rishi","abhay@gmail.com"));
        users.add(new UserDto(UUID.randomUUID().toString(),"Aman","man@gmail.com"));
        users.add(new UserDto(UUID.randomUUID().toString(),"Abiyansh","abiiy@gmail.com"));
    }
    public List<UserDto> findAll(){
        return this.users;
    }
    public UserDto findById(String id){
        for(UserDto user:users){
            if(Objects.equals(user.getId(),id)){
                return user;
            }
        }
        return null;
    }
    public UserDto save(CreateUserDto createUserDto){
        UserDto user=new UserDto(UUID.randomUUID().toString(),createUserDto.getName(),createUserDto.getEmail());
        users.add(user);
        return user;
    }

    public UserDto update(CreateUserDto updateUserDto, String id) {
        for(UserDto user:users){
            if (user.getId().equals(id)){
                user.setEmail(updateUserDto.getEmail());
                user.setName(updateUserDto.getName());
            }
            return user;
        }
        return null;

    }
}
