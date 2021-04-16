package com.vinder.vinderbackend.models.person;

import java.util.ArrayList;

public class Person {

    private Long Id;
    private String name;
    private int age;
    private Gender gender;
    private String location;
    private Gender gender_preference;
    private String hobbies;
    private Boolean vaccinated;
    private String pictures;   // Added as String for now
    private ArrayList<Person> peopleMatched;
    private ArrayList<Person> peopleLiked;

//    public Person() {
//    }

    public Person(String name, int age, Gender gender, String location, Gender gender_preference, String hobbies, Boolean vaccinated, String pictures) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.gender_preference = gender_preference;
        this.hobbies = hobbies;
        this.vaccinated = vaccinated;
        this.pictures = pictures;
        this.peopleMatched = new ArrayList<>();
        this.peopleLiked = new ArrayList<>();
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

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public ArrayList<Person> getPeopleMatched() {
        return peopleMatched;
    }

    public void setPeopleMatched(ArrayList<Person> peopleMatched) {
        this.peopleMatched = peopleMatched;
    }

    public ArrayList<Person> getPeopleLiked() {
        return peopleLiked;
    }

    public void setPeopleLiked(ArrayList<Person> peopleLiked) {
        this.peopleLiked = peopleLiked;
    }
}
