package com.vinder.vinderbackend.models.conversation;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vinder.vinderbackend.models.user.User;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "conversations")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    // Conversation started by user:
//    @ManyToOne
//    @JsonBackReference
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    //Participant(s) in the conversation:
//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
//    @JsonManagedReference
//    @OneToMany(mappedBy = "conversation")
//    private List<Participant> participants;
//
//    @Column(name = "conversation_started")
//    private Timestamp timestamp;
//
//
//    public Conversation() {
//    }
//
//    public Conversation(User user) {
//        this.user = user;
//        this.participants = new ArrayList<>();
//        this.timestamp = new Timestamp(System.currentTimeMillis());
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public List<Participant> getParticipants() {
//        return participants;
//    }
//
//    public void setParticipants(List<Participant> participants) {
//        this.participants = participants;
//    }
//
//    public Timestamp getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(Timestamp timestamp) {
//        this.timestamp = timestamp;
//    }
}
