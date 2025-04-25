package com.practice.user_repo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class UserRepoController {

    public ResponseEntity<Object> getUsers(){
        List<String> users = new ArrayList<String>(Arrays.asList("Nishant","Aditya","Rajesh"));
        return ResponseEntity.ok(users);
    }
}
