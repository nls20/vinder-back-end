package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.Service.FileLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("file-system")
public class FileSystemImageController {

    @Autowired
    FileLocationService fileLocationService;

    @PostMapping("/image")
    Long uploadImage(@RequestParam MultipartFile image) throws Exception {
        return fileLocationService.save(image.getBytes(), image.getOriginalFilename());
    }

    @GetMapping(value = "/image/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    FileSystemResource downloadImage(@PathVariable Long imageId) throws Exception {
        return fileLocationService.find(imageId);
    }
}
