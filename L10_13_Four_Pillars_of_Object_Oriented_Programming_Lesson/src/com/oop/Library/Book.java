package com.oop.Library;

import java.util.ArrayList;

public class Book {
	private String title;
	private String genre;
	private ArrayList<Author> authors;

	public Book(
			String title,
			String genre,
			ArrayList<Author> authors) {
		this.title = title;
		this.genre = genre;
		this.authors = authors;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public ArrayList<Author> getAuthors() {
		return this.authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public void removeAuthor(Author author) {
		authors.remove(author);
	}
}
