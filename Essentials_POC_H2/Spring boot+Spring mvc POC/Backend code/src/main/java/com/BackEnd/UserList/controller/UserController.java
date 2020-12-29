package com.BackEnd.UserList.controller;

import com.BackEnd.UserList.model.User;
import com.BackEnd.UserList.service.UserSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserSercvice userSercvice;

    @GetMapping("user")
    @CrossOrigin("http://localhost:8080")
    public List<User> getUsers(){
        return userSercvice.getUsers();
    }

    @GetMapping("user/{id}")
    @CrossOrigin("http://localhost:8080")
    public User getUserByID(@PathVariable Long id){
        return userSercvice.getByID(id);
    }

    @PostMapping("user")
    @CrossOrigin("http://localhost:8080")
    public User addUser(@Valid @RequestBody User user){
        return userSercvice.addUser(user);
    }

    @PutMapping("user/{id}")
    @CrossOrigin("http://localhost:8080")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return userSercvice.updateUser(id, user);
    }

    @DeleteMapping("user/{id}")
    @CrossOrigin("http://localhost:8080")
    public User deleteUser(@PathVariable Long id){
        return userSercvice.deleteUser(id);
    }

}
