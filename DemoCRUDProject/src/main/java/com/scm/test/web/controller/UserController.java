package com.scm.test.web.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpSession;
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

import com.scm.test.bl.dto.UserDto;
import com.scm.test.bl.service.UserService;
import com.scm.test.persistence.entity.User;
import com.scm.test.web.form.UserForm;

@Controller
public class UserController{
    
    @Autowired
    private HttpSession session;
    
    @Autowired
    private UserService userService;
    
        
    @GetMapping(value = "/")
    public ModelAndView getUserForm() {
        ModelAndView userView = new ModelAndView("register");
        userView.addObject("userForm", new UserForm());
        return userView;
    }
    
     @RequestMapping(value = "/insertUser", method = { RequestMethod.POST, RequestMethod.GET })
        public ModelAndView saveUser(@ModelAttribute("userForm") @Valid UserForm userForm,String addressForm,
                BindingResult result) throws ParseException, IOException {
            ModelAndView userView = new ModelAndView("register");
            if (result.hasErrors()) {
                return userView;
            }
            this.userService.addUser(userForm,session);
            userView.setViewName("redirect:/userReport");
            return userView;
        }
     
     @GetMapping("/userReport")
     public ModelAndView lodeUser() {
         ModelAndView report = new ModelAndView("userReport");
         List<UserDto> user = userService.getAllUser();
         report.addObject("user", user);
         return report;
     }
     
     @GetMapping("/editUser/{id}")
     public String lodeEditUser(@PathVariable(value = "id") int id, Model m) {
         User user = userService.getById(id);
         System.out.println(user);
         m.addAttribute("updateUser", user);
         m.addAttribute("title", "Edit User");

         return "editUser";
     }
     
  
     @PostMapping("/editUser/updateUser")
     public String updateUser(@ModelAttribute("updateUser") UserForm user, HttpSession session) throws IOException{
         userService.updateUser(user,session);
         return "redirect:/userReport";
     }
     
     @GetMapping("/deleteUser/{id}")
     public String deleteUser(@PathVariable int id) {
         userService.deleteUser(id);
         return "redirect:/userReport";
     }
     
     @GetMapping("/userDetail/{id}")
     public String showUserDetails(@PathVariable("id") int id, Model model) {
         User user = userService.getById(id);
         model.addAttribute("user", user);
         return "userDetail";
     }
   
}

