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

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User currentUser;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User matchedUser;

//    @OneToMany(mappedBy = "matches")
//    @JsonIgnoreProperties({"matches"})
//    private List<User> matches;

    @Column(name = "conversation_history")
    private List<String> conversationHistory;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



//    public List<User> getMatches() {
//        return matches;
//    }
//
//    public void setMatches(List<User> matches) {
//        this.matches = matches;
//    }
}
