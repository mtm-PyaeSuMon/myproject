package com.scm.test.bl.dto;

import com.scm.test.persistence.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String city;
    private String street;
    
    public UserDto(User user) {
        if(user==null) {
            user=new User();
        }
        this.id=user.getId();
        this.name=user.getName();
        this.email=user.getEmail();
        this.city=user.getCity();
        this.street=user.getStreet();
    }

}
