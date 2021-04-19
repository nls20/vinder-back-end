package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.conversation.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {

    //TODO: Get all conversations with a particular user
    // Want: A list of Conversations
    // Have: User id

    List<Conversation> findByParticipantsUserId(Long id);

}
