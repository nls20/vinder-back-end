package com.vinder.vinderbackend.components;

import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import com.vinder.vinderbackend.repositories.ProfileImageRepository;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProfileImageRepository profileImageRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User mark = new User("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true);
        userRepository.save(mark);

        User david = new User("David", 24, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true);
        userRepository.save(david);

        User natalie = new User("Natalie", 30, Gender.FEMALE, "Glasgow", Gender.MALE, "Programming", true);
        userRepository.save(natalie);

        ProfileImage picture1 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture1);

        ProfileImage picture2 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture2);

        ProfileImage picture3 = new ProfileImage("image1.png", mark);
        profileImageRepository.save(picture3);


    }

}
