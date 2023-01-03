package com.cgm.crud.form;

import java.sql.Timestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.cgm.crud.entity.PasswordReset;

import lombok.Getter;
import lombok.Setter;

/**
 *<h2>ResetFormClass</h2>
 *<p>
 *Process for DisplayingResetForm
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
public class ResetForm {

    /**
     *<h2>email</h2>
     *<p>
     *email
     *</p> 
     */
    @Email
    @NotEmpty
    private String email;
    /**
     *<h2>password</h2>
     *<p>
     *password
     *</p> 
     */
    private String password;
    /**
     *<h2>token</h2>
     *<p>
     *token
     *</p> 
     */
    private String token;
    /**
     *<h2>created_at</h2>
     *<p>
     *created_at
     *</p> 
     */
    private Timestamp created_at;
    /**
     *<h2>expired_at</h2>
     *<p>
     *expired_at
     *</p> 
     */
    private Timestamp expired_at;

    /**
     *<h2>Constructor for ResetForm</h2>
     *<p>
     *Constructor for ResetForm
     *</p>
     */
    public ResetForm() {
        super();
    }

    /**
     *<h2>Constructor for ResetForm</h2>
     *<p>
     *Constructor for ResetForm
     *</p>
     * @param passwordReset
     */
    public ResetForm(PasswordReset passwordReset) {
        this.email = passwordReset.getEmail();
        this.token = passwordReset.getToken();
        this.created_at = passwordReset.getCreated_at();
        this.expired_at = passwordReset.getExpired_at();
    }
}
