// BreakLoop.java
package com.oop.Jump;

public class BreakLoop {
	public static void main(String[] args) {
		int breakIndicator = 0;

		for (int i = 1; i <= 5; i++) {
			breakIndicator = i;
			System.out.println("Iteration No.: " + i);

			if (i >= 3) {
				break;
			}

			System.out.println("Continue Iteration...");
		}

		System.out.println("Loop Exited at Iteration: " + breakIndicator);
	}
}
