package com.vinder.vinderbackend.models.person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true, "picture");
    }

//    @Test
//    public void getId() {
//    }
//
//    @Test
//    public void setId() {
//    }

    @Test
    public void getName() {
        assertEquals("Mark", person.getName());
    }

    @Test
    public void setName() {
        person.setName("David");
        assertEquals("David", person.getName());
    }

    @Test
    public void getAge() {
        assertEquals(33, person.getAge());
    }

    @Test
    public void setAge() {
        person.setAge(25);
        assertEquals(25, person.getAge());
    }

    @Test
    public void getGender() {
        assertEquals(Gender.MALE, person.getGender());
    }

    @Test
    public void setGender() {
        person.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, person.getGender());
    }

    @Test
    public void getLocation() {
        assertEquals("Glasgow", person.getLocation());
    }

    @Test
    public void setLocation() {
        person.setLocation("Edinburgh");
        assertEquals("Edinburgh", person.getLocation());
    }

    @Test
    public void getGender_preference() {
        assertEquals(Gender.FEMALE, person.getGender_preference());
    }

    @Test
    public void setGender_preference() {
        person.setGender_preference(Gender.MALE);
        assertEquals(Gender.MALE, person.getGender_preference());
    }

    @Test
    public void getHobbies() {
        assertEquals("Programming", person.getHobbies());
    }

    @Test
    public void setHobbies() {
        person.setHobbies("Football");
        assertEquals("Football", person.getHobbies());
    }

    @Test
    public void getVaccinated() {
        assertEquals(true, person.getVaccinated());
    }

    @Test
    public void setVaccinated() {
        person.setVaccinated(false);
        assertEquals(false, person.getVaccinated());
    }

    @Test
    public void getPictures() {
        assertEquals("picture", person.getPictures());
    }

    @Test
    public void setPictures() {
        person.setPictures("pictures");
        assertEquals("pictures", person.getPictures());
    }

//    @Test
//    public void getPeopleMatched() {
//        assertEquals(0, person.getPeopleMatched().size());
//    }
//
//    @Test
//    public void setPeopleMatched() {
//    }
//
//    @Test
//    public void getPeopleLiked() {
//    }
//
//    @Test
//    public void setPeopleLiked() {
//    }
}