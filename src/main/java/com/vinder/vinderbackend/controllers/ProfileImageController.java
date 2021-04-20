package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.image.ProfileImage;
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

    @PostMapping
    Long uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
        ProfileImage dbImage = new ProfileImage();
        dbImage.setName(multipartImage.getName());
        dbImage.setContent(multipartImage.getBytes());

        return profileImageRepository.save(dbImage)
                .getId();
    }

    @GetMapping(value = "/profileImagea/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    Resource downloadImage(@PathVariable Long imageId) {
        byte[] image = profileImageRepository.findById(imageId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND))
                .getContent();

        return new ByteArrayResource(image);
    }
}