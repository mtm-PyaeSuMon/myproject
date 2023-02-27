package com.cgm.crud.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cgm.crud.persistence.dao.PostDao;
import com.cgm.crud.persistence.entity.Category;
import com.cgm.crud.persistence.entity.Post;

/**
 * <h2> PostDaoImpl Class</h2>
 * <p>
 * Process for Displaying PostDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class PostDaoImpl implements PostDao{
	
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
	 * <h2> addPost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param post
	 */
	@Override
	 public void addPost(Post post) {
		 sessionFactory.getCurrentSession().save(post);
	 }
	 
	 /**
	 * <h2> getAllPost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	 public List<Post> getAllPost(){
		 return hiberneteTemplate.loadAll(Post.class);
	 }
	 
	 /**
	 * <h2> updatePost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param post
	 */
	@Override
	 public void updatePost(Post post) {
		 hiberneteTemplate.update(post);
	 }
	 
	 /**
	 * <h2> deletePost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 */
	@Override
	 public void deletePost(int id) {
		 hiberneteTemplate.delete(hiberneteTemplate.load(Post.class,id));
		 
	 }
	 
	 /**
	 * <h2> getPostById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@Override
	 public Post getPostById(int id) {
		 Post post = hiberneteTemplate.get(Post.class, id);
	        return post;
	 }
	 
	 
	 /**
	 * <h2> findById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	 public Post findById(int id) {
		 String postQuery = "SELECT e FROM Medium e WHERE e.id = :id";
	        Query query = this.sessionFactory.getCurrentSession().createQuery(postQuery);
	        query.setParameter("id", id);
	        Post post = (Post) query.uniqueResult();
	        return post;
	 }
	 
	 /**
	 * <h2> dbGetPostByID </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	 public Post dbGetPostByID(int id) {
	 String postQuery = "SELECT p FROM Post p WHERE u.id = :id";
   	  Query query = this.sessionFactory.getCurrentSession().createQuery(postQuery);
   	  query.setParameter("id", id);
   	  Post post = (Post) query.uniqueResult();
   	  return post;
	 }
	 
	 /**
	 * <h2> detailPost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param post
	 */
	@Override
	 public void detailPost(Post post) {
		 hiberneteTemplate.update(post);
	 }

	/**
	 * <h2> getAllCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<Category> getAllCategory() {
		 return hiberneteTemplate.loadAll(Category.class);
	}

}
