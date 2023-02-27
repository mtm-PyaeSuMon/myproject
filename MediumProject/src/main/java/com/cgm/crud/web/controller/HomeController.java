package com.cgm.crud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.crud.web.form.LoginForm;

/**
 * <h2> HomeController Class</h2>
 * <p>
 * Process for Displaying HomeController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	/**
	 * <h2> viewHome</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	@RequestMapping(value= "/home", method = RequestMethod.GET)
    public String viewHome() {
        return "home";
    } 
	
	 /**
	 * <h2> viewLogin</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping("/login")
	    public ModelAndView viewLogin() {
	        ModelAndView view =new ModelAndView("login");
	        LoginForm loginForm =new LoginForm();
	        view.addObject("login", loginForm);
	        return view;
	    }
}
