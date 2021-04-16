package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
