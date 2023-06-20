package com.scm.test.bl.service.impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scm.test.bl.dto.UserDto;
import com.scm.test.bl.service.UserService;
import com.scm.test.persistence.dao.UserDao;
import com.scm.test.persistence.entity.User;
import com.scm.test.web.form.UserForm;
@Transactional
@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(UserForm userForm, HttpSession session) throws IOException {
        User user = createUserFromForm(userForm);
        userDao.addUser(user);
    }

    private User createUserFromForm(UserForm userForm) {
        User user = new User(userForm);
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setCity(userForm.getCity());
        user.setStreet(userForm.getStreet());
        return user;
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> allUser = userDao.getAllUser();
        List<UserDto> userDtos = new ArrayList<UserDto>();

        for (User user : allUser) {
            UserDto userDto = createUserDtoFromUser(user);
            userDtos.add(userDto);
        }

        return userDtos;
    }

    private UserDto createUserDtoFromUser(User user) {
        UserDto userDto = new UserDto(user);
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setEmail(user.getEmail());
        userDto.setCity(user.getCity());
        userDto.setStreet(user.getStreet());

        return userDto;
    }

    @Override
    public void updateUser(UserForm userForm, HttpSession session) throws IOException {
        User user = userDao.getUserById(userForm.getId());
        updateUserFromForm(user, userForm);
        userDao.updateUser(user);
    }

    private void updateUserFromForm(User user, UserForm userForm) {
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setCity(userForm.getCity());
        user.setStreet(userForm.getStreet());
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User getById(int id) {
        return userDao.getUserById(id);
    }
}
