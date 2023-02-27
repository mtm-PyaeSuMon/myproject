package com.cgm.crud.bl.dto;

import java.util.Date;

import com.cgm.crud.persistence.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <h2> CategoryDto Class</h2>
 * <p>
 * Process for Displaying CategoryDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class CategoryDto {
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
	 * <h2> Constructor for CategoryDto </h2>
	 * <p>
	 * Constructor for CategoryDto
	 * </p>
	 * @param category
	 */
	public CategoryDto(Category category) {
	        if (category == null) {
	        	category = new Category();
	        	
	        	this.categoryId=category.getCategoryId();
	        	this.categoryName=category.getCategoryName();
	        	this.createdAt=category.getCreatedAt();
	        }
	 }
	}



