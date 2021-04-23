package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.MatchRepository;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MatchRepository matchRepository;

    /**
     * GET /users
     * GET /users?gender=MALE
     */

    @GetMapping(value = "/users")
    public ResponseEntity<User> getAUser(
            @RequestParam(required = false, name = "gender") Gender gender
    ) {
        //returns all users by gender
        if (gender != null) {
            List<User> allOfGender = userRepository.findByGender(gender);
            return new ResponseEntity(allOfGender, HttpStatus.OK);
        }

        //returns all users
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getAUser(@PathVariable Long id) {
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}/matches")
    public ResponseEntity<List<Match>> getAllUserMatches(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);

        List<Match> matches = new ArrayList<>();

        for (int i = 0; i < user.get().getMatches().size(); i++) {
            matches.add(user.get().getMatches().get(i));
        }

        for (int i = 0; i < user.get().getMatchedWiths().size(); i++) {
            matches.add(user.get().getMatchedWiths().get(i));
        }

        return new ResponseEntity<>(matches, HttpStatus.OK);
    }

    @GetMapping(value = "/users/{userId}/{targetId}")
    public void addNewMatch(@PathVariable Long userId, @PathVariable Long targetId) {

        List<User> users = userRepository.findAll();
        User currentUser = new User();
        User targetUser = new User();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)) {
                currentUser = users.get(i);
            }
        }

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(targetId)) {
                targetUser = users.get(i);
            }
        }

        Match newMatch = new Match(currentUser, targetUser);
        matchRepository.save(newMatch);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }


    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> putUser(@RequestBody User user, @PathVariable Long id) {
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<List<User>> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
