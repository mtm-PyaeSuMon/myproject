package com.scm.test.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.scm.test.web.form.UserForm;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="User")
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="email")
    private String email;
    
    @Column(name="city")
    private String city;
    
    @Column(name="street")
    private String street;
    
    public User() {
        super();
    }
    
    public User(UserForm userForm) {
        this.id=userForm.getId();
        this.name=userForm.getName();
        this.email=userForm.getEmail();
        this.city=userForm.getCity();
        this.street=userForm.getStreet();
    }
}
