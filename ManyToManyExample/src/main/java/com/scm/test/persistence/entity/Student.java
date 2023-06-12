package com.scm.test.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="students")
public class Student {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    @ManyToMany(fetch = FetchType.EAGER)
	    @JoinTable(name = "student_course",
	            joinColumns = @JoinColumn(name = "student_id"),
	            inverseJoinColumns = @JoinColumn(name = "course_id"))
	    private List<Course> courses;

}
