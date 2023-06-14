package com.scm.test.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.scm.test.web.form.StudentForm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String ph;
	private String course;
	private String email;
	private String password;
	private String type;	
	
	public Student() {
        super();
    }
	
	public Student(StudentForm studentForm) {
		this.name=studentForm.getName();
		this.address=studentForm.getAddress();
		this.ph=studentForm.getPh();
		this.course=studentForm.getCourse();
		this.email=studentForm.getEmail();
		this.password=studentForm.getPassword();
		this.type=studentForm.getType();
		
	}
}
