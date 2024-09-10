// BreakGoto.java
package com.oop.Jump;

public class BreakGoto {
	public static void main(String[] args) {
		boolean breakIndicator = true;

		first: {
			second: {
				third: {
					System.out.println("Before the break statement");
					if (breakIndicator)
						break second;
					System.out.println("This won't execute.");
				}
				System.out.println("This won't execute.");
			}

			System.out.println("This is after second block.");
		}
	}
}
