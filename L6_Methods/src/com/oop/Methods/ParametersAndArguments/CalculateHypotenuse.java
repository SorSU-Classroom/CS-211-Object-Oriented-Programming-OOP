package com.oop.Methods.ParametersAndArguments;

public class CalculateHypotenuse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double side1 = 3;
		// double side2 = 4;
		//
		// double hypotenuse = getHypotenuse(side1, side2);
		//
		// System.out.println("The hypotenuse is: " + hypotenuse);
		//
		int n1 = 5;
		int n2 = 11;

		int sum = add(n1, n2);

		System.out.println(n1 + " + " + n2 + " = " + sum);
		
		double n3 = 7.0;
		double n4 = 10.0;
		
		double sum2 = add(n3, n4);

		System.out.println(n3 + " + " + n4 + " = " + sum2);
	}

	public static double getHypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}
}
