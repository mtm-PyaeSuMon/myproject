package com.scm.crud.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scm.crud.persistence.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>  {

}
