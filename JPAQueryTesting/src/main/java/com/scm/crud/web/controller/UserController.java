package com.scm.crud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.scm.crud.bl.service.UserService;
import com.scm.crud.persistence.entity.User;

@Controller
public class UserController {

	@Autowired
    private UserService userService;
	
    
    @GetMapping("/user-list")
    public String getAllUsers(Model model) {
        Iterable <User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user-list";
    }
    
    @GetMapping("/")
    public String showUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }
    
    @PostMapping("/insertUser")
    public String createUser(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "redirect:user-list";
    }

    @GetMapping("/user-detail/{id}")
    public String showUserDetails(@PathVariable("id") Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user-detail";
    }

}
