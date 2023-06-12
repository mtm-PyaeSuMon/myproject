package com.scm.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.test.bl.service.CourseService;
import com.scm.test.bl.service.StudentService;
import com.scm.test.persistence.entity.Course;
import com.scm.test.persistence.entity.Student;
import com.scm.test.web.form.StudentCourseForm;

@Controller
@RequestMapping("/student-course")
public class StudentCourseController {
	
		@Autowired
	 	private final StudentService studentService;
		@Autowired
	    private final CourseService courseService;

	    @Autowired
	    public StudentCourseController(StudentService studentService, CourseService courseService) {
	        this.studentService = studentService;
	        this.courseService = courseService;
	    }

	    @GetMapping("/add")
	    public String showAddStudentCourseForm(Model model) {
	        model.addAttribute("students", studentService.getAllStudents());
	        model.addAttribute("courses", courseService.getAllCourses());
	        model.addAttribute("studentCourseForm", new StudentCourseForm());
	        return "add-student-course-form";
	    }

	    @PostMapping("/save")
	    public String saveStudentCourse(@ModelAttribute("studentCourseForm") StudentCourseForm form) {
	        Student student = studentService.getStudentById(form.getStudentId());
	        Course course = courseService.getCourseById(form.getCourseId());
	        student.getCourses().add(course);
	        studentService.saveStudent(student);
	        return "redirect:/student-course/add";
	    }

}
