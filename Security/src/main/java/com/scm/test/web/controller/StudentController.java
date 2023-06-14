package com.scm.test.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scm.test.bl.dto.StudentDto;
import com.scm.test.bl.service.StudentService;
import com.scm.test.persistence.entity.Student;
import com.scm.test.web.form.StudentForm;


@Controller
public class StudentController {
	   
    @Autowired
    StudentService studentService;
	
	@RequestMapping(value= {"/"})
    public String viewHome() {
        return "home";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }
    
    @RequestMapping(value = "/error")
    public String error() {
        return "denied";
    }
	
	 @RequestMapping(value = { "/addStudent" }, method = RequestMethod.GET)
	    public String showRegister(Model model) {
	        model.addAttribute("student", new Student());
	        return "register";
	    }

	    @RequestMapping(value = { "/insertStudent" }, method = RequestMethod.POST)
	    public String insertStudent(@ModelAttribute("student") StudentForm stu, BindingResult result) {
	        if (result.hasErrors()) {
	            return "register";
	        }
	        else {
	            studentService.addStudent(stu);
	            return "redirect:/addStudent";
	        }
	    }

	    @GetMapping("/studentReport")
	    public ModelAndView lodeStudent() {
	        ModelAndView report = new ModelAndView("studentReport");
	        List<StudentDto> student = studentService.getAllStudent();
	        report.addObject("student", student);

	        return report;
	    }

}
