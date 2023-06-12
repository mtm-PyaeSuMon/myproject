package com.scm.crud.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.crud.persistence.entity.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Long>  {

}
