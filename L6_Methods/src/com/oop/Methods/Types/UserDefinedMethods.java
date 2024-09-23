package com.oop.Methods.Types;

/**
 * This class demonstrates the use of user-defined methods in Java
 * 
 * User-defined methods are methods that are defined by the user and can be
 * called from other parts of the program
 * 
 * This class contains two user-defined methods:
 * - calculateAreaEllipse() - calculates the area of an ellipse given the major
 * and minor axes
 * - reverseString() - reverses a given string
 */
public class UserDefinedMethods {
	public static void main(String[] args) {
		float areaEllipse = calculateAreaEllipse(3, 4);
		System.out.println("Area of Ellipse: " + areaEllipse);

		String reversedString = reverseString("Hello, World!");
		System.out.println("Reversed String: " + reversedString);
	}

	/**
	 * This method calculates the area of an ellipse given the major and
	 * minor axes
	 * 
	 * @param {@code float} a - the major axis of the ellipse
	 * @param {@code float} b - the minor axis of the ellipse
	 * @return {@code float} area - the area of the ellipse
	 */
	public static float calculateAreaEllipse(float a, float b) {
		return (float) (Math.PI * a * b);
	}

	/**
	 * This method reverses a given string
	 * 
	 * @param {@code String} str - the string to be reversed
	 * @return {@code String} reversed - the reversed string
	 */
	public static String reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
}