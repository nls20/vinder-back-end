package com.vinder.vinderbackend.controllers;

import com.vinder.vinderbackend.models.conversation.Conversation;
import com.vinder.vinderbackend.repositories.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConversationController {

    @Autowired
    ConversationRepository conversationRepository;

    @GetMapping(value = "/conversations")
    public ResponseEntity<Conversation> getAllConversations(
            @RequestParam(required = false, name = "userId") Long userId
    ) {
        //if we have userID ID  |  example: "/conversation?userId=1"
        if (userId != null) {
            return new ResponseEntity(conversationRepository.findByParticipantsUserId(userId), HttpStatus.OK);
        }

        //default: GET all conversations
        return new ResponseEntity(conversationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/conversations/{currentUserId}/{targetUserId}")
    public ResponseEntity getAConversation(@PathVariable Long currentUserId,
                                           @PathVariable Long targetUserId) {
        return new ResponseEntity(conversationRepository.findById(currentUserId), HttpStatus.OK);
    }

    @PostMapping(value = "/conversations")
    public ResponseEntity<Conversation> postConversation(@RequestBody Conversation conversation) {
        conversationRepository.save(conversation);
        return new ResponseEntity<>(conversation, HttpStatus.CREATED);
    }

    @PutMapping(value = "/conversations/{id}")
    public ResponseEntity<Conversation> putConversation(@RequestBody Conversation conversation, @PathVariable Long id) {
        conversationRepository.save(conversation);
        return new ResponseEntity<>(conversation, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/conversations/{id}")
    public ResponseEntity<List<Conversation>> deleteConversation(@PathVariable Long id) {
        conversationRepository.deleteById(id);
        return new ResponseEntity<>(conversationRepository.findAll(), HttpStatus.OK);
    }
}
