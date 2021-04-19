package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.MatchRepository;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/{id}/all-matches")
    public ResponseEntity<List<User>> getAllMatches(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findByMatches(), HttpStatus.OK);
    }

}
