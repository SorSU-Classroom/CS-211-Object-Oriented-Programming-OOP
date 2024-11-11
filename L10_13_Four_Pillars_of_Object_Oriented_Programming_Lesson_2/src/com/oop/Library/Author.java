package com.oop.Library;

public class Author {
	private String name;
	private Book book;
	
	public Author(String name) {
		this.name = name;
	}
	
	public Author(String name, Book book) {
		this.name = name;
		this.book = book;
	}
	
	public String getName( ) {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Book getBook() {
		return this.book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
}
