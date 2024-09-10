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

		// one: {
		// System.out.println("This is the first level!");

		// two: {
		// System.out.println("This is the second level!");

		// three: {
		// System.out.println("This is the third level!");

		// if (true) {
		// break two;
		// }

		// System.out.println("This is the end of third level!");
		// }

		// System.out.println("This is the end of second level!");
		// }

		// System.out.println("This is the end of first level!");
		// }
	}
}
