package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.conversation.Message;
import com.vinder.vinderbackend.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    MessageRepository messageRepository;

    @GetMapping(value = "/messages")
    public ResponseEntity<Message> getAllMessages() {
        return new ResponseEntity(messageRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/messages/{id}")
    public ResponseEntity getAMessage(@PathVariable Long id) {
        return new ResponseEntity(messageRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/messages")
    public ResponseEntity<Message> postMessage(@RequestBody Message message) {
        messageRepository.save(message);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping(value = "/messages/{id}")
    public ResponseEntity<Message> putMessage(@RequestBody Message message, @PathVariable Long id) {
        messageRepository.save(message);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/messages/{id}")
    public ResponseEntity<List<Message>> deleteMessage(@PathVariable Long id) {
        messageRepository.deleteById(id);
        return new ResponseEntity<>(messageRepository.findAll(), HttpStatus.OK);
    }

}
