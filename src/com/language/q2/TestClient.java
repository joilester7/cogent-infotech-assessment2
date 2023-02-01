/**
 * 
 */
package com.language.q2;

import java.util.Scanner;

/**
 * @author: Joi
 * @date: Feb 1, 2023
 */

// Multithreading Example
public class TestClient extends Thread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JavaLang jl = new JavaLang();
		CLang cl = new CLang();
		System.out.println("Please enter your favorite language: Java or C");
		String result = sc.next();
		
		if(result.equals("Java")) {
			jl.setPriority(MAX_PRIORITY);
		} else if(result.equals("C")) {
			cl.setPriority(MAX_PRIORITY);
		} else {
			System.out.println("Invalid language");
		}
		
		jl.start();
		cl.start();
	}
}
