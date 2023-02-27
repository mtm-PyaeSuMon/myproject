package com.cgm.crud.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cgm.crud.web.form.CategoryForm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * <h2> Category Class</h2>
 * <p>
 * Process for Displaying Category
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="category")
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * <h2> categoryId</h2>
	 * <p>
	 * categoryId
	 * </p>
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private Integer categoryId;
	
	/**
	 * <h2> categoryName</h2>
	 * <p>
	 * categoryName
	 * </p>
	 */
	@Column(name = "name")
    private String categoryName;
	
	/**
	 * <h2> createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	@Column(name = "created_at")
    private Date createdAt;
	
	/**
	 * <h2> Constructor for Category </h2>
	 * <p>
	 * Constructor for Category
	 * </p>
	 */
	public Category() {
        super();
    }
	
	/**
	 * <h2> Constructor for Category </h2>
	 * <p>
	 * Constructor for Category
	 * </p>
	 * @param categoryForm
	 */
	public Category(CategoryForm categoryForm) {
		this.categoryId=categoryForm.getCategoryId();
		this.categoryName=categoryForm.getCategoryName();
		this.createdAt=categoryForm.getCreatedAt();
	}
  
}
