package com.cgm.crud.persistence.dao;

import java.util.List;

import com.cgm.crud.persistence.entity.User;

/**
 * <h2> UserDao Class</h2>
 * <p>
 * Process for Displaying UserDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface UserDao {
    /**
     * <h2> addUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param user
     * @return void
     */
    public void addUser(User user);
    /**
     * <h2> getAllUser</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<User>
     */
    public List<User> getAllUser();
    /**
     * <h2> findByEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return
     * @return User
     */
    public User findByEmail(String email);
    /**
     * <h2> dbGetUserByEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return
     * @return User
     */
    public User dbGetUserByEmail(String email); 
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
     * <h2> getUserById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return User
     */
    public User getUserById(int id);    
    /**
     * <h2> detailUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param user
     * @return void
     */
    public void detailUser(User user);

}
