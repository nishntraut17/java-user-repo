package com.practice.user_repo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class UserRepoController {
    static private List<String> users = null;

    UserRepoController(){
        users = new ArrayList<String>(Arrays.asList("Nishant","Aditya","Rajesh"));
    }

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers(){
        return ResponseEntity.ok(users);
    }

    public ResponseEntity<Object> saveUser(String user){
        users.add(user);
        return ResponseEntity.ok("User added successfully");
    }
}
