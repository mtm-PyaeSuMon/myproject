package com.scm.test.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.test.persistence.entity.StudentCourse;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long>  {
	
	 	List<StudentCourse> findByStudentId(Long studentId);
	 	
	    List<StudentCourse> findByCourseId(Long courseId);
	    
	    void deleteByStudentIdAndCourseId(Long studentId, Long courseId);
}
