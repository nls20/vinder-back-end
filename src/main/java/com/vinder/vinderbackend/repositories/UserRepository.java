package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.user.Gender;
import com.vinder.vinderbackend.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    //GET All Users By Gender

    List<User> findByGender(Gender gender);


    List<User> findByMatches();
    
}
