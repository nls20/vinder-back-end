package com.vinder.vinderbackend.models.user;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vinder.vinderbackend.models.conversation.Conversation;
import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.models.image.ProfileImage;
import org.hibernate.annotations.Cascade;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private Gender gender;

    @Column(name = "location")
    private String location;

    @Column(name = "gender_preference")
    private Gender gender_preference;

    @Column(name = "bio")
    private String bio;

    @Column(name = "vaccinated")
    private Boolean vaccinated;

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<ProfileImage> profileImages;

//    private List<User> peopleMatched;
//    private List<User> peopleLiked;

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Conversation> conversations;

    //This is for a list of participants in chat with??
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Participant> participants;

    public User() {
    }

    public User(String name, int age, Gender gender, String location, Gender gender_preference, String bio, Boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.gender_preference = gender_preference;
        this.bio = bio;
        this.vaccinated = vaccinated;
        this.profileImages = new ArrayList<>();
//        this.peopleMatched = new ArrayList<>();
//        this.peopleLiked = new ArrayList<>();
        this.conversations = new ArrayList<>();
        this.conversations = new ArrayList<>();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Gender getGender_preference() {
        return gender_preference;
    }

    public void setGender_preference(Gender gender_preference) {
        this.gender_preference = gender_preference;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public List<ProfileImage> getProfileImages() {
        return profileImages;
    }

    public void setProfileImages(List<ProfileImage> profileImages) {
        this.profileImages = profileImages;
    }

//    public List<User> getPeopleMatched() {
//        return peopleMatched;
//    }
//
//    public void setPeopleMatched(List<User> peopleMatched) {
//        this.peopleMatched = peopleMatched;
//    }
//
//    public List<User> getPeopleLiked() {
//        return peopleLiked;
//    }
//
//    public void setPeopleLiked(List<User> peopleLiked) {
//        this.peopleLiked = peopleLiked;
//    }


    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
