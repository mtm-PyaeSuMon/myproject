package com.cgm.crud.persistence.dao;

import java.util.List;

import com.cgm.crud.persistence.entity.Category;
import com.cgm.crud.persistence.entity.Post;

/**
 * <h2> PostDao Class</h2>
 * <p>
 * Process for Displaying PostDao
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
public interface PostDao {
    /**
     * <h2> addPost</h2>
     * <p>
     * 
     * </p>
     *
     * @param post
     * @return void
     */
    public void addPost(Post post);
    /**
     * <h2> getAllPost</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<Post>
     */
    public List<Post> getAllPost();
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
     * <h2> getPostById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return Post
     */
    public Post getPostById(int id);    
    /**
     * <h2> findById</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return Post
     */
    public Post findById(int id);    
    /**
     * <h2> dbGetPostByID</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
     * @return
     * @return Post
     */
    public Post dbGetPostByID(int id);     
    /**
     * <h2> detailPost</h2>
     * <p>
     * 
     * </p>
     *
     * @param post
     * @return void
     */
    public void detailPost(Post post);    
    /**
     * <h2> getAllCategory</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<Category>
     */
    public List<Category> getAllCategory();
}
