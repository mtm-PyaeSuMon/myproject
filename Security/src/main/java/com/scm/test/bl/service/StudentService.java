package com.scm.test.bl.service;

import java.util.List;

import com.scm.test.bl.dto.StudentDto;
import com.scm.test.web.form.StudentForm;

public interface StudentService {
	public void addStudent(StudentForm studentForm);
	
	public List<StudentDto> getAllStudent();
	
	public StudentDto findByEmail(String email);

}
