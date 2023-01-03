package com.cgm.crud.dao;

import com.cgm.crud.entity.PasswordReset;

/**
 *<h2>PasswordDaoClass</h2>
 *<p>
 *Process for DisplayingPasswordDao
 *</p>
 *
 * @author PyaeSuMon
 *
 */
public interface PasswordDao {

    /**
     *<h2>getTokenDataByEmail
     *<p>
     *
     *</p>
     *
     * @param email
     * @return
     *@return PasswordReset
     */
    PasswordReset getTokenDataByEmail(String email);

    /**
     *<h2>deleteToken
     *<p>
     *
     *</p>
     *
     * @param email
     *@return void
     */
    void deleteToken(String email);

    /**
     *<h2>createToken
     *<p>
     *
     *</p>
     *
     * @param pswToken
     *@return void
     */
    void createToken(PasswordReset pswToken);
    
    PasswordReset dbGetDataByToken(String token);
}
