package com.tinder.backend.dao;

import com.tinder.backend.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRegistrationDao {

    @PersistenceContext
    public EntityManager em;

    @Transactional
    public User register(User user) {
        em.persist(user);
        return user;
    }

    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }


}
