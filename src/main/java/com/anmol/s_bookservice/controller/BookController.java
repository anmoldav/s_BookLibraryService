package com.anmol.s_bookservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anmol.s_bookservice.dto.Book;
import com.anmol.s_bookservice.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
@Autowired
BookService bookService;
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book){
		Book book1= bookService.addBook(book);
		return new  ResponseEntity<>(book1,HttpStatus.OK);
	}
	
	
	@GetMapping
	@RequestMapping("/get-book")
	public ResponseEntity<List<Book>>getAllBook(){
		List<Book> book=bookService.getAllBook();
		return new ResponseEntity<>(book,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Book> updateBook(@RequestBody Book book){
		Book book1= bookService.editBook(book);
		return new ResponseEntity<>(book1,HttpStatus.OK);
	}
	
	
	
	
	
	
}
