package com.vinder.vinderbackend.models.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.vinder.vinderbackend.models.conversation.Message;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_id")
    private Long matchId;

    @OneToMany
    private List<Message> messages;

//    @ManyToOne
//    @JsonIgnoreProperties({"matches", "matchedWiths"})
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JsonIgnoreProperties({"matches", "matchedWiths"})
//    @JoinColumn(name = "matched_user_id")
//    private User matchedUser;


    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
