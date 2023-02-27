package com.cgm.crud.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cgm.crud.web.form.PostForm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * <h2> Post Class</h2>
 * <p>
 * Process for Displaying Post
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="post")
public class Post implements Serializable{
	/**
	 * <h2> serialVersionUID</h2>
	 * <p>
	 * serialVersionUID
	 * </p>
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <h2> id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
	
	/**
	 * <h2> title</h2>
	 * <p>
	 * title
	 * </p>
	 */
	@Column(name = "title")
    private String title;
	
	/**
	 * <h2> description</h2>
	 * <p>
	 * description
	 * </p>
	 */
	@Column(name = "description")
    private String description;
	
	/**
	 * <h2> photo</h2>
	 * <p>
	 * photo
	 * </p>
	 */
	@Column(name = "photo")
    private String photo;
	
	/**
	 * <h2> categoryId</h2>
	 * <p>
	 * categoryId
	 * </p>
	 */
	@Column(name="categoryId")
	private Integer categoryId;
	
	/**
	 * <h2> createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	@Column(name = "created_at")
    private Date createdAt;
	
	/**
	 * <h2> updatedAt</h2>
	 * <p>
	 * updatedAt
	 * </p>
	 */
	@Column(name = "updated_at")
    private Date updatedAt;
	
	/**
	 * <h2> delflag</h2>
	 * <p>
	 * delflag
	 * </p>
	 */
	@Column(name="del_flag")
    private Boolean delflag;
	
	/**
	 * <h2> Constructor for Post </h2>
	 * <p>
	 * Constructor for Post
	 * </p>
	 */
	public Post() {
        super();
    }
	
	/**
	 * <h2> Constructor for Post </h2>
	 * <p>
	 * Constructor for Post
	 * </p>
	 * @param postForm
	 */
	public Post(PostForm postForm) {
		this.id=postForm.getId();
		this.title=postForm.getTitle();
		this.description=postForm.getDescription();
		this.photo=postForm.getPhoto();
		this.categoryId=postForm.getCategoryId();
		this.createdAt=postForm.getCreatedAt();
		this.updatedAt=postForm.getUpdatedAt();
		this.delflag=postForm.getDelflag();
	}

}
