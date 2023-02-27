package com.cgm.crud.bl.service;

import java.util.List;

import javax.validation.Valid;

import com.cgm.crud.bl.dto.UserDto;
import com.cgm.crud.persistence.entity.User;
import com.cgm.crud.web.form.LoginForm;
import com.cgm.crud.web.form.UserForm;

/**
 * <h2> UserService Class</h2>
 * <p>
 * Process for Displaying UserService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface UserService {
    /**
     * <h2> addUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param userForm
     * @return void
     */
    public void addUser(UserForm userForm);
    /**
     * <h2> getAllUser</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<UserDto>
     */
    public List<UserDto> getAllUser();
    /**
     * <h2> findByEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return
     * @return UserDto
     */
    public UserDto findByEmail(String email);
    /**
     * <h2> doGetUserByEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return
     * @return User
     */
    public User doGetUserByEmail(String email);
    /**
     * <h2> updateUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param user
     * @return void
     */
    public void updateUser(User user);
    /**
     * <h2> deleteUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return void
     */
    public void deleteUser(int id);
    /**
     * <h2> getById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return User
     */
    public User getById(int id);    
    /**
     * <h2> rebasePhoto</h2>
     * <p>
     * 
     * </p>
     *
     * @param userEditionForm
     * @return
     * @return String
     */
    public String rebasePhoto(@Valid UserForm userEditionForm);    
    /**
     * <h2> doGetUserById</h2>
     * <p>
     * 
     * </p>
     *
     * @param Id
     * @return
     * @return UserForm
     */
    public UserForm doGetUserById(int Id);   
    /**
     * <h2> login</h2>
     * <p>
     * 
     * </p>
     *
     * @param loginForm
     * @return void
     */
    public void login(LoginForm loginForm);

}
