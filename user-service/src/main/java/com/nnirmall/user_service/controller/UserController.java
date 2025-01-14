package com.nnirmall.user_service.controller;

import com.nnirmall.user_service.entity.User;
import com.nnirmall.user_service.repository.UserRepository;
import com.nnirmall.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/api/users")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        User addUser = userService.createUser(user);
        return ResponseEntity.ok(addUser);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Integer id){
        User updateUser = userService.updateUser(user, id);
        if(updateUser != null)
            return ResponseEntity.ok(updateUser);
        else
            return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        User user = userService.getUserById(id);
        if(user != null)
            return ResponseEntity.ok(user);
        else
            return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List <User>> getAllUser(){
        List<User> userlist = userService.getAllUser();
        return ResponseEntity.ok(userlist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Integer id){
        Boolean isDeleted = userService.deleteUser(id);
        if(isDeleted)
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.notFound().build();
    }


}
