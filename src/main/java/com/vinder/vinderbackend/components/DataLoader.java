package com.vinder.vinderbackend.components;

import com.vinder.vinderbackend.models.person.Gender;
import com.vinder.vinderbackend.models.person.User;
import com.vinder.vinderbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User mark = new User("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true, "picture");
        userRepository.save(mark);
    }

}
