package com.cgm.crud.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cgm.crud.form.ResetForm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *<h2>PasswordResetClass</h2>
 *<p>
 *Process for DisplayingPasswordReset
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "password_reset")
public class PasswordReset {
    /**
     *<h2>id</h2>
     *<p>
     *id
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     *<h2>email</h2>
     *<p>
     *email
     *</p> 
     */
    private String email;
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
     *<h2>Constructor for PasswordReset</h2>
     *<p>
     *Constructor for PasswordReset
     *</p>
     */
    public PasswordReset() {
        super();
    }

    /**
     *<h2>Constructor for PasswordReset</h2>
     *<p>
     *Constructor for PasswordReset
     *</p>
     * @param resetForm
     */
    public PasswordReset(ResetForm resetForm) {
        super();
        
        this.email = resetForm.getEmail();
        this.token = resetForm.getToken();
        this.created_at = resetForm.getCreated_at();
        this.expired_at = resetForm.getExpired_at();
    }

}
