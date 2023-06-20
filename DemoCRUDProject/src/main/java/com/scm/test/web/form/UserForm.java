package com.scm.test.web.form;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.scm.test.persistence.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotEmpty
    private String name;
    
    @NotEmpty
    private String email;
    
    @NotEmpty
    private String city;
    
    @NotEmpty
    private String street;
    
    public UserForm(User user) {
        this.id=user.getId();
        this.name=user.getName();
        this.email=user.getEmail();
        this.city=user.getCity();
        this.street=user.getStreet();
    }
    

}
