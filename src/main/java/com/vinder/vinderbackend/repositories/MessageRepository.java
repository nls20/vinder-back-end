package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.conversation.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
