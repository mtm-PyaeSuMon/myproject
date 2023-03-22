package com.scm.testing.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="User")
public class User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",nullable=false)
    private Integer id;
    
    @Column(name = "name",nullable=false)
    private String name;
    
    @Column(name = "email",nullable=false,unique=true)
    private String email;
    
    @Column(name = "bio",nullable=false)
    private String bio;
    
    @Column(name = "password",nullable=false,columnDefinition = "TEXT")
    private String password;
    
    @Column(name = "photo",nullable=false)
    private String photo;
    
    @Column(name="type",nullable=false,columnDefinition = "varchar(255) default 'Admin'")
    private String type;
    
    @Column(name="phone",nullable=false)
    private String phone;
    
    @Column(name="address")
    private String address;
    
    @Column(name="date_of_birth")
    private Date dob;
    
    @Column(name="created_user_id",nullable=false)
    private Integer createdUserId;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> post;
}
