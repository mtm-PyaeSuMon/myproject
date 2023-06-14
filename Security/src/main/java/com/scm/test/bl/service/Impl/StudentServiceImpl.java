package com.scm.test.bl.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.scm.test.bl.dto.StudentDto;
import com.scm.test.bl.service.StudentService;
import com.scm.test.persistence.dao.StudentDao;
import com.scm.test.persistence.entity.Student;
import com.scm.test.web.form.StudentForm;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public void addStudent(StudentForm studentForm) {
		Student student=new Student();
		student.setName(studentForm.getName());
		student.setAddress(studentForm.getAddress());
		student.setCourse(studentForm.getCourse());
		student.setEmail(studentForm.getEmail());
		student.setPh(studentForm.getPh());
		student.setPassword(passwordEncoder.encode(studentForm.getPassword()));
		student.setType(studentForm.getType());
		studentDao.addStudent(student);
	}

	@Override
	public List<StudentDto> getAllStudent() {
		 List<Student> allStudent = studentDao.getAllStudent();

	        List<StudentDto> student = new ArrayList<StudentDto>();
	        for (Student stu : allStudent) {
	        	StudentDto stuDto = new StudentDto(stu);
	        	stuDto.setId(stu.getId());
	        	stuDto.setName(stu.getName());
	        	stuDto.setAddress(stu.getAddress());
	        	stuDto.setCourse(stu.getCourse());
	        	stuDto.setType(stu.getType());	        	
	            student.add(stuDto);
	        }

	        return student;
	}

	@Override
	public StudentDto findByEmail(String email) {
		Student student = studentDao.findByEmail(email);

        if (student == null) {
            return null;
        }
        StudentDto studentDto = new StudentDto(student);
        return studentDto;
    }
	}
