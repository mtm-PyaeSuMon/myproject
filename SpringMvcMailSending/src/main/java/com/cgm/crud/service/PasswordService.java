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
    ResetForm createResetToken(String email);
    
    void updatePassword(ResetForm resetForm);

    ResetForm getDataByToken(String token);

    void deleteToken(String email);
}
