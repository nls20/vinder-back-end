package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.ProfileImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.awt.*;
import java.util.List;

@RestController
public class ProfileImageController {

    @Autowired
    ProfileImageRepository profileImageRepository;

    @GetMapping(value = "/profileImage")
    public ResponseEntity<ProfileImage> getAllProfileImages() {
        return new ResponseEntity(profileImageRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/profileImage")
    public ResponseEntity<ProfileImage> postUser(@RequestBody ProfileImage profileImage) {
        profileImageRepository.save(profileImage);
        return new ResponseEntity<>(profileImage, HttpStatus.CREATED);
    }
}