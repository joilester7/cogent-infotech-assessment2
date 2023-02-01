/**
 * 
 */
package com.book;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */
public class InvalidBookException extends RuntimeException {
	private String errorMessage;
	public InvalidBookException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
}
