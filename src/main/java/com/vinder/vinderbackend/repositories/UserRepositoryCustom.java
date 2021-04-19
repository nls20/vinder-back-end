package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.user.User;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> matchedUsersForSpecificUser(Long userId);
}
