package com.cgm.crud.web.form;

import java.util.Date;

import com.cgm.crud.persistence.entity.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <h2> CategoryForm Class</h2>
 * <p>
 * Process for Displaying CategoryForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryForm {
	/**
	 * <h2> categoryId</h2>
	 * <p>
	 * categoryId
	 * </p>
	 */
	private Integer categoryId;
	/**
	 * <h2> categoryName</h2>
	 * <p>
	 * categoryName
	 * </p>
	 */
	private String categoryName;
	 /**
	 * <h2> createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	private Date createdAt;
	
	 /**
	 * <h2> Constructor for CategoryForm </h2>
	 * <p>
	 * Constructor for CategoryForm
	 * </p>
	 * @param category
	 */
	public CategoryForm(Category category) {
		 this.categoryId=category.getCategoryId();
		 this.categoryName=category.getCategoryName();
		 this.createdAt=category.getCreatedAt();
	 }
}
