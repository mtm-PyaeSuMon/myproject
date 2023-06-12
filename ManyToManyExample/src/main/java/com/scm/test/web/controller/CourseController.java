package com.scm.test.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scm.test.bl.service.CourseService;
import com.scm.test.bl.service.StudentService;
import com.scm.test.persistence.entity.Course;

@Controller
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private final CourseService courseService;
	@Autowired
    private final StudentService studentService;

    public CourseController(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String getAllCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "course-list";
    }

    @GetMapping("/add")
    public String showAddCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "course-form";
    }

    @PostMapping("/add")
    public String addCourse(@ModelAttribute("course") Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses/";
    }

    @GetMapping("/edit/{id}")
    public String showEditCourseForm(@PathVariable("id") Long id, Model model) {
        Course course = courseService.getCourseById(id);
        if (course != null) {
            model.addAttribute("course", course);
            return "course-form";
        }
        return "redirect:/courses/";
    }

    @PostMapping("/edit/{id}")
    public String editCourse(@PathVariable("id") Long id, @ModelAttribute("course") Course updatedCourse) {
        Course course = courseService.getCourseById(id);
        if (course != null) {
            course.setName(updatedCourse.getName());
            courseService.saveCourse(course);
        }
        return "redirect:/courses/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable("id") Long id) {
        courseService.deleteCourse(id);
        return "redirect:/courses/";
    }
}
