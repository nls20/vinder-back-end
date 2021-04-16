package com.vinder.vinderbackend.models.person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", Boolean.TRUE, "picture");
    }

    @Test
    public void setId() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getGender() {
    }

    @Test
    public void setGender() {
    }

    @Test
    public void getLocation() {
    }

    @Test
    public void setLocation() {
    }

    @Test
    public void getGender_preference() {
    }

    @Test
    public void setGender_preference() {
    }

    @Test
    public void getHobbies() {
    }

    @Test
    public void setHobbies() {
    }

    @Test
    public void getVaccinated() {
    }

    @Test
    public void setVaccinated() {
    }

    @Test
    public void getPictures() {
    }

    @Test
    public void setPictures() {
    }
}