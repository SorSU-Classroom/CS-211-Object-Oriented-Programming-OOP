package com.oop.Methods;

/**
 * This class demonstrates method overloading in Java
 * 
 * Method overloading is a feature that allows a class to have multiple methods
 * with the same name but different parameters
 * 
 * In this example, the add() method is overloaded to accept different types and
 * numbers of parameters
 * - add(int a, int b) - adds two integers
 * - add(int a, int b, int c) - adds three integers
 * - add(double a, double b) - adds two doubles
 * 
 * The method to be called is determined by the number and types of arguments
 * passed to it
 */
public class MethodOverloading {
	public static void main(String[] args) {
		int sum1 = add(1, 2);
		int sum2 = add(1, 2, 3);
		double sum3 = add(1.5, 2.5);

		System.out.println("Sum of 1 and 2: " + sum1);
		System.out.println("Sum of 1, 2, and 3: " + sum2);
		System.out.println("Sum of 1.5 and 2.5: " + sum3);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static double add(double a, double b) {
		return a + b;
	}
}