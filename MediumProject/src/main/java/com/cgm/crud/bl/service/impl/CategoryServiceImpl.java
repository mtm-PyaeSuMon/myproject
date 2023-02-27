package com.cgm.crud.bl.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgm.crud.bl.dto.CategoryDto;
import com.cgm.crud.bl.service.CategoryService;
import com.cgm.crud.persistence.dao.CategoryDao;
import com.cgm.crud.persistence.entity.Category;
import com.cgm.crud.web.form.CategoryForm;

/**
 * <h2> CategoryServiceImpl Class</h2>
 * <p>
 * Process for Displaying CategoryServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class CategoryServiceImpl implements CategoryService{
	
	 /**
	 * <h2> categoryDao</h2>
	 * <p>
	 * categoryDao
	 * </p>
	 */
	@Autowired
	 private CategoryDao categoryDao;
	
	/**
	 * <h2> addCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param categoryForm
	 */
	@Override
	public void addCategory(CategoryForm categoryForm) {
		Category category=new Category();
		category.setCategoryName(categoryForm.getCategoryName());
		category.setCreatedAt(categoryForm.getCreatedAt());
		categoryDao.addCategory(category);
	}
	
	/**
	 * <h2> getAllCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	/**
	 * <h2> getAllCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<CategoryDto> getAllCategory(){
		List<Category> allCategory = categoryDao.getAllCategory();
		 
		 List<CategoryDto> category = new ArrayList<CategoryDto>();
		 for (Category cat : allCategory) {
			 CategoryDto categoryDto = new CategoryDto(cat);
			 categoryDto.setCategoryId(cat.getCategoryId());
			 categoryDto.setCategoryName(cat.getCategoryName());
			 categoryDto.setCreatedAt(cat.getCreatedAt());
			 category.add(categoryDto);
		 }
		return category;
		
	}

}
