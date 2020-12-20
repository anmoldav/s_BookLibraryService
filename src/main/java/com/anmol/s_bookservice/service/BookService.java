package com.anmol.s_bookservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anmol.s_bookservice.dto.Book;
import com.anmol.s_bookservice.dto.Library;
import com.anmol.s_bookservice.repo.BookRepository;
import com.anmol.s_bookservice.repo.LIbraryRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	@Autowired
	LIbraryRepository libraryRepository;

	public Book addBook(Book book) {
		Library lab = new Library();
		Optional<Library> optionallab = libraryRepository.findById(book.getLibray().getId());
		

		lab.setName(book.getLibray().getName());
		lab.setBooks(book.getLibray().getBooks());
		book.setLibray(lab);
		return bookRepository.save(book);

	}

	public List<Book> getAllBook() {
		return bookRepository.findAll();

	}
	
	
	public Book  editBook(Book book) {
		return bookRepository.save(book);
	}

}
