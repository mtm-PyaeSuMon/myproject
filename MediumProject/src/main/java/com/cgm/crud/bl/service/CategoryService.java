package com.cgm.crud.bl.service;

import java.util.List;

import com.cgm.crud.bl.dto.CategoryDto;
import com.cgm.crud.web.form.CategoryForm;

/**
 * <h2> CategoryService Class</h2>
 * <p>
 * Process for Displaying CategoryService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface CategoryService {
	
	/**
	 * <h2> addCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param categoryForm
	 * @return void
	 */
	public void addCategory(CategoryForm categoryForm);
	
	/**
	 * <h2> getAllCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<CategoryDto>
	 */
	public List<CategoryDto> getAllCategory();


}
