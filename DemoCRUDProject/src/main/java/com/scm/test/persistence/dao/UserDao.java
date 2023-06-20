package com.scm.test.persistence.dao;

import java.util.List;

import com.scm.test.persistence.entity.User;

public interface UserDao {
	
    public void addUser(User user);
    
    public List<User> getAllUser();
    
    public void updateUser(User user);
    
    public void deleteUser(Integer id); 
    
    public User getUserById(Integer id); 
}
