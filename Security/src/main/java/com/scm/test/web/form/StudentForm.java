package com.scm.test.web.form;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.scm.test.persistence.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentForm {
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
	
	public StudentForm() {
        super();
    }
	
	public StudentForm(Student student) {
		this.name=student.getName();
		this.address=student.getAddress();
		this.ph=student.getPh();
		this.course=student.getCourse();
		this.email=student.getEmail();
		this.password=student.getPassword();
		this.type=student.getType();
	}

}
