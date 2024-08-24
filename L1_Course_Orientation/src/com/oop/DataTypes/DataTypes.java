/**
 * Data Types in Java
 * 
 * Data types specify the different sizes and values that can be stored in the
 * variable. There are two types of data types in Java:
 * - Primitive data types: These data types are predefined by the language and
 * are named by a reserved keyword. They are used to store simple values.
 * - Non-primitive data types: These data types are not predefined by the
 * language and are created by the programmer. They are also known as reference
 * types because they refer to objects.
 * 
 * References:
 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 * @see https://www.javatpoint.com/java-data-types
 */
package com.oop.DataTypes;

// Import Common Non-Primitive Data Types
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataTypes {

	public static void main(String[] args) {
		/**
		 * Primitive Data Types
		 * 
		 * Primitive data types are predefined by the language and are named by a
		 * reserved keyword. They are used to store simple values.
		 * 
		 * There are eight primitive data types in Java:
		 * - byte: It is a 1-byte signed integer.
		 * - short: It is a 2-byte signed integer.
		 * - int: It is a 4-byte signed integer.
		 * - long: It is an 8-byte signed integer.
		 * - float: It is a 4-byte floating-point number.
		 * - double: It is an 8-byte floating-point number.
		 * - char: It is a 2-byte Unicode character.
		 * - boolean: It represents true or false values.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n\n--- Primitive Data Types ---");

		/**
		 * byte
		 * 
		 * The byte data type is an 8-bit signed integer. It has a minimum value of -128
		 * and a maximum value of 127 (inclusive).
		 * 
		 * The byte data type is used to save space in large arrays, mainly in place of
		 * integers, since a byte is four times smaller than an int.
		 * 
		 * Syntax:
		 * - byte variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- byte ---");
		byte byteVariable = 100;
		System.out.println("byteVariable: " + byteVariable);

		/**
		 * short
		 * 
		 * The short data type is a 16-bit signed integer. It has a minimum value of
		 * -32,768 and a maximum value of 32,767 (inclusive).
		 * 
		 * The short data type can also be used to save memory as byte data type. A
		 * short
		 * is 2 times smaller than an int.
		 * 
		 * Syntax:
		 * - short variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- short ---");
		short shortVariable = 1000;
		System.out.println("shortVariable: " + shortVariable);

		/**
		 * int
		 * 
		 * The int data type is a 32-bit signed integer. It has a minimum value of
		 * -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive).
		 * 
		 * The int data type is generally used as the default data type for integral
		 * values unless there is a concern about memory.
		 * 
		 * Syntax:
		 * - int variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- int ---");
		int intVariable = 100000;
		System.out.println("intVariable: " + intVariable);

		/**
		 * long
		 * 
		 * The long data type is a 64-bit signed integer. It has a minimum value of
		 * -9,223,372,036,854,775,808 and a maximum value of 9,223,372,036,854,775,807
		 * (inclusive).
		 * 
		 * The long data type is used when you need a range of values more than those
		 * provided by int.
		 * 
		 * Syntax:
		 * - long variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- long ---");
		long longVariable = 100000000L;
		System.out.println("longVariable: " + longVariable);

		/**
		 * float
		 * 
		 * The float data type is a single-precision 32-bit IEEE 754 floating-point. It
		 * should never be used for precise values, such as currency.
		 * 
		 * Syntax:
		 * - float variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- float ---");
		float floatVariable = 234.5f;
		System.out.println("floatVariable: " + floatVariable);

		/**
		 * double
		 * 
		 * The double data type is a double-precision 64-bit IEEE 754 floating-point. It
		 * should never be used for precise values, such as currency.
		 * 
		 * Syntax:
		 * - double variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- double ---");
		double doubleVariable = 123.4;
		System.out.println("doubleVariable: " + doubleVariable);

		/**
		 * char
		 * 
		 * The char data type is a single 16-bit Unicode character. It has a minimum
		 * value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535
		 * inclusive).
		 * 
		 * Syntax:
		 * - char variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- char ---");
		char charVariable = 'A';
		System.out.println("charVariable: " + charVariable);

		/**
		 * boolean
		 * 
		 * The boolean data type represents one bit of information, but its "size" isn't
		 * precisely defined. It can only take the values true or false.
		 * 
		 * Syntax:
		 * - boolean variable_name = value;
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- boolean ---");
		boolean booleanVariable = true;
		System.out.println("booleanVariable: " + booleanVariable);

		/**
		 * Non-Primitive Data Types
		 * 
		 * Non-primitive data types are not predefined by the language and are created
		 * by
		 * the programmer. They are also known as reference types because they refer to
		 * objects.
		 * 
		 * There are two types of non-primitive data types:
		 * - Reference data types: Reference variables are created using defined
		 * classes. They are used to access objects.
		 * - Array data types: Array data types are used to store multiple values in a
		 * single variable.
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n\n--- Non-Primitive Data Types ---");

		/**
		 * Reference Data Types
		 * 
		 * Reference variables are created using defined classes. They are used to
		 * access
		 * objects.
		 * 
		 * Syntax:
		 * - class_name variable_name = new class_name();
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- Reference Data Types ---");
		String stringVariable = new String("Hello, World!");

		// ArrayList
		List<String> arrayListVariable = new ArrayList<String>();
		arrayListVariable.add("Apple");
		arrayListVariable.add("Banana");

		// HashMap
		Map<String, String> hashMapVariable = new HashMap<String, String>();
		hashMapVariable.put("Key1", "Value1");
		hashMapVariable.put("Key2", "Value2");

		// HashSet
		Set<String> hashSetVariable = new HashSet<String>();
		hashSetVariable.add("Apple");
		hashSetVariable.add("Banana");

		// LinkedList
		List<String> linkedListVariable = new LinkedList<String>();
		linkedListVariable.add("Apple");
		linkedListVariable.add("Banana");

		// Queue
		Queue<String> queueVariable = new LinkedList<String>();
		queueVariable.add("Apple");
		queueVariable.add("Banana");

		// Stack
		Stack<String> stackVariable = new Stack<String>();
		stackVariable.push("Apple");
		stackVariable.push("Banana");

		// TreeMap
		Map<String, String> treeMapVariable = new TreeMap<String, String>();
		treeMapVariable.put("Key1", "Value1");
		treeMapVariable.put("Key2", "Value2");

		// TreeSet
		Set<String> treeSetVariable = new TreeSet<String>();
		treeSetVariable.add("Apple");
		treeSetVariable.add("Banana");

		System.out.println("String: " + stringVariable);
		System.out.println("Array List: " + arrayListVariable);
		System.out.println("Hash Map: " + hashMapVariable);
		System.out.println("Hash Set: " + hashSetVariable);
		System.out.println("Linked List: " + linkedListVariable);
		System.out.println("Queue: " + queueVariable);
		System.out.println("Stack: " + stackVariable);
		System.out.println("Tree Map: " + treeMapVariable);
		System.out.println("Tree Set: " + treeSetVariable);

		/**
		 * Array Data Types
		 * 
		 * Array data types are used to store multiple values in a single variable.
		 * 
		 * Syntax:
		 * - data_type[] array_name = new data_type[size];
		 * 
		 * References:
		 * 
		 * @see https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		 * @see https://www.javatpoint.com/java-data-types
		 */
		System.out.println("\n--- Array Data Types ---");
		int[] intArrayVariable = new int[5];
		intArrayVariable[0] = 10;
		intArrayVariable[1] = 20;
		intArrayVariable[2] = 30;
		intArrayVariable[3] = 40;
		intArrayVariable[4] = 50;

		String[] stringArrayVariable = new String[2];
		stringArrayVariable[0] = "Hello";
		stringArrayVariable[1] = "World";

		System.out.print("Int Array: ");
		for (int i = 0; i < intArrayVariable.length; i++) {
			System.out.print(intArrayVariable[i] + " ");
		}
		System.out.println();

		System.out.print("String Array: ");
		for (int i = 0; i < stringArrayVariable.length; i++) {
			System.out.print(stringArrayVariable[i] + " ");
		}
		System.out.println();
	}
}
