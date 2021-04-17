package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.repositories.MatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchesController {

    @Autowired
    MatchesRepository matchesRepository;


}
