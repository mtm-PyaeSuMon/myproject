package com.cgm.crud.bl.service.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cgm.crud.bl.dto.CategoryDto;
import com.cgm.crud.bl.dto.PostDto;
import com.cgm.crud.bl.service.PostService;
import com.cgm.crud.common.util.Base64ToMultipartFile;
import com.cgm.crud.persistence.dao.CategoryDao;
import com.cgm.crud.persistence.dao.PostDao;
import com.cgm.crud.persistence.entity.Category;
import com.cgm.crud.persistence.entity.Post;
import com.cgm.crud.web.form.PostForm;

/**
 * <h2> PostServiceImpl Class</h2>
 * <p>
 * Process for Displaying PostServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class PostServiceImpl implements PostService{
	 /**
	 * <h2> postDao</h2>
	 * <p>
	 * postDao
	 * </p>
	 */
	@Autowired
	 private PostDao postDao; 
	 
	 /**
	 * <h2> categoryDao</h2>
	 * <p>
	 * categoryDao
	 * </p>
	 */
	@Autowired
	 private CategoryDao categoryDao;
	 
	 /**
	 * <h2> servletContext</h2>
	 * <p>
	 * servletContext
	 * </p>
	 */
	@Autowired
	 private ServletContext servletContext;
	 
	 /**
	 * <h2> SLASH</h2>
	 * <p>
	 * SLASH
	 * </p>
	 */
	public static final String SLASH = "/";
	 /**
	 * <h2> CONTENT_TYPES</h2>
	 * <p>
	 * CONTENT_TYPES
	 * </p>
	 */
	public static final List<String> CONTENT_TYPES = Arrays.asList("image/png", "image/jpeg", "image/gif");
	 /**
	 * <h2> IMAGE_STORAGE_PATH</h2>
	 * <p>
	 * IMAGE_STORAGE_PATH
	 * </p>
	 */
	public static final String IMAGE_STORAGE_PATH = "resources//img//";

	 
	 /**
	 * <h2> addPost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param postForm
	 */
	@Override
	 public void addPost(PostForm postForm) {
		 Post post=new Post(postForm);
		 post.setCreatedAt(new Date());
		 post.setUpdatedAt(new Date());
		 post.setDelflag(false);
		 postDao.addPost(post);
	 }
	 
	 /**
	 * <h2> getAllPost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	 public List<PostDto> getAllPost(){
		 List<Post> allPost = postDao.getAllPost();		 
		 List<PostDto> post = new ArrayList<PostDto>();
		 for (Post p : allPost) {
			 PostDto postDto = new PostDto(p);
			 postDto.setId(p.getId());
			 postDto.setTitle(p.getTitle());
			 postDto.setDescription(p.getDescription());
			 postDto.setPhoto(p.getPhoto());
			 postDto.setCategory(categoryDao.getCategoryNameById(p.getCategoryId()));
			 postDto.setCreatedAt(p.getCreatedAt());
			 postDto.setUpdatedAt(p.getUpdatedAt());
			 postDto.setDelflag(p.getDelflag());
			 post.add(postDto);
		 }
		 return post;
	 }
	 
	 /**
	 * <h2> updatePost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param post
	 */
	@Override
	 public void updatePost(Post post) {
		 postDao.updatePost(post);
	     post.setCreatedAt(new Date());
	     post.setUpdatedAt(new Date());
	 }
	 
	 /**
	 * <h2> deletePost </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 */
	@Override
	 public void deletePost(int id) {
		 postDao.deletePost(id);

	 }
	 
	 /**
	 * <h2> getById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@Override
	 public Post getById(int id) {
		 return postDao.getPostById(id);
	 }
	 
	 /**
	 * <h2> rebasePhoto </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param file
	 * @return
	 */
	@Override
	 public String rebasePhoto(@Valid PostForm file) {
		 if(file.getFile() == null) return null;
			StringBuilder sb = new StringBuilder();
			sb.append("data:image/png;base64");
			try {
				sb.append(StringUtils.newStringUtf8(Base64.encodeBase64(file.getFile().getBytes(), false)));
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(sb.toString().equals("data:image/png;base64")) return null;
			return sb.toString();
		}
	 
	 /**
	 * <h2> findById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@Override
	 public PostDto findById(int id) {
		 Post post = postDao.findById(id);

	        if (post == null) {
	            return null;
	        }
	        PostDto postDto = new PostDto(post);
	        return postDto;
	 }
	 
	 /**
	 * <h2> doGetPostById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 * @return
	 */
	@Override
	 public PostForm doGetPostById(int id) {
		 Post post = this.postDao.getPostById(id);
	        if (post != null) {
	            PostForm postForm = new PostForm(post);
	            postForm.setPhoto(this.definePostPhoto(post.getPhoto()));
	            return postForm;
	        }
	        return new PostForm();
	 }
	 
	 /**
	 * <h2> definePostPhoto</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param photo
	 * @return
	 * @return String
	 */
	private String definePostPhoto(String photo) {
	        String defPostPhoto = "";
	        File file = new File(servletContext.getRealPath(SLASH) + "resources\\img\\" + photo);
	        defPostPhoto = file.exists() ? photo : "images.jpg";
	        //defPostPhoto = file.exists() ? "images.jpg" : photo;
	        return defPostPhoto;
	    }

	/**
	 * <h2> getAllCategory </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<CategoryDto> getAllCategory() {
		 List<Category> allCategory = this.postDao.getAllCategory();
		 List<CategoryDto> category = new ArrayList<CategoryDto>();
		 for (Category cat : allCategory) {
			 CategoryDto categoryDto = new CategoryDto(cat);
			 categoryDto.setCategoryId(cat.getCategoryId());
			 categoryDto.setCategoryName(cat.getCategoryName());
			 categoryDto.setCreatedAt(cat.getCreatedAt());
			 category.add(categoryDto);
		 }
		return category;		 
	} 
	
	/**
	 * <h2> generateFileFromBase64</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param photo
	 * @return
	 * @return MultipartFile
	 */
	@SuppressWarnings("unused")
	private MultipartFile generateFileFromBase64(String photo) {
    	final String[] base64Array = photo.split(",");
        String dataUir, data;
        if (base64Array.length > 1) {
            dataUir = base64Array[0];
            data = base64Array[1];
        } else {
            dataUir = "data:image/jpg;base64";
            data = base64Array[0];
        }
        MultipartFile multipartFile = new Base64ToMultipartFile(data, dataUir);
		return multipartFile;
	}

	/**
	 * <h2> doSearchPhotoPath</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param postForm
	 * @param session
	 * @return
	 * @throws IOException
	 * @return String
	 */
	@SuppressWarnings("unused")
	private String doSearchPhotoPath(PostForm postForm, HttpSession session) throws IOException {
        String filepath = "";
        if (postForm.getFile() != null && !postForm.getFile().isEmpty()
                && CONTENT_TYPES.contains(postForm.getFile().getContentType())) {
            filepath = this.imageWrite(session, postForm.getFile(), postForm.getPhoto());
        }
        return filepath;
    }
   
	/**
	 * <h2> imageWrite</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param session
	 * @param file
	 * @param photo
	 * @return
	 * @throws IOException
	 * @return String
	 */
	private String imageWrite(HttpSession session, MultipartFile file, String photo) throws IOException {
        String path = session.getServletContext().getRealPath(SLASH);
        String empFullPath = path + IMAGE_STORAGE_PATH;
        if (photo != null) {
            String oldPhoto = empFullPath + SLASH + photo;
            File oldFile = new File(oldPhoto);
            oldFile.delete();
        }
        byte[] bytes = file.getBytes();
        File dir = new File(empFullPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String imageName = file.getOriginalFilename();
        File serverFile = new File(dir.getAbsolutePath() + File.separator + imageName);
        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
        stream.write(bytes);
        stream.close();
        return imageName;
    }
}
