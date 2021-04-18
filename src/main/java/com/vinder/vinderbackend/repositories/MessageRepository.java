package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.conversation.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    //TODO: Get all messages for a particular conversation
    // Want: A list of messages
    // Have: conversationID

    List<Message> findByParticipantConversationId(Long id);

}
