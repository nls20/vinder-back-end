package com.vinder.vinderbackend.Service;

import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.FileSystemRepository;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.awt.*;

public class FileLocationService {

    @Autowired
    FileSystemRepository fileSystemRepository;

    @Autowired
    UserRepository userRepository;

    Long save(byte[] bytes, String imageName) throws Exception {
        String location = fileSystemRepository.save(bytes, imageName);

        return userRepository.save(new User(imageName, location))
                .getId();
    }

    FileSystemResource find(Long imageId) {
        User image = userRepository.findById(imageId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return fileSystemRepository.findInFileSystem(image.getLocation());
    }
}
