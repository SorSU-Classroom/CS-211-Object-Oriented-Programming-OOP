package com.oop.Methods.ParametersAndArguments;

public class Hypotenuse {
	public static void main(String[] args) {
		double side1 = 3.0;
		double side2 = 4.0;

		/**
		 * Calculate the hypotenuse of a right triangle given the two sides
		 * 
		 * The value being passed to the method is called an argument
		 */
		double hypotenuse = calculateHypotenuse(side1, side2);
		System.out.println("The hypotenuse is: " + hypotenuse);
	}

	/**
	 * This method calculates the hypotenuse of a right triangle given the two sides
	 * 
	 * The values which the method expects are called parameters
	 * 
	 * @param {@code double} side1 - the first side of the right triangle
	 * @param {@code double} side2 - the second side of the right triangle
	 * @return {@code double} hypotenuse - the hypotenuse of the right triangle
	 */
	public static double calculateHypotenuse(double side1, double side2) {
		double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
		return hypotenuse;
	}
}