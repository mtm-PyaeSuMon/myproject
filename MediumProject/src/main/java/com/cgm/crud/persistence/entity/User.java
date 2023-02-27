package com.cgm.crud.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cgm.crud.web.form.UserForm;

import lombok.Getter;
import lombok.Setter;

/**
 * <h2> User Class</h2>
 * <p>
 * Process for Displaying User
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@Entity
@Table(name="User")
public class User implements Serializable{
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
    private int id;
	
	/**
	 * <h2> name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@Column(name = "name")
    private String name;
	
	/**
	 * <h2> email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	@Column(name = "email")
    private String email;
	
	/**
	 * <h2> bio</h2>
	 * <p>
	 * bio
	 * </p>
	 */
	@Column(name = "bio")
    private String bio;
	
	/**
	 * <h2> password</h2>
	 * <p>
	 * password
	 * </p>
	 */
	@Column(name = "password")
    private String password;
	
	
	 /**
	 * <h2> photo</h2>
	 * <p>
	 * photo
	 * </p>
	 */
	@Column(name = "photo")
	 private String photo;
	 
	
	/**
	 * <h2> createdAt</h2>
	 * <p>
	 * createdAt
	 * </p>
	 */
	@Column(name ="created_at")
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
	 * <h2> Constructor for User </h2>
	 * <p>
	 * Constructor for User
	 * </p>
	 */
	public User() {
	        super();
	    }
	  
	  /**
	 * <h2> Constructor for User </h2>
	 * <p>
	 * Constructor for User
	 * </p>
	 * @param userForm
	 */
	public User(UserForm userForm) {
		  this.id=userForm.getId();
		  this.name=userForm.getName();
		  this.email=userForm.getEmail();
		  this.bio=userForm.getBio();
		  this.password=userForm.getPassword();
		  this.photo=userForm.getPhoto();
		  this.createdAt=userForm.getCreatedAt();
		  this.updatedAt=userForm.getUpdatedAt();
	  }
	

}
