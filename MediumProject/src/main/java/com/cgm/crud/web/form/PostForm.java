package com.cgm.crud.web.form;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.cgm.crud.persistence.entity.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <h2> PostForm Class</h2>
 * <p>
 * Process for Displaying PostForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class PostForm {
	/**
	 * <h2> id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * <h2> title</h2>
	 * <p>
	 * title
	 * </p>
	 */
	@NotEmpty(message = "title cannot be empty")
	 private String title;
	/**
	 * <h2> categoryId</h2>
	 * <p>
	 * categoryId
	 * </p>
	 */
	@NotNull(message = "category cannot be empty")
	 private Integer categoryId;
	/**
	 * <h2> description</h2>
	 * <p>
	 * description
	 * </p>
	 */
	@NotEmpty(message = "description cannot be empty")
	 private String description;
	/**
	 * <h2> photo</h2>
	 * <p>
	 * photo
	 * </p>
	 */
	@NotEmpty(message = "Choose your image file")
	 private String photo;
	 /**
	 * <h2> createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	private Date createdAt;
	 /**
	 * <h2> updatedAt</h2>
	 * <p>
	 * updatedAt
	 * </p>
	 */
	private Date updatedAt;
	 /**
	 * <h2> delflag</h2>
	 * <p>
	 * delflag
	 * </p>
	 */
	private Boolean delflag;
	 /**
	 * <h2> file</h2>
	 * <p>
	 * file
	 * </p>
	 */
	private MultipartFile file;
	 
	 /**
	 * <h2> Constructor for PostForm </h2>
	 * <p>
	 * Constructor for PostForm
	 * </p>
	 * @param post
	 */
	public PostForm(Post post) {
		 this.id=post.getId();
		 this.title=post.getTitle();
		 this.description=post.getDescription();
		 this.photo=post.getPhoto();
		 this.categoryId=post.getCategoryId();
		 this.createdAt=post.getCreatedAt();
		 this.updatedAt=post.getUpdatedAt();
		 this.delflag=post.getDelflag();
	 }

}
