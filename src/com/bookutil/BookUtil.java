/**
 * 
 */
package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class BookUtil {
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		// Bookstore Menu
		System.out.println("Hello, welcome to the bookstore!");
		do {
			System.out.println("1 - Add a book");
			System.out.println("2 - Search book by title");
			System.out.println("3 - Search book by author");
			System.out.println("4 - Display all books");
			System.out.println("5 - Exit");
			System.out.println("Please enter your choice:");
			choice = sc.nextInt();
			
			// Choices for menu
			switch(choice) {
			
			// Adding a book
			case 1:
				int count = 0;
				System.out.println("How many books do you want to add?");
				count = sc.nextInt();
				for(int i = 0; i < count; i++) {
					System.out.println("Please enter book ID. It must begin with a B");
					String bookID = sc.next();
					System.out.println("Please enter book title");
					String title = sc.next();
					System.out.println("Please enter book author");
					String author = sc.next();
					System.out.println("Please enter book category. Categories are:\nScience\nFiction\nTechnology\nOthers"
							+ "\nEnter your choice of category");
					String category = sc.next();
					System.out.println("Please enter book price. It must not be negative.");
					float price = sc.nextFloat();
					
					Book b = new Book(bookID, title, author, category, price);
					bs.addBook(b);
				}
				break;
				
			// Searching a book by the title
			case 2:
				System.out.println("Enter the book's title:");
				String title = sc.next();
				bs.searchByTitle(title);
				break;
				
			// Searching a book by the author
			case 3:
				System.out.println("Enter the book's author");
				String author = sc.next();
				bs.searchByAuthor(author);
				break;
				
			// Displaying all the books on the console
			case 4:
				bs.displayAll();
				break;
			}
		} while(choice != 5);
		
		sc.close();
	}
}
