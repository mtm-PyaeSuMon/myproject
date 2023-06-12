package com.scm.test.bl.service;

import java.util.List;

import com.scm.test.persistence.entity.Author;

public interface AuthorService {
	 	List<Author> getAllAuthors();
	 	
	    Author getAuthorById(Long id);
	    
	    void saveAuthor(Author author);
	    
	    void updateAuthor(Long id, Author author);
	    
	    void deleteAuthor(Long id);

}
