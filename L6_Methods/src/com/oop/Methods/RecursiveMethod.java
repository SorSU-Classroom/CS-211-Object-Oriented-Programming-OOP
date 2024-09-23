package com.oop.Methods;

/**
 * This class demonstrates the use of recursive methods in Java
 * 
 * A recursive method is a method that calls itself to solve a problem
 * 
 * In this example, the calculateFactorial() method calculates the factorial of
 * a number using recursion
 */
public class RecursiveMethod {
	public static void main(String[] args) {
		int factorial = calculateFactorial(5);
		System.out.println("Factorial of 5: " + factorial);
	}

	public static int calculateFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculateFactorial(n - 1);
		}
	}
}
