package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.repositories.ProfileImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileImageController {

    @Autowired
    ProfileImageRepository profileImageRepository;

    //GET all pictures
    @GetMapping(value = "/profile_pictures")
    public ResponseEntity<ProfileImage> getProfilePictures() {
        return new ResponseEntity(profileImageRepository.findAll(), HttpStatus.OK);
    }

    //GET by ID
    @GetMapping(value = "/profile_pictures/{id}")
    public ResponseEntity getImageById(@PathVariable Long id) {
        return new ResponseEntity(profileImageRepository.findById(id), HttpStatus.OK);
    }

    //POST image URL
    @PostMapping(value = "/profile_pictures")
    public ResponseEntity<ProfileImage> postProfileImage(@RequestBody ProfileImage profileImage) {
        profileImageRepository.save(profileImage);
        return new ResponseEntity(profileImage, HttpStatus.CREATED);
    }

    //PUT image URL
        //Not required

    //DELETE image URL
    @DeleteMapping(value = "/profile_pictures/{id}")
    public ResponseEntity<List<ProfileImage>> deleteProfileImage(@PathVariable Long id) {
        profileImageRepository.deleteById(id);
        return new ResponseEntity<>(profileImageRepository.findAll(), HttpStatus.OK);
    }
}
