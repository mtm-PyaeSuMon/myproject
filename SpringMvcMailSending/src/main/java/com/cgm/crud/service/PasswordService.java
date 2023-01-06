package com.cgm.crud.service;

import com.cgm.crud.form.ResetForm;

/**
 *<h2>PasswordServiceClass</h2>
 *<p>
 *Process for DisplayingPasswordService
 *</p>
 *
 * @author PyaeSuMon
 *
 */
public interface PasswordService {
    /**
     *<h2>createResetToken
     *<p>
     *
     *</p>
     *
     * @param email
     * @return
     *@return ResetForm
     */
    ResetForm createResetToken(String email);
    
    /**
     *<h2>updatePassword
     *<p>
     *
     *</p>
     *
     * @param resetForm
     *@return void
     */
    void updatePassword(ResetForm resetForm);

    /**
     *<h2>getDataByToken
     *<p>
     *
     *</p>
     *
     * @param token
     * @return
     *@return ResetForm
     */
    ResetForm getDataByToken(String token);

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
}
