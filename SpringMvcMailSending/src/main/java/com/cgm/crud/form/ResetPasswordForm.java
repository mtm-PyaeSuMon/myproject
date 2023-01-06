package com.cgm.crud.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 *<h2>ResetPasswordFormClass</h2>
 *<p>
 *Process for DisplayingResetPasswordForm
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
public class ResetPasswordForm {

    /**
     *<h2>password</h2>
     *<p>
     *password
     *</p> 
     */
    @NotEmpty
    @Size(min= 6,max= 20)
    private String password;
    /**
     *<h2>token</h2>
     *<p>
     *token
     *</p> 
     */
    private String token;

    /**
     *<h2>confirm_password</h2>
     *<p>
     *confirm_password
     *</p> 
     */
    private String confirm_password;

    /**
     *<h2>Constructor for ResetPasswordForm</h2>
     *<p>
     *Constructor for ResetPasswordForm
     *</p>
     */
    public ResetPasswordForm() {
        super();
    }
}
