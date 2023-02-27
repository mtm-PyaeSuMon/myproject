package com.cgm.crud.persistence.dao;

import java.util.List;

import com.cgm.crud.persistence.entity.Category;

/**
 * <h2> CategoryDao Class</h2>
 * <p>
 * Process for Displaying CategoryDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface CategoryDao {
	 /**
	 * <h2> addCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param category
	 * @return void
	 */
	public void addCategory(Category category);
	 
	 /**
	 * <h2> getAllCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<Category>
	 */
	public List<Category> getAllCategory();
	 
	 /**
	 * <h2> getCategoryNameById</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param categoryId
	 * @return
	 * @return String
	 */
	public String getCategoryNameById(Integer categoryId);

}
