// Return.java
package com.oop.Jump;

public class Return {

	public static void main(String[] args) {
		int squareOfTwo = square(2);
		System.out.println("Square of 2 is: " + squareOfTwo);

		String s1 = "Hello";
		String s2 = "World";
		String s3 = concat(s1, s2);
		System.out.println("Concatenated String: " + s3);
	}

	public static int square(int n) {
		return n * n;
	}

	public static String concat(String s1, String s2) {
		return s1 + s2;
	}
}
