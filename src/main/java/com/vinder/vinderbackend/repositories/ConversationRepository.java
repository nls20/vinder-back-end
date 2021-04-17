package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.conversation.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
