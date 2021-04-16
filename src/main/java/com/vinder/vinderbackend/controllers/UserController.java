package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @GetMapping(value = "/user")
//    public ResponseEntity getAUser;

    @GetMapping(value = "/user/{id}")
    public ResponseEntity getAUser(@PathVariable Long id) {
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }
}
