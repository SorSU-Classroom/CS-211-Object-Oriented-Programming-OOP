package com.oop.Methods;

public class CalculateHypotenuse {
	public static void main(String[] args) {
		double side1 = 3;
		double side2 = 4;
		
		double hypotenuse = calculateHypotenuse(side1, side2);
		System.out.println("c = " + hypotenuse);
	}
	
	public static double calculateHypotenuse(double a, double b) {
		double sqrA = a * a;
		double sqrB = b * b;
		double sum = sqrA + sqrB;
		double c = Math.sqrt(sum);
		
		return c;
	}
}
