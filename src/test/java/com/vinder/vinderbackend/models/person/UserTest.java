package com.vinder.vinderbackend.models.person;

import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UserTest {

    User user;

    @Before
    public void before() {
        user = new User("Mark", 33, Gender.MALE, "Glasgow", Gender.FEMALE, "Programming", true, "picture");
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
        assertEquals("Mark", user.getName());
    }

    @Test
    public void setName() {
        user.setName("David");
        assertEquals("David", user.getName());
    }

    @Test
    public void getAge() {
        assertEquals(33, user.getAge());
    }

    @Test
    public void setAge() {
        user.setAge(25);
        assertEquals(25, user.getAge());
    }

    @Test
    public void getGender() {
        assertEquals(Gender.MALE, user.getGender());
    }

    @Test
    public void setGender() {
        user.setGender(Gender.FEMALE);
        assertEquals(Gender.FEMALE, user.getGender());
    }

    @Test
    public void getLocation() {
        assertEquals("Glasgow", user.getLocation());
    }

    @Test
    public void setLocation() {
        user.setLocation("Edinburgh");
        assertEquals("Edinburgh", user.getLocation());
    }

    @Test
    public void getGender_preference() {
        assertEquals(Gender.FEMALE, user.getGender_preference());
    }

    @Test
    public void setGender_preference() {
        user.setGender_preference(Gender.MALE);
        assertEquals(Gender.MALE, user.getGender_preference());
    }

    @Test
    public void getHobbies() {
        assertEquals("Programming", user.getHobbies());
    }

    @Test
    public void setHobbies() {
        user.setHobbies("Football");
        assertEquals("Football", user.getHobbies());
    }

    @Test
    public void getVaccinated() {
        assertEquals(true, user.getVaccinated());
    }

    @Test
    public void setVaccinated() {
        user.setVaccinated(false);
        assertEquals(false, user.getVaccinated());
    }

    @Test
    public void getPictures() {
        assertEquals("picture", user.getPictures());
    }

    @Test
    public void setPictures() {
        user.setPictures("pictures");
        assertEquals("pictures", user.getPictures());
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