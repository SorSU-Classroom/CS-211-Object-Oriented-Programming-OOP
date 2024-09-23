package com.oop.Methods;

import com.oop.Person;

/**
 * This class demonstrates the use of static methods in Java
 * 
 * Static methods are methods that belong to the class itself, rather than to
 * any instance of the class
 * 
 * Static methods can be called using the class name, without the need to create
 * an instance of the class
 * 
 * In this example, the Person class contains a static method getCountPersons()
 * that returns the number of Person objects created
 */
public class StaticMethod {
	public static void main(String[] args) {
		Person person1 = new Person("Alice", 25);
		Person person2 = new Person("Bob", 30);

		int countPersons = Person.getCountPersons();
		System.out.println("Number of Persons: " + countPersons);
	}
}
