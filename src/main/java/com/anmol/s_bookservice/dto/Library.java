package com.anmol.s_bookservice.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_library")
public class Library {
   @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
    @OneToMany(mappedBy = "libray")
	List<Book> books= new ArrayList<Book>();
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	

	public Library() {
	}

	public Library(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	}

}
