package com.vinder.vinderbackend.models.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;

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

    public Match(User user, User matchedUser) {
        this.user = user;
        this.matchedUser = matchedUser;
    }

    public Match() {
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
