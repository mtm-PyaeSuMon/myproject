package com.scm.crud.persistence.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="users")
public class User implements Serializable{
	
	 private static final long serialVersionUID = 1L;
	 
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
	    private Long id;

		@Column(name="name")
	    private String name;

		 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
		  private Address address;
}
