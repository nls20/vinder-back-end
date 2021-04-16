package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.person.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
