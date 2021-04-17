package com.vinder.vinderbackend.models.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @Column(name = "hobbies")
    private String hobbies;

    @Column(name = "vaccinated")
    private Boolean vaccinated;

    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<ProfileImage> profileImages;

//    private List<Person> peopleMatched;
//    private List<Person> peopleLiked;

    public User() {
    }

    public User(String name, int age, Gender gender, String location, Gender gender_preference, String hobbies, Boolean vaccinated) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.gender_preference = gender_preference;
        this.hobbies = hobbies;
        this.vaccinated = vaccinated;
        this.profileImages = new ArrayList<>();
//        this.peopleMatched = new ArrayList<>();
//        this.peopleLiked = new ArrayList<>();
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

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
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

    //    public ArrayList<Person> getPeopleMatched() {
//        return peopleMatched;
//    }
//
//    public void setPeopleMatched(ArrayList<Person> peopleMatched) {
//        this.peopleMatched = peopleMatched;
//    }
//
//    public ArrayList<Person> getPeopleLiked() {
//        return peopleLiked;
//    }
//
//    public void setPeopleLiked(ArrayList<Person> peopleLiked) {
//        this.peopleLiked = peopleLiked;
//    }
}
