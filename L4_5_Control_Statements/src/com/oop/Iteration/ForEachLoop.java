// ForEachLoop.java
package com.oop.Iteration;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(numbers[i]);
//		}

		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
