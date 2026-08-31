package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import com.example.demo.dto.CreateUserDto;
import com.example.demo.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
     private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserDto> getAllUsers(){
        return this.userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
    }
    @PostMapping()
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto createUserDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(createUserDto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@RequestBody CreateUserDto updateUserDto,@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body((userService.updateUser(updateUserDto,id)));
    }
    @DeleteMapping({"/id"})
    public ResponseEntity<UserDto> DeleteUser(@RequestBody CreateUserDto DeleteUserDto,@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body((userService.deleteUser(DeleteUserDto,id)));
    }

}
