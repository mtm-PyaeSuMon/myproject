package com.cgm.crud.web.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.cgm.crud.persistence.entity.Login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <h2> LoginForm Class</h2>
 * <p>
 * Process for Displaying LoginForm
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class LoginForm {
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
     * <h2> password</h2>
     * <p>
     * password
     * </p>
     */
    @NotEmpty(message = "Please Enter Your Password")
    @Size(min = 5, max = 20)
    private String password;
    
    /**
     * <h2> Constructor for LoginForm </h2>
     * <p>
     * Constructor for LoginForm
     * </p>
     * @param login
     */
    public LoginForm(LoginForm login) {
        this.email=login.getEmail();
        this.password=login.getPassword();
    }
    /**
     * <h2> Constructor for LoginForm </h2>
     * <p>
     * Constructor for LoginForm
     * </p>
     * @param login
     */
    public LoginForm(Login login) {
    	this.email=login.getEmail();
    	this.password=login.getPassword();
    }

}
