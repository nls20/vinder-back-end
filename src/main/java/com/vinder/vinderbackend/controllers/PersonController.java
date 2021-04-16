package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.person.Person;
import com.vinder.vinderbackend.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

//    @GetMapping(value = "/person")
//    public ResponseEntity getAPerson;

    @GetMapping(value = "/person/{id}")
    public ResponseEntity getAPerson(@PathVariable Long id) {
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }
}
