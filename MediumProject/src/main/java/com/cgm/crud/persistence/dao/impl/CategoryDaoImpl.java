package com.cgm.crud.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cgm.crud.persistence.dao.CategoryDao;
import com.cgm.crud.persistence.entity.Category;

/**
 * <h2> CategoryDaoImpl Class</h2>
 * <p>
 * Process for Displaying CategoryDaoImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Repository
public class CategoryDaoImpl implements CategoryDao{
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
	 * <h2> addCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param category
	 */
	@Override
	 public void addCategory(Category category) {
		 sessionFactory.getCurrentSession().save(category);
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
	 public List<Category> getAllCategory(){
		 return hiberneteTemplate.loadAll(Category.class);
	 }

	/**
	 * <h2> getCategoryNameById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param categoryId
	 * @return
	 */
	@Override
	public String getCategoryNameById(Integer categoryId) {
		Category category = hiberneteTemplate.get(Category.class, categoryId);
        return category.getCategoryName();
	}

}
