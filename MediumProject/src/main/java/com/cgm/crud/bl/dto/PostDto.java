package com.cgm.crud.bl.dto;

import java.util.Date;

import com.cgm.crud.persistence.entity.Post;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <h2> PostDto Class</h2>
 * <p>
 * Process for Displaying PostDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class PostDto {
	
	 /**
	 * <h2> id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	private Integer id;
	 /**
	 * <h2> title</h2>
	 * <p>
	 * title
	 * </p>
	 */
	private String title;
	 /**
	 * <h2> description</h2>
	 * <p>
	 * description
	 * </p>
	 */
	private String description;
	 /**
	 * <h2> category</h2>
	 * <p>
	 * category
	 * </p>
	 */
	private String category;
	 /**
	 * <h2> photo</h2>
	 * <p>
	 * photo
	 * </p>
	 */
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
	 * <h2> Constructor for PostDto </h2>
	 * <p>
	 * Constructor for PostDto
	 * </p>
	 * @param post
	 */
	public PostDto(Post post) {
	        if (post == null) {
	            post = new Post();
	        }
	        this.id=post.getId();
	        this.title=post.getTitle();
	        this.description=post.getDescription();
	        this.photo=post.getPhoto();
	        this.createdAt=post.getCreatedAt();
	        this.updatedAt=post.getUpdatedAt();
	        this.delflag=post.getDelflag();
	        
	 }
}
