package com.tinder.backend.dao;

import com.tinder.backend.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
public class UserRegistrationDao {

    @PersistenceContext
    public EntityManager em;

    @Transactional
    public User register(User user) {
        em.persist(user);
        return user;
    }

}
