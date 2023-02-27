package com.cgm.crud.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cgm.crud.persistence.dao.UserDao;
import com.cgm.crud.persistence.entity.User;

/**
 * <h2> UserDaoImpl Class</h2>
 * <p>
 * Process for Displaying UserDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class UserDaoImpl implements UserDao{
		/**
		 * <h2> hiberneteTemplate</h2>
		 * <p>
		 * hiberneteTemplate
		 * </p>
		 */
		@Autowired
		private HibernateTemplate hiberneteTemplate;
	
		/**
		 * <h2> sessionFactory</h2>
		 * <p>
		 * sessionFactory
		 * </p>
		 */
		@Autowired
	    private SessionFactory sessionFactory;
		
	 /**
	 * <h2> addUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param user
	 */
	@Override
	 public void addUser(User user) {
		 sessionFactory.getCurrentSession().save(user);
	 }
	 
	 /**
	 * <h2> getAllUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	 public List<User> getAllUser(){
		 return hiberneteTemplate.loadAll(User.class);
	 }
	 
	 /**
	 * <h2> findByEmail </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param email
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	    public User findByEmail(String email) {
	        String userQuery = "SELECT e FROM Medium e WHERE e.email = :email";
	        Query query = this.sessionFactory.getCurrentSession().createQuery(userQuery);
	        query.setParameter("email", email);
	        User user = (User) query.uniqueResult();
	        return user;
	    }
	 
	 /**
	 * <h2> dbGetUserByEmail </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param email
	 * @return
	 */
	@SuppressWarnings("rawtypes")
		public User dbGetUserByEmail(String email) { 	
	    	String cusQuery = "SELECT u FROM User u WHERE u.email = :email";
	    	  Query query = this.sessionFactory.getCurrentSession().createQuery(cusQuery);
	    	  query.setParameter("email", email);
	    	  User user = (User) query.uniqueResult();
	    	  return user;
	    }
	 
	 /**
	 * <h2> updateUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param user
	 */
	@Override
	 public void updateUser(User user) {
		 hiberneteTemplate.update(user);
	 }
	 
	 /**
	 * <h2> deleteUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 */
	@Override
	 public void deleteUser(int id) {
		 hiberneteTemplate.delete(hiberneteTemplate.load(User.class,id));
	 }

	 /**
	 * <h2> getUserById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@Override
	 public User getUserById(int id) {
		 User user = hiberneteTemplate.get(User.class, id);
	        return user;
	 }
	 
	 /**
	 * <h2> detailUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param user
	 */
	@Override
	 public void detailUser(User user) {
		 hiberneteTemplate.update(user);
	 }
}
