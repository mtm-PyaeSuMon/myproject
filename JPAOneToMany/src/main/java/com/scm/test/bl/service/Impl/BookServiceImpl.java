package com.scm.test.bl.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.test.bl.service.BookService;
import com.scm.test.persistence.entity.Book;
import com.scm.test.persistence.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
		@Autowired
	 	private final BookRepository bookRepository;

	    @Autowired
	    public BookServiceImpl(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    @Override
	    public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }

	    @Override
	    public Book getBookById(Long id) {
	        return bookRepository.findById(id).orElse(null);
	    }

	    @Override
	    public void saveBook(Book book) {
	        bookRepository.save(book);
	    }

	    @Override
	    public void updateBook(Long id, Book book) {
	        Book existingBook = bookRepository.findById(id).orElse(null);
	        if (existingBook != null) {
	            existingBook.setTitle(book.getTitle());
	            existingBook.setAuthor(book.getAuthor());
	            bookRepository.save(existingBook);
	        }
	    }

	    @Override
	    public void deleteBook(Long id) {
	        bookRepository.deleteById(id);
	    }

}
