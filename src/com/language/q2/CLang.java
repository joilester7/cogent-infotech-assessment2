/**
 * 
 */
package com.language.q2;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */

// CLang Thread
public class CLang extends Thread implements Language {

	@Override
	public void showMessage() {
		System.out.println("C program is running");
		
	}
	
	@Override
	public void run() {
		showMessage();
	}

}
