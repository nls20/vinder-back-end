package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.conversation.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
