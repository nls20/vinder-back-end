package com.vinder.vinderbackend.components;

import com.vinder.vinderbackend.models.person.Gender;
import com.vinder.vinderbackend.models.person.Person;
import com.vinder.vinderbackend.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Person mark = new Person("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true, "picture");
        personRepository.save(mark);
    }

}
