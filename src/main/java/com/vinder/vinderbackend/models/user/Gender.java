package com.vinder.vinderbackend.models.user;

public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    NONBINARY("Non-Binary"),
    ALL("All");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getEnumGender() {
        return gender;
    }
}
