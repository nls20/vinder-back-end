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


}
