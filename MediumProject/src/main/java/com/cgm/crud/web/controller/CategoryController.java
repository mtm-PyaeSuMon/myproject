package com.cgm.crud.web.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cgm.crud.bl.service.CategoryService;
import com.cgm.crud.web.form.CategoryForm;

/**
 * <h2> CategoryController Class</h2>
 * <p>
 * Process for Displaying CategoryController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class CategoryController {
	
	/**
	 * <h2> categoryService</h2>
	 * <p>
	 * categoryService
	 * </p>
	 */
	@Autowired
    private CategoryService categoryService;
	
	/**
	 * <h2> viewPost</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/category" }, method = RequestMethod.GET)
    public ModelAndView viewPost() {
        ModelAndView view=new ModelAndView("category");
		 CategoryForm categoryForm =new CategoryForm();
        view.addObject("categoryForm",categoryForm);
        return view;
    }
	
	 /**
	 * <h2> insertCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param categoryForm
	 * @param result
	 * @return
	 * @return String
	 */
	@RequestMapping(value = { "/insertCategory" }, method = RequestMethod.POST)
	    public String insertCategory(@Valid @ModelAttribute("categoryForm") CategoryForm categoryForm, BindingResult result) {
	        if (result.hasErrors()) {
	            return "category";
	        }
	        else {
	            categoryService.addCategory(categoryForm);
	            return "redirect:/home";
	        }
	    }
	 
}
