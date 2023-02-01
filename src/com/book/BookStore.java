/**
 * 
 */
package com.book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class BookStore {
	ArrayList<Book> books = new ArrayList<Book>();
	
	// Add a book
	public void addBook(Book b) {
			validateInvalidBook(b);
			books.add(b);
	}
	
	// Handling Invalid Book Exception
	public void validateInvalidBook(Book book) {
		if((book.getBookID().charAt(0) != 'B')) {
			throw new InvalidBookException("Book ID must start with a B");
		} else if(book.getPrice() < 0) {
			throw new InvalidBookException("Book price must not be negative");
		} else if(!((book.getCategory().equalsIgnoreCase("Science")) ||
				(book.getCategory().equalsIgnoreCase("Fiction")) ||
				(book.getCategory().equalsIgnoreCase("Technology")) ||
				(book.getCategory().equalsIgnoreCase("Others")))) {
			throw new InvalidBookException("Book category must be Science, Fiction, Technoloy, or Others");
		}
	}
	
	// Search book by title
	public void searchByTitle(String title) {
		for(int i = 0; i < books.size(); i++) {
			if(title.equalsIgnoreCase(books.get(i).getTitle())) {
				System.out.println("This books exists:\n" + books.get(i).toString());
			}
		}
	}
	
	// Search book by author
	public void searchByAuthor(String author) {
		System.out.println("Here's the book(s) written by the author:");
		for(int i = 0; i < books.size(); i++) {
			if(author.equalsIgnoreCase(books.get(i).getAuthor())) {
				System.out.println(books.get(i).toString());
				System.out.println();
			}
		}
	}
	
	// Display all books
	public void displayAll() {
		for(Book b: books) {
		System.out.println(b.toString());
			System.out.println();
		}
	}
}
