package com.scm.testing.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Post")
public class Post implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable=false)
    private Integer id;
    
    @Column(name = "title",nullable=false,unique=true)
    private String title;
    
    @Column(name = "description",nullable=false)
    private String description;
    
    @Column(name="status",nullable=false,columnDefinition = "varchar(255) default 'Active'")
    private String status;
    
    @Column(name="created_user_id",nullable=false)
    private Integer createdUserId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
