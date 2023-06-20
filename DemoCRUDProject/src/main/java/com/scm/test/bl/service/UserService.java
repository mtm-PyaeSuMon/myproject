package com.scm.test.bl.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.scm.test.bl.dto.UserDto;
import com.scm.test.persistence.entity.User;
import com.scm.test.web.form.UserForm;


public interface UserService {
    
    public void addUser(UserForm userForm, HttpSession session) throws IOException;
    
    public List<UserDto> getAllUser();
    
    public void updateUser(UserForm user,HttpSession session) throws IOException ;
    
    public void deleteUser(int id);
    
    public User getById(int id); 
}

