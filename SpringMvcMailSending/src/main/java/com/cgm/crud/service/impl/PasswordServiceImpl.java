package com.cgm.crud.service.impl;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgm.crud.common.Constant;
import com.cgm.crud.common.TokenGenerator;
import com.cgm.crud.dao.EmployeeDao;
import com.cgm.crud.dao.PasswordDao;
import com.cgm.crud.entity.Employee;
import com.cgm.crud.entity.PasswordReset;
import com.cgm.crud.form.ResetForm;
import com.cgm.crud.service.PasswordService;

/**
 *<h2>PasswordServiceImplClass</h2>
 *<p>
 *Process for DisplayingPasswordServiceImpl
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class PasswordServiceImpl implements PasswordService {

    private Timestamp now = new Timestamp(new Date(System.currentTimeMillis()).getTime());

    @Autowired
    private PasswordDao passwordDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     *<h2>createResetToken</h2>
     *<p>
     *
     *</p>
     *
     *@param email
     *@return
     */
    @Override
    public ResetForm createResetToken(String email) {

        PasswordReset pwToken = passwordDao.getTokenDataByEmail(email);

        // delete token
        if (pwToken != null) {
            passwordDao.deleteToken(email);
        }

        // for token
        String token = new TokenGenerator(Constant.PSW_TOKEN_LENGTH).getToken();

        // for token expire
        Timestamp expired = new Timestamp(
                new Date(System.currentTimeMillis() + Constant.PSW_TOKEN_EPIRE_MINUTE * 60 * 1000).getTime());

        // save to database
        ResetForm resetForm = new ResetForm();
        resetForm.setEmail(email);
        resetForm.setToken(token);
        resetForm.setCreated_at(now);
        resetForm.setExpired_at(expired);

        passwordDao.createToken(this.getPasswordToken(resetForm));

        return resetForm;
    }

    /**
     *<h2>getDataByToken</h2>
     *<p>
     *
     *</p>
     *
     *@param token
     *@return
     */
    @Override
    public ResetForm getDataByToken(String token) {
        PasswordReset pw = passwordDao.dbGetDataByToken(token);
        if (pw == null) {
            return null;
        }

        ResetForm reset = new ResetForm(pw);
        return reset;
    }

    /**
     *<h2>deleteToken</h2>
     *<p>
     *
     *</p>
     *
     *@param email
     */
    public void deleteToken(String email) {
        passwordDao.deleteToken(email);
    }

    /**
     *<h2>updatePassword</h2>
     *<p>
     *
     *</p>
     *
     *@param resetForm
     */
    @Override
    public void updatePassword(ResetForm resetForm) {
        resetForm.setPassword(passwordEncoder.encode(resetForm.getPassword()));

        String email = resetForm.getEmail();
        Employee emp = employeeDao.findByEmail(email);

        emp.setPassword(resetForm.getPassword());

        employeeDao.updateEmp(emp);
    }

    /**
     *<h2>getPasswordToken
     *<p>
     *
     *</p>
     *
     * @param resetForm
     * @return
     *@return PasswordReset
     */
    private PasswordReset getPasswordToken(ResetForm resetForm) {
        PasswordReset pwToken = new PasswordReset();
        pwToken.setEmail(resetForm.getEmail());
        pwToken.setToken(resetForm.getToken());
        pwToken.setCreated_at(resetForm.getCreated_at());
        pwToken.setExpired_at(resetForm.getExpired_at());
        return pwToken;
    }
}
