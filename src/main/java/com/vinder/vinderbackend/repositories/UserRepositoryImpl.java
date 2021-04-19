package com.vinder.vinderbackend.repositories;

import com.vinder.vinderbackend.models.user.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

public class UserRepositoryImpl implements UserRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<User> matchedUsersForSpecificUser(Long userId) {
        TypedQuery<User> query = entityManager.createQuery("SELECT * FROM users u INNER JOIN matches m on m.matched_user_id = user.id WHERE m.user_id = " + userId, User.class);
        List<User> results = query.getResultList();
        return results;
    }
};
