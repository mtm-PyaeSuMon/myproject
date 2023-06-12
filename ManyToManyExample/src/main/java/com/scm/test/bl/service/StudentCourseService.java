package com.scm.test.bl.service;

public interface StudentCourseService {
	
	void enrollStudentInCourse(Long studentId, Long courseId);
	
    void removeStudentFromCourse(Long studentId, Long courseId);

}
