// NestedIfElseStatement.java
package com.oop.ConditionalDecisionMaking;

public class NestedIfElseStatement {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		if (x > 0) {
			if (y > 0) {
				System.out.println("Both numbers are positive.");
			} else {
				System.out.println("The first number is positive, but the second number is not positive.");
			}
		} else {
			System.out.println("The first number is not positive.");
		}
	}
}
