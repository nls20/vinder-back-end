package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<User> matchedUsersForSpecificUser(Long userId) {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM Match m INNER JOIN m.matchedUser u WHERE u.id="+userId, User.class);
        List<User> results = query.getResultList();
        return results;
    }
};
