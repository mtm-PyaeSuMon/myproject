package com.scm.test.persistence.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.test.persistence.dao.UserDao;
import com.scm.test.persistence.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);        
    }

    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM User", User.class).list();
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);
        if (user != null) {
            session.delete(user);
        }
    }

    @Override
    public User getUserById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

}
