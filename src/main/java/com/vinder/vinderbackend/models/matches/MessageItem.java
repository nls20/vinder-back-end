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
    @JsonIgnoreProperties({"messages"})
    @JoinColumn(name = "match_id")
    private Match match;

//    @ManyToOne
//    @JsonIgnoreProperties({"fromMessages", "toMessages"})
//    @JoinColumn(name = "from_user_id")
//    private Match toUser;

    @OneToOne
    @JoinColumn(name = "id")
    private User sender;


    @Column(name = "message")
    private String message;


    public MessageItem() {
    }

    public MessageItem(Match match, User sender, String message) {
        this.match = match;
        this.sender = sender;
        this.message = message;
    }

    //    public MessageItem(Match fromUser, String message) {
//        this.fromUser = fromUser;
//        this.message = message;
//    }


    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
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
