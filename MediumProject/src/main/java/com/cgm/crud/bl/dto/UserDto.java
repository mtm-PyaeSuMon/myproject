package com.cgm.crud.bl.dto;

import java.util.Date;

import com.cgm.crud.persistence.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <h2> UserDto Class</h2>
 * <p>
 * Process for Displaying UserDto
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class UserDto {
	/**
	 * <h2> id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	private int id;
	/**
	 * <h2> name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	private String name;
	/**
	 * <h2> email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	private String email;
	 /**
	 * <h2> bio</h2>
	 * <p>
	 * bio
	 * </p>
	 */
	private String bio;
	 /**
	 * <h2> password</h2>
	 * <p>
	 * password
	 * </p>
	 */
	private String password;
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
	private String type;
	 
	 /**
	 * <h2> Constructor for UserDto </h2>
	 * <p>
	 * Constructor for UserDto
	 * </p>
	 * @param user
	 */
	public UserDto(User user) {
	        if (user == null) {
	            user = new User();
	        }
	        this.id=user.getId();
	        this.name=user.getName();
	        this.email=user.getEmail();
	        this.bio=user.getBio();
	        this.password=user.getPassword();
	        this.photo=user.getPhoto();
	        this.createdAt=user.getCreatedAt();
	        this.updatedAt=user.getUpdatedAt();

	 }
}
