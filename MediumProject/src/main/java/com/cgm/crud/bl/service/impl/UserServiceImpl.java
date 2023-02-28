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

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cgm.crud.bl.dto.UserDto;
import com.cgm.crud.bl.service.UserService;
import com.cgm.crud.common.util.Base64ToMultipartFile;
import com.cgm.crud.persistence.dao.UserDao;
import com.cgm.crud.persistence.entity.Login;
import com.cgm.crud.persistence.entity.User;
import com.cgm.crud.web.form.LoginForm;
import com.cgm.crud.web.form.UserForm;

/**
 * <h2> UserServiceImpl Class</h2>
 * <p>
 * Process for Displaying UserServiceImpl
 * </p>
 * 
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	 /**
	 * <h2> userDao</h2>
	 * <p>
	 * userDao
	 * </p>
	 */
	@Autowired
	    private UserDao userDao;
	 
	 /**
	 * <h2> passwordEncoder</h2>
	 * <p>
	 * passwordEncoder
	 * </p>
	 */
	@Autowired
	    private BCryptPasswordEncoder passwordEncoder;
	 
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
	 * <h2> addUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param userForm
	 */
	@Override
	public void addUser(UserForm userForm) {
		User user=new User();
		user.setName(userForm.getName());
		user.setEmail(userForm.getEmail());
		user.setBio(userForm.getBio());
		user.setPassword(passwordEncoder.encode(userForm.getPassword()));
		user.setPhoto(userForm.getPhoto());
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());
		userDao.addUser(user);
		
	}
	
	 /**
	 * <h2> doGetUserByEmail </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param email
	 * @return
	 */
	@Override
	    public User doGetUserByEmail(String email) {
	    	User user = this.userDao.dbGetUserByEmail(email);
	    	return user;
	    }
	
	/**
	 * <h2> getAllUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @return
	 */
	@Override
	public List<UserDto> getAllUser(){
		 List<User> allUser = userDao.getAllUser();
		 
		 List<UserDto> user = new ArrayList<UserDto>();
		 for (User user1 : allUser) {
			 UserDto userDto = new UserDto(user1);
			 userDto.setId(user1.getId());
			 userDto.setName(user1.getName());
			 userDto.setEmail(user1.getEmail());
			 userDto.setBio(user1.getBio());
			 userDto.setPassword(user1.getPassword());
			 userDto.setPhoto(user1.getPhoto());
			 userDto.setCreatedAt(user1.getCreatedAt());
			 userDto.setUpdatedAt(user1.getUpdatedAt());
			 user.add(userDto);
		 }
		return user;
	}
	
	/**
	 * <h2> findByEmail </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param email
	 * @return
	 */
	@Override
	public UserDto findByEmail(String email) {
        User user = userDao.findByEmail(email);

        if (user == null) {
            return null;
        }
        UserDto userdto = new UserDto(user);
        return userdto;
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
 	public User getById(int id){
        return userDao.getUserById(id);
    }
	
	/**
	 * <h2> updateUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param user
	 */
	@Override
	 public void updateUser(User user) {
		userDao.updateUser(user);
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
	}
	
	/**
	 * <h2> deleteUser </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param id
	 */
	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
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
	public String rebasePhoto(UserForm file) {
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
	 * <h2> doGetUserById </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param Id
	 * @return
	 */
	@Override
	    public UserForm doGetUserById(int Id) {
	        User user = this.userDao.getUserById(Id);
	        if (user != null) {
	            UserForm userForm = new UserForm(user);
	            userForm.setPhoto(this.defineUserPhoto(user.getPhoto()));
	            return userForm;
	        }
	        return new UserForm();
	    }
	  
	  /**
	 * <h2> defineUserPhoto</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param photo
	 * @return
	 * @return String
	 */
	private String defineUserPhoto(String photo) {
	        String defUserPhoto = "";
	        File file = new File(servletContext.getRealPath(SLASH) + "resources\\img\\" + photo);
	        defUserPhoto = file.exists() ? photo : "images.jpg";
	        return defUserPhoto;
	    }
	  
	   /**
	 * <h2> login </h2>
	 * <p>
	 * 
	 * </p>
	 * 
	 * @param loginForm
	 */
	public void login(LoginForm loginForm) {
		     Login login=new Login();
		     login.setEmail(loginForm.getEmail());
		     login.setPassword(passwordEncoder.encode(loginForm.getPassword()));
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
	    	final String[] base64Array = photo.split("");
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
	 * @param userForm
	 * @param session
	 * @return
	 * @throws IOException
	 * @return String
	 */
	@SuppressWarnings("unused")
	private String doSearchPhotoPath(UserForm userForm, HttpSession session) throws IOException {
	        String filepath = "";
	        if (userForm.getFile() != null && !userForm.getFile().isEmpty()
	                && CONTENT_TYPES.contains(userForm.getFile().getContentType())) {
	            filepath = this.imageWrite(session, userForm.getFile(), userForm.getPhoto());
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
