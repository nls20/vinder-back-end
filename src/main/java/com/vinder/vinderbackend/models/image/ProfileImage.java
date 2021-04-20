package com.vinder.vinderbackend.models.image;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.vinder.vinderbackend.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "profile_images")
public class ProfileImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "mongo_id")
    private String mongoId;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public ProfileImage() {
    }

    public ProfileImage(String mongoId, User user) {
        this.mongoId = mongoId;
        this.user = user;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
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
}
