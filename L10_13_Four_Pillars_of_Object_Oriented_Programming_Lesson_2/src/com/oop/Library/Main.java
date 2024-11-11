package com.oop.Library;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Author author1 = new Author("Edward");
		Author author2 = new Author("Mark");
		
		Book book1 = new Book("The Origins of Edward", "Fantasy", new ArrayList<Author>());
		
		author1.setBook(book1);
		author2.setBook(book1);
		
		ArrayList<Author> authors = new ArrayList<Author>();
		authors.add(author1);
		authors.add(author2);
		
		book1.setAuthors(authors);
		
		System.out.println("Book Name: " + book1.getTitle());
		
		System.out.println("Authors:");
		for(Author author: book1.getAuthors()) {
			System.out.println(author.getName());
		}
	}
}
