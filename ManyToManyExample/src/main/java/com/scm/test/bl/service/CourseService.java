package com.scm.test.bl.service;

import java.util.List;

import com.scm.test.persistence.entity.Course;

public interface CourseService {
	
	List<Course> getAllCourses();
	
    Course getCourseById(Long id);
    
    void saveCourse(Course course);
    
    void deleteCourse(Long id);

	void enrollStudentInCourse(Long courseId, Long studentId);

	void removeStudentFromCourse(Long courseId, Long studentId);
    
}
