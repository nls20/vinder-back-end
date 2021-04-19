package com.vinder.vinderbackend.Service;

import com.vinder.vinderbackend.models.image.FileSystemRepository;
import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.repositories.ProfileImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.awt.*;

//public class FileLocationService {
//
//    @Autowired
//    FileSystemRepository fileSystemRepository;
//
//    @Autowired
//    ProfileImageRepository profileImageRepository;
//
//    public Long save(byte[] bytes, String imageName) throws Exception {
//        String location = fileSystemRepository.save(bytes, imageName);
//
//        return profileImageRepository.save(new ProfileImage(imageName, location))
//                .getId();
//    }
//
//    public FileSystemResource find(Long imageId) {
//        ProfileImage image = profileImageRepository.findById(imageId)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
//
//        return fileSystemRepository.findInFileSystem(image.getLocation());
//    }
//}
