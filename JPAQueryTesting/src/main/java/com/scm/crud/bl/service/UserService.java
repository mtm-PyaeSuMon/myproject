package com.scm.crud.bl.service;

import com.scm.crud.persistence.entity.User;

public interface UserService {   
	 User createUser(User user);
	 User getUserById(Long id);
	 Iterable <User> getAllUsers();
}
