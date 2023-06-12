package com.scm.crud.bl.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.crud.bl.service.UserService;
import com.scm.crud.persistence.entity.Address;
import com.scm.crud.persistence.entity.User;
import com.scm.crud.persistence.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;
    
    @Override
    public User createUser(User user) {
        Address address = user.getAddress();
        address.setUser(user);
        
        return userRepository.save(user);
    }
    
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }
    
    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
