package com.User.CRUDuser.controller;

import com.User.CRUDuser.Entity.User;
import com.User.CRUDuser.Service.userService;
import com.User.CRUDuser.UserRepository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controllerUser {
 @Autowired
    private userService userservice ;

 // ADD
    @PostMapping("/add")
    public User Add(@RequestBody User user){
        return userservice.createUser(user);
    }
    // getAll
    @GetMapping("/users")
    public List<User> GetAllUsers(){
        return userservice.getusers();
    }
    // getUserById
    @GetMapping("/user/{id}")
    public User GetUserById(@PathVariable int id){
        return userservice.getUserById(id);
    }
    // update
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id , @RequestBody User user){
        return  userservice.updateuser(id,user);
    }
    // delete
    @DeleteMapping("/delete/{id}")
    public boolean DeleteUserById(@PathVariable int id){
        return  userservice.deleteuser(id);
    }





}
