package com.vinder.vinderbackend.models.conversation;

import javax.persistence.*;
import java.sql.Timestamp;

public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sender_id")
    private int senderID;

    @Column(name = "message")
    private String message;

    @Column(name = "time_sent")
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timeSent;

    public Message() {
    }

    public Message(int senderID, String message) {
        this.senderID = senderID;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
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
