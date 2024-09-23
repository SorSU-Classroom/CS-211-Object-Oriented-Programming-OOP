package com.oop.Methods.Types;

/**
 * This class demonstrates the use of predefined methods in Java
 * 
 * Predefined methods are methods that are already defined in Java and can be
 * used without having to define them
 * 
 * The Math class contains methods for performing basic numeric operations such
 * as:
 * - Math.sqrt() - returns the square root of a number
 * - Math.pow() - returns the value of the first argument raised to the power of
 * the second argument
 * - Math.abs() - returns the absolute value of a number
 * 
 * The String class contains methods for performing operations on strings such
 * as:
 * - str.length() - returns the length of a string
 * - str.toUpperCase() - returns a string in uppercase
 * - str.toLowerCase() - returns a string in lowercase
 */
public class PredefinedMethods {

	public static void main(String[] args) {
		// Math class methods
		double squareRoot = Math.sqrt(16);
		double power = Math.pow(2, 3);
		double absoluteValue = Math.abs(-5);

		// String class methods
		String str = "Hello, World!";
		int length = str.length();
		String upperCase = str.toUpperCase();
		String lowerCase = str.toLowerCase();

		System.out.println("Square root: " + squareRoot);
		System.out.println("Power: " + power);
		System.out.println("Absolute value: " + absoluteValue);
		System.out.println("String length: " + length);
		System.out.println("Uppercase: " + upperCase);
		System.out.println("Lowercase: " + lowerCase);
	}
}