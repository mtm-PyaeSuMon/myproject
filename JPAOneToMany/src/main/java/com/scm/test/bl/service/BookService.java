package com.scm.test.bl.service;

import java.util.List;

import com.scm.test.persistence.entity.Book;

public interface BookService {
	List<Book> getAllBooks();
	
    Book getBookById(Long id);
    
    void saveBook(Book book);
    
    void updateBook(Long id, Book book);
    
    void deleteBook(Long id);

}
