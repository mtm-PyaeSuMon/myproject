package com.cgm.crud.web.form;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.cgm.crud.persistence.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <h2> UserForm Class</h2>
 * <p>
 * Process for Displaying UserForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class UserForm {
	/**
	 * <h2> id</h2>
	 * <p>
	 * id
	 * </p>
	 */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/**
	 * <h2> name</h2>
	 * <p>
	 * name
	 * </p>
	 */
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	/**
	 * <h2> email</h2>
	 * <p>
	 * email
	 * </p>
	 */
	@NotEmpty(message = "Email cannot be empty")
	@Email
	private String email;
	/**
	 * <h2> bio</h2>
	 * <p>
	 * bio
	 * </p>
	 */
	@NotEmpty(message = "Bio cannot be empty")
	 private String bio;
	/**
	 * <h2> password</h2>
	 * <p>
	 * password
	 * </p>
	 */
	 @NotEmpty(message = "Please Enter Your Password")
     @Size(min = 5, max = 20)
	 private String password;
	 /**
	 * <h2> confirmedpassword</h2>
	 * <p>
	 * confirmedpassword
	 * </p>
	 */
	@NotEmpty
	 @Size(min = 5, max = 20)
	 private String confirmedpassword;
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
	 * <h2> file</h2>
	 * <p>
	 * file
	 * </p>
	 */
	private MultipartFile file;
	 
	 /**
	 * <h2> Constructor for UserForm </h2>
	 * <p>
	 * Constructor for UserForm
	 * </p>
	 * @param user
	 */
	public UserForm(User user) {
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
