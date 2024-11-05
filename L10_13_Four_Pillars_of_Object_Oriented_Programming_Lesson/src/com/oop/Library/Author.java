package com.oop.Library;

import java.util.ArrayList;

public class Author {
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Author(String name) {
		this.name = name;
	}
	
	public Author(String name, ArrayList<Book> books) {
		this.name = name;
		this.books = books;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBooks() {
		return this.books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
}
