package com.scm.test.bl.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.test.bl.service.StudentCourseService;
import com.scm.test.persistence.repository.StudentCourseRepository;
import com.scm.test.persistence.entity.Course;
import com.scm.test.persistence.entity.Student;
import com.scm.test.persistence.entity.StudentCourse;

@Service
public class StudentCourseServiceImpl implements StudentCourseService{
		@Autowired
		private final StudentCourseRepository studentCourseRepository;

		@Autowired
	    public StudentCourseServiceImpl(StudentCourseRepository studentCourseRepository) {
	        this.studentCourseRepository = studentCourseRepository;
	    }

	    @Override
	    public void enrollStudentInCourse(Long studentId, Long courseId) {
	        Student student = new Student();
	        student.setId(studentId);

	        Course course = new Course();
	        course.setId(courseId);

	        StudentCourse studentCourse = new StudentCourse();
	        studentCourse.setStudent(student);
	        studentCourse.setCourse(course);

	        studentCourseRepository.save(studentCourse);
	    }

	    @Override
	    public void removeStudentFromCourse(Long studentId, Long courseId) {
	        studentCourseRepository.deleteByStudentIdAndCourseId(studentId, courseId);
	    }

}
