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

    @Lob
    byte[] content;


    @Column(name = "image_url")
    private String name;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public ProfileImage() {
    }


    public ProfileImage(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
