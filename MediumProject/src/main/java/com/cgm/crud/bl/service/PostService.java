package com.cgm.crud.bl.service;

import java.util.List;

import javax.validation.Valid;

import com.cgm.crud.bl.dto.CategoryDto;
import com.cgm.crud.bl.dto.PostDto;
import com.cgm.crud.persistence.entity.Post;
import com.cgm.crud.web.form.PostForm;

/**
 * <h2> PostService Class</h2>
 * <p>
 * Process for Displaying PostService
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface PostService {

    /**
     * <h2> addPost</h2>
     * <p>
     * 
     * </p>
     *
     * @param postForm
     * @return void
     */
    public void addPost(PostForm postForm);
    /**
     * <h2> getAllPost</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<PostDto>
     */
    public List<PostDto> getAllPost();
    /**
     * <h2> updatePost</h2>
     * <p>
     * 
     * </p>
     *
     * @param post
     * @return void
     */
    public void updatePost(Post post);
    /**
     * <h2> deletePost</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return void
     */
    public void deletePost(int id);
    /**
     * <h2> getById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return Post
     */
    public Post getById(int id);    
    /**
     * <h2> rebasePhoto</h2>
     * <p>
     * 
     * </p>
     *
     * @param postEditionForm
     * @return
     * @return String
     */
    public String rebasePhoto(@Valid PostForm postEditionForm);   
    /**
     * <h2> findById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return PostDto
     */
    public PostDto findById(int id);    
    /**
     * <h2> doGetPostById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return PostForm
     */
    public PostForm doGetPostById(int id);	
	/**
	 * <h2> getAllCategory</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @return
	 * @return List<CategoryDto>
	 */
	public List<CategoryDto> getAllCategory();

}
