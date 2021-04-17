package com.vinder.vinderbackend.models.conversation;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "participant_id")
    private Participant participant;

    @Column(name = "message")
    private String message;

    @Column(name = "time_sent")
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timeSent;

    public Message() {
    }

    public Message(Participant participant, String message) {
        this.participant = participant;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Participant getSenderID() {
        return participant;
    }

    public void setSenderID(Participant participant) {
        this.participant = participant;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(Timestamp timeSent) {
        this.timeSent = timeSent;
    }
}
