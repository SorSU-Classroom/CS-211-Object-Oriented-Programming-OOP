package com.oop.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("J.R.R. Tolkien");

        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(author1);
        authors.add(author2);

        Book book1 = new Book("Harry Potter", "Fantasy", authors);

        for (Author author : book1.getAuthors()) {
            System.out.println(author.getName());
        }
    }
}
