package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.matches.MessageItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageItemRepository extends JpaRepository<MessageItem, Long> {
}
