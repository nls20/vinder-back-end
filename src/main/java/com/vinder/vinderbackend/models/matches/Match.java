package com.vinder.vinderbackend.models.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.vinder.vinderbackend.models.conversation.Message;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"matches", "matchedWiths"})
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JsonIgnoreProperties({"matches", "matchedWiths"})
    @JoinColumn(name = "matched_user_id")
    private User matchedUser;

    @OneToMany(mappedBy = "match")
    @JsonIgnoreProperties({"match"})
    private List<MessageItem> messages;

//    @OneToMany(mappedBy = "toUser")
//    @JsonIgnoreProperties({"toUser", "fromUser"})
//    private List<MessageItem> toMessages;

//    @OneToMany
//    private List<MessageItem> messages;

    public Match(User user, User matchedUser) {
        this.user = user;
        this.matchedUser = matchedUser;
        this.messages = new ArrayList<>();
//        this.toMessages = new ArrayList<>();
    }

    public Match() {
    }

    public List<MessageItem> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageItem> messages) {
        this.messages = messages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getMatchedUser() {
        return matchedUser;
    }

    public void setMatchedUser(User matchedUser) {
        this.matchedUser = matchedUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
