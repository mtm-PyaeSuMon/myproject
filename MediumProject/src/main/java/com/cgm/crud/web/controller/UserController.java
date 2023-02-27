package com.cgm.crud.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.crud.bl.dto.UserDto;
import com.cgm.crud.bl.service.UserService;
import com.cgm.crud.persistence.entity.User;
import com.cgm.crud.web.form.LoginForm;
import com.cgm.crud.web.form.UserForm;

/**
 * <h2> UserController Class</h2>
 * <p>
 * Process for Displaying UserController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class UserController {
	
	/**
	 * <h2> userService</h2>
	 * <p>
	 * userService
	 * </p>
	 */
	@Autowired
    private UserService userService;
	
	 /**
	 * <h2> showLogin</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	    public ModelAndView showLogin() {
	        
	       ModelAndView view =new ModelAndView();
	       LoginForm login =new LoginForm();
	       view.addObject("login",login);
	        return view;
	    }
	 
	    /**
	     * <h2> login</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @param login
	     * @param result
	     * @return
	     * @return String
	     */
	    @RequestMapping(value="/login", method = RequestMethod.POST)
	    public String login(@Valid @ModelAttribute("login") LoginForm login, BindingResult result) {
	    	@SuppressWarnings("unused")
			User user = this.userService.doGetUserByEmail(login.getEmail());
	           if(result.hasErrors()) {
	               return "login";
	           }else {
	        	   if(login.getEmail()=="admin2023@gmail.com") {
	        		   userService.login(login);
	                   return "redirect:/userReport";
	        	   }else {
	        		   return "redirect:/register";
	        	   }
	           }
	        }
	    
	
	/**
	 * <h2> viewRegister</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
    public ModelAndView viewRegister() {
        ModelAndView view=new ModelAndView("register");
		 UserForm userForm =new UserForm();
        view.addObject("userForm",userForm);
        return view;
    }
	 
	 /**
	 * <h2> insertUser</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param userForm
	 * @param result
	 * @return
	 * @return String
	 */
	@RequestMapping(value = { "/insertUser" }, method = RequestMethod.POST)
	    public String insertUser(@Valid @ModelAttribute("userForm") UserForm userForm, BindingResult result) {
	        if (result.hasErrors()) {
	        	userForm.setPhoto(this.userService.rebasePhoto(userForm));
	            return "register";
	        }
	        else {
	            userService.addUser(userForm);
	            return "redirect:/userReport";
	        }
	    }
	 
	    /**
	     * <h2> lodeUser</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @return
	     * @return ModelAndView
	     */
	    @GetMapping("/userReport")
	    public ModelAndView lodeUser() {
	        ModelAndView report = new ModelAndView("userReport");
	        List<UserDto> user = userService.getAllUser();
	        report.addObject("user", user);
	        return report;
	    }
	    
	    /**
	     * <h2> lodeEditUser</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @param id
	     * @param m
	     * @return
	     * @return String
	     */
	    @GetMapping("/editUser/{id}")
	    public String lodeEditUser(@PathVariable(value = "id") int id, Model m) {
	        UserForm user = userService.doGetUserById(id);

	        System.out.println(user);
	        m.addAttribute("updateUser", user);
	        m.addAttribute("title", "Edit User");

	        return "editUser";
	    }
	    
	    /**
	     * <h2> updateUser</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @param user
	     * @return
	     * @return String
	     */
	    @PostMapping("/editUser/updateUser")
	    public String updateUser(@ModelAttribute("updateUser") User user) {
	        userService.updateUser(user);

	        return "redirect:/userReport";
	    }
	    
	    /**
	     * <h2> deleteUser</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @param id
	     * @return
	     * @return String
	     */
	    @GetMapping("/deleteUser/{id}")
	    public String deleteUser(@PathVariable int id) {
	        userService.deleteUser(id);

	        return "redirect:/userReport";
	    }
	    
	    /**
	     * <h2> getUserDetail</h2>
	     * <p>
	     * 
	     * </p>
	     *
	     * @param id
	     * @return
	     * @return ModelAndView
	     */
	    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	    public ModelAndView getUserDetail(@PathVariable(value = "id") int id) {
	    	ModelAndView userDetail = new ModelAndView("userDetail");
	    	 UserForm user = userService.doGetUserById(id);
	    	 userDetail.addObject("userDetail",user);
	    	 return userDetail;

	    }

}
