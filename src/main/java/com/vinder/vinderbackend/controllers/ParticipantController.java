package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipantController {

    @Autowired
    ParticipantRepository participantRepository;

    @GetMapping(value = "/participants")
    public ResponseEntity<Participant> getAllParticipants() {
        return new ResponseEntity(participantRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/participants/{id}")
    public ResponseEntity getAParticipant(@PathVariable Long id) {
        return new ResponseEntity(participantRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/participants")
    public ResponseEntity<Participant> postParticipant(@RequestBody Participant participant) {
        participantRepository.save(participant);
        return new ResponseEntity<>(participant, HttpStatus.CREATED);
    }

    @PutMapping(value = "/participants/{id}")
    public ResponseEntity<Participant> putParticipant(@RequestBody Participant participant, @PathVariable Long id) {
        participantRepository.save(participant);
        return new ResponseEntity<>(participant, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/participants/{id}")
    public ResponseEntity<List<Participant>> deleteParticipant(@PathVariable Long id) {
        participantRepository.deleteById(id);
        return new ResponseEntity<>(participantRepository.findAll(), HttpStatus.OK);
    }
}
