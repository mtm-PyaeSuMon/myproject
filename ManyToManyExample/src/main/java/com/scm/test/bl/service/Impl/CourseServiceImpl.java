package com.scm.test.bl.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.test.bl.service.CourseService;
import com.scm.test.persistence.entity.Course;
import com.scm.test.persistence.entity.Student;
import com.scm.test.persistence.entity.StudentCourse;
import com.scm.test.persistence.repository.CourseRepository;
import com.scm.test.persistence.repository.StudentCourseRepository;
import com.scm.test.persistence.repository.StudentRepository;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
    private StudentRepository studentRepository;
	@Autowired
    private StudentCourseRepository studentCourseRepository;

	@Autowired
    public void CourseService(CourseRepository courseRepository, StudentRepository studentRepository, StudentCourseRepository studentCourseRepository) {
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
    
    @Override
    public void enrollStudentInCourse(Long courseId, Long studentId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        Student student = studentRepository.findById(studentId).orElse(null);
        if (course != null && student != null) {
            StudentCourse studentCourse = new StudentCourse();
            studentCourseRepository.save(studentCourse);
        }
    }

    @Override
    public void removeStudentFromCourse(Long courseId, Long studentId) {
        studentCourseRepository.deleteByStudentIdAndCourseId(studentId, courseId);
    }

}
