package com.example.demo.Service;

import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public List<UserDto> getAllUsers(){
         return this.userRepository.findAll();
    }
    public UserDto getUserById(String id){
        return this.userRepository.findById(id);
    }
    public UserDto createUser(CreateUserDto createUserDto){
        return userRepository.save(createUserDto);
    }

    public UserDto updateUser(CreateUserDto updateUserDto, String id) {
        if(userRepository.findById(id)==null)return null;
        return userRepository.update(updateUserDto,id);
    }
}
