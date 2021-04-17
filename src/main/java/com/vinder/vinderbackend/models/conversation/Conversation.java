package com.vinder.vinderbackend.models.conversation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "conversations")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "conversation_started")
//    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp timestamp;


    public Conversation() {
    }

    public Conversation(User user) {
        this.user = user;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getLastMessage() {
        return timestamp;
    }

    public void setLastMessage(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
