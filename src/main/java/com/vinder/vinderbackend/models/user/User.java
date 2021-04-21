package com.vinder.vinderbackend.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vinder.vinderbackend.models.conversation.Conversation;
import com.vinder.vinderbackend.models.conversation.Participant;
import com.vinder.vinderbackend.models.image.ProfileImage;
import com.vinder.vinderbackend.models.matches.Match;
import com.vinder.vinderbackend.models.matches.MessageItem;
import org.hibernate.annotations.Cascade;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<ProfileImage> profileImages;



    @OneToMany(mappedBy = "matchedUser")
    @JsonIgnoreProperties({"matchedUser"})
    private List<Match> matches;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties({"user"})
    private List<Match> matchedWiths;


    @OneToMany(mappedBy = "fromUser")
    @JsonIgnoreProperties({"fromUser", "toUser"})
    private List<MessageItem> fromMessages;

    @OneToMany(mappedBy = "toUser")
    @JsonIgnoreProperties({"toUser", "fromUser"})
    private List<MessageItem> toMessages;



    @OneToMany(mappedBy = "currentUser")
    private List<User> peopleWhoLikedThisUser;

    @ManyToOne
    private User currentUser;


    //---------------image--------------------
//    @Column(name= "userImage")
//     private String userImage;

    //-----------------------------------

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Conversation> conversations;

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonIgnore
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
        this.matches = new ArrayList<>();
        this.matchedWiths = new ArrayList<>();
        this.peopleWhoLikedThisUser = new ArrayList<>();
        this.conversations = new ArrayList<>();
        this.fromMessages = new ArrayList<>();
        this.toMessages = new ArrayList<>();
    }
    //------------------------------------------

//    public String getUserImage() {
//        return userImage;
//    }
//
//    public void setUserImage(String userImage) {
//        this.userImage = userImage;
//    }

    //---------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MessageItem> getFromMessages() {
        return fromMessages;
    }

    public void setFromMessages(List<MessageItem> fromMessages) {
        this.fromMessages = fromMessages;
    }

    public List<MessageItem> getToMessages() {
        return toMessages;
    }

    public void setToMessages(List<MessageItem> toMessages) {
        this.toMessages = toMessages;
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

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public List<User> getPeopleWhoLikedThisUser() {
        return peopleWhoLikedThisUser;
    }

    public void setPeopleWhoLikedThisUser(List<User> peopleWhoLikedThisUser) {
        this.peopleWhoLikedThisUser = peopleWhoLikedThisUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

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

    public List<Match> getMatchedWiths() {
        return matchedWiths;
    }

    public void setMatchedWiths(List<Match> matchedWiths) {
        this.matchedWiths = matchedWiths;
    }
}
