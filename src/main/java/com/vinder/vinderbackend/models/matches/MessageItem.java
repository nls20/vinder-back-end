package com.vinder.vinderbackend.models.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "message_items")
public class MessageItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"matches", "matchedWiths"})
    @JoinColumn(name = "to_user_id")
    private User fromUser;

    @ManyToOne
    @JsonIgnoreProperties({"messages"})
    @JoinColumn(name = "match_id")
    private Match match;

    @Column(name = "message")
    private String message;


    public MessageItem() {
    }

    public MessageItem(User fromUser, Match match, String message) {
        this.fromUser = fromUser;
        this.match = match;
        this.message = message;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
