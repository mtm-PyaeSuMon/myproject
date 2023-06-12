package com.scm.crud.bl.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.crud.bl.service.AddressService;
import com.scm.crud.persistence.entity.Address;
import com.scm.crud.persistence.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
    private AddressRepository addressRepository;

    @Override
    public void createAddress(Address address) {
        addressRepository.save(address);
    }

}
