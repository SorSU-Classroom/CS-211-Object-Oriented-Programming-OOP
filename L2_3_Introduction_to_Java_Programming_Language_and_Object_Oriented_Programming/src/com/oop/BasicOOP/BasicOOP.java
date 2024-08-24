/**
 * Basics of Object Oriented Programming
 * 
 * Object Oriented Programming (OOP) is a programming paradigm that relies on
 * the concept of classes and objects. It is used to structure a software program
 * into simple, reusable pieces of code blueprints (usually called classes),
 * which are used to create individual instances of objects.
 * 
 * The main principles of OOP are:
 * - Encapsulation
 * - Inheritance
 * - Polymorphism
 * - Abstraction
 * 
 * Encapsulation:
 * Encapsulation is the mechanism that binds together code and the data it manipulates,
 * and keeps both safe from outside interference and misuse. One way to think about
 * encapsulation is as a protective wrapper that prevents the code and data from being
 * arbitrarily accessed by other code defined outside the wrapper.
 * 
 * Inheritance:
 * Inheritance is a mechanism in which one object acquires all the properties and behaviors
 * of a parent object. It allows a class to inherit the properties and methods of another class.
 * 
 * Polymorphism:
 * Polymorphism is the ability of an object to take on many forms. The most common use of
 * polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
 * 
 * Abstraction:
 * Abstraction is a concept of object-oriented programming that allows hiding the implementation
 * details and showing only the functionality to the user. It helps to reduce programming complexity
 * and effort.
 * 
 * In Java, everything is an object. Java is an object-oriented programming language. Java is
 * platform-independent. Java is simple and easy to learn. Java is secure. Java is robust.
 * Java is a high performance. Java is multithreaded. Java is interpreted. Java is distributed.
 * Java is dynamic.
 * 
 * Reference:
 * @see https://www.tutorialspoint.com/java/java_oops_concepts.htm
 * @see https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
 * @see https://www.javatpoint.com/java-oops-concepts
 */
package com.oop.BasicOOP;

public class BasicOOP {

	public static void main(String[] args) {
		Animal animal1 = new Animal(
				"Dog",
				"Canis lupus familiaris",
				5,
				20,
				"Brown",
				"Domestic",
				0,
				0);
	}
}
