package com.vinder.vinderbackend.models.conversation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.vinder.vinderbackend.models.matches.Match;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "participant_id")
//    private Participant participant;

    @ManyToOne
    private Match match;

    @Column(name = "message")
    private String message;

    public Message() {
    }

    public Message(Participant participant, String message) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
