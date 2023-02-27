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

import com.cgm.crud.bl.dto.CategoryDto;
import com.cgm.crud.bl.dto.PostDto;
import com.cgm.crud.bl.service.CategoryService;
import com.cgm.crud.bl.service.PostService;
import com.cgm.crud.persistence.entity.Post;
import com.cgm.crud.web.form.PostForm;
/**
 * <h2> PostController Class</h2>
 * <p>
 * Process for Displaying PostController
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Controller
public class PostController {
	
	/**
	 * <h2> postService</h2>
	 * <p>
	 * postService
	 * </p>
	 */
	@Autowired
    private PostService postService;
	
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
	@RequestMapping(value = { "/post" }, method = RequestMethod.GET)
    public ModelAndView viewPost() {
		List<CategoryDto> category = categoryService.getAllCategory();
        ModelAndView view=new ModelAndView("post");
		 PostForm postForm =new PostForm();
        view.addObject("postForm",postForm);
        view.addObject("categoryList",category);
        return view;
    }
	
	/**
	 * <h2> insertPost</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param postForm
	 * @param result
	 * @return
	 * @return String
	 */
	@RequestMapping(value = { "/insertPost" }, method = RequestMethod.POST)
    public String insertPost(@Valid @ModelAttribute("postForm") PostForm postForm, BindingResult result) {
		System.out.println("CategoryId"+ postForm.getCategoryId());
        if (result.hasErrors()) {
        	postForm.setPhoto(this.postService.rebasePhoto(postForm));
            return "post";
        }
        else {
            postService.addPost(postForm);
            return "redirect:/postReport";
        }
    }
 
    /**
     * <h2> lodePost</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return ModelAndView
     */
    @GetMapping("/postReport")
    public ModelAndView lodePost() {
        ModelAndView report = new ModelAndView("postReport");
        List<PostDto> post = postService.getAllPost();
        report.addObject("post", post);

        return report;
    }
    
    /**
     * <h2> lodeEditPost</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @param m
     * @return
     * @return String
     */
    @GetMapping("/editPost/{id}")
    public String lodeEditPost(@PathVariable(value = "id") int id, Model m) {
        Post post = postService.getById(id);
        System.out.println(post);
        m.addAttribute("updatePost", post);
        m.addAttribute("title", "Edit Post");

        return "editPost";
    }
    
    /**
     * <h2> updatePost</h2>
     * <p>
     * 
     * </p>
     *
     * @param post
     * @return
     * @return String
     */
    @PostMapping("/editPost/updatePost")
    public String updatePost(@ModelAttribute("updatePost") Post post) {
        postService.updatePost(post);

        return "redirect:/postReport";
    }
    
    /**
     * <h2> deletePost</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return String
     */
    @GetMapping("/deletePost/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);    
    	 return "redirect:/postReport";
    }
    
    /**
     * <h2> getPostDetail</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/postdetail/{id}", method = RequestMethod.GET)
    public ModelAndView getPostDetail(@PathVariable(value = "id") int id) {
    	ModelAndView postDetail = new ModelAndView("postDetail");
    	 PostForm post = postService.doGetPostById(id);
    	 System.out.println("Post"+ post);
    	 postDetail.addObject("postDetail",post);
    	 return postDetail;

    }
    
}
