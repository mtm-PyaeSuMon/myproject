package com.scm.test.persistence.dao;

import java.util.List;
import com.scm.test.persistence.entity.Student;


public interface StudentDao {
	public void addStudent(Student stu);

    public List<Student> getAllStudent();
    
    public Student findByEmail(String email);

}
