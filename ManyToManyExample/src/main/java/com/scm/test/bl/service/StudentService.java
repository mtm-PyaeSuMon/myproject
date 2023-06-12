package com.scm.test.bl.service;

import java.util.List;

import com.scm.test.persistence.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
    Student getStudentById(Long id);
    
    void saveStudent(Student student);
    
    void deleteStudent(Long id);

}
