/**
 * 
 */
package com.book;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class Book {
	// Members
	private String bookID;
	private String title;
	private String author;
	private String category;
	private float price;
	

	// Parameterized Constructor
	public Book(String bookID, String title, String author, String category, float price) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// Getters and Setters
	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	// toString Method
	@Override
	public String toString() {
		return "Book ID: " + bookID + "\nBook Title: " + title +
				"\nBook Author: " + author + "\nBook Category: " + category +
				"\nBook Price: " + price;
	}
	
}
