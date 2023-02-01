/**
 * 
 */
package com.language.q2;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */

// JavaLang Thread
public class JavaLang extends Thread implements Language{

	@Override
	public void showMessage() {
		System.out.println("Java Program is running");
		
	}
	
	@Override
	public void run() {
		showMessage();
	}

}
