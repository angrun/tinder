package com.tinder.backend.dao;


import com.tinder.backend.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UsersDao {

    @PersistenceContext
    public EntityManager em;


    public List<User> getAllUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    public User getUserById(Long id) {

        TypedQuery<User> query = em.createQuery("select u from User u where u.id = :id", User.class);
        query.setParameter("id", id);
        return query.getResultList().isEmpty() ? null : query.getSingleResult();

    }

    @Transactional
    public User update(User user) {

        em.merge(user);
        return user;
    }

    @Transactional
    public void delete(Long userId) {

        User user = em.find(User.class, userId);

        if (user != null) {
            em.remove(user);
        }
    }


    @Transactional
    public void delete() {

        Query query = em.createQuery("delete from User");
        query.executeUpdate();
    }

    public List<User> getUsersWithGreatestLikes() {

        TypedQuery<User> query = em.createQuery("Select u from User u order by u.likes desc", User.class);
        return query.getResultList();
    }
}
