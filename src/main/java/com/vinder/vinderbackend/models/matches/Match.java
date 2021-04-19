package com.vinder.vinderbackend.models.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JoinColumn(name = "current_user_id", nullable = false)
    @JsonIgnoreProperties({"matches"})
    private User currentUser;

    @ManyToOne
    @JoinColumn(name = "target_user_id", nullable = false)
    @JsonIgnoreProperties({"matches"})
    private User matchedUser;

    @OneToMany
    private List<MessageHistory> messages;

    public Match(User currentUser, User matchedUser) {
        this.currentUser = currentUser;
        this.matchedUser = matchedUser;
        messages = new ArrayList<>();
    }

    public Match() {
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getMatchedUser() {
        return matchedUser;
    }

    public void setMatchedUser(User matchedUser) {
        this.matchedUser = matchedUser;
    }

    public List<String> getConversationHistory() {
        return conversationHistory;
    }

    public void setConversationHistory(List<String> conversationHistory) {
        this.conversationHistory = conversationHistory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
