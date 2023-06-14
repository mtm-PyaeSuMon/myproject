package com.scm.test.bl.dto;

import com.scm.test.persistence.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
	private int id;
	private String name;
	private String address;
	private String ph;
	private String course;
	private String email;
	private String password;
	private String type;
	
	public StudentDto(Student student) {
		if(student==null) {
			student=new Student();
		}
		this.id=student.getId();
		this.name=student.getName();
		this.address=student.getAddress();
		this.ph=student.getPh();
		this.course=student.getCourse();
		this.email=student.getEmail();
		this.password=student.getPassword();
		this.type=student.getType();
	}
}
