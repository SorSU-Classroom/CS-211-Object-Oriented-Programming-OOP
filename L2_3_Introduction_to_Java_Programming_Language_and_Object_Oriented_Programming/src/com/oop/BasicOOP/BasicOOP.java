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
		/**
		 * In this example, we create a string variable and initialize it with a value.
		 * 
		 * The process of creating a variable is called declaration, and the process of
		 * assigning a value to the variable is called initialization.
		 */
		System.out.println("\n\n--- Declaration and Initialization ---");

		// Declaration
		int num;

		// Initialization
		num = 2;

		System.out.println(num);

		/**
		 * In this example, we create an object of the `Animal` class and initialize it
		 * with some values.
		 * 
		 * An object is an instance of a class. When a class is defined, no memory is
		 * allocated, but when it is instantiated (i.e., an object is created), memory
		 * is
		 * allocated. Instantiation is the process of creating an object from a class.
		 * 
		 * The syntax for creating an object in Java is:
		 * 
		 * <pre>
		 * ClassName objectName = new ClassName();
		 * </pre>
		 * 
		 * References:
		 * 
		 * @see https://www.w3schools.com/java/java_classes.asp
		 * @see https://www.w3schools.com/java/java_class_attributes.asp
		 * @see https://www.w3schools.com/java/java_class_methods.asp
		 * @see https://www.w3schools.com/java/java_objects.asp
		 * @see https://www.w3schools.com/java/java_constructors.asp
		 */
		System.out.println("\n\n--- Object Creation and Initialization ---");
		Animal animal = new Animal(
				"Dog", "Canis lupus familiaris", 5, 20, "Brown", "Domestic", 0, 0);

		System.out.println("Name: " + animal.name);
		System.out.println("Species: " + animal.species);
		System.out.println("Age: " + animal.age);

		System.out.println("Location before moving: (" + animal.x + ", " + animal.y + ")");
		animal.move(5, 10);
		System.out.println("Location after moving: (" + animal.x + ", " + animal.y + ")");

		/**
		 * Inheritance
		 * 
		 * Inheritance is a mechanism in which one object acquires
		 * all the properties and behaviors of a parent object. It allows
		 * a class to inherit the properties and methods of another class.
		 * 
		 * The class which inherits the properties and methods is known as
		 * the child class, and the class whose properties and methods are
		 * inherited is known as the parent class.
		 * 
		 * References:
		 * 
		 * @see https://www.tutorialspoint.com/java/java_inheritance.htm
		 * @see https://www.geeksforgeeks.org/inheritance-in-java/
		 * @see https://www.javatpoint.com/inheritance-in-java
		 * @see https://www.w3schools.com/java/java_inheritance.asp
		 */

		/**
		 * In this example, we create objects of the `Mammal` and `Bird`
		 * classes and initialize them with some values.
		 */
		System.out.println("\n\n--- Inheritance ---");

		Mammal mammal = new Mammal(
				"Cat", "Felis catus", 3, 10, "White", "Domestic", 0, 0, "Short", true, true, true);
		Bird bird = new Bird(
				"Eagle", "Aquila chrysaetos", 10, 15, "Brown", "Wild", 0, 0, 2, true, true, true);

		System.out.println("Mammal Name: " + mammal.name);
		System.out.println("Mammal Species: " + mammal.species);
		System.out.println("Mammal Age: " + mammal.age);

		System.out.println();

		System.out.println("Bird Name: " + bird.name);
		System.out.println("Bird Species: " + bird.species);
		System.out.println("Bird Age: " + bird.age);

		/**
		 * Polymorphism
		 * 
		 * Polymorphism is the ability of an object to take on many forms.
		 * The most common use of polymorphism in OOP occurs when a parent
		 * class reference is used to refer to a child class object.
		 * 
		 * Polymorphism allows methods to do different things based on the
		 * object that they are acting upon. It is a powerful feature of OOP
		 * that allows code reusability and flexibility.
		 * 
		 * References:
		 * 
		 * @see https://www.tutorialspoint.com/java/java_polymorphism.htm
		 * @see https://www.geeksforgeeks.org/polymorphism-in-java/
		 * @see https://www.w3schools.com/java/java_polymorphism.asp
		 * @see https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
		 */
		System.out.println("\n\n--- Polymorphism ---");
		mammal.makeSound();
		bird.makeSound();

		/**
		 * Encapsulation
		 * 
		 * Encapsulation is the mechanism that binds together code and the
		 * data it manipulates, and keeps both safe from outside interference
		 * and misuse. One way to think about encapsulation is as a protective
		 * wrapper that prevents the code and data from being arbitrarily accessed
		 * by other code defined outside the wrapper.
		 * 
		 * In this example, we demonstrate encapsulation by accessing the private
		 * member variables of the `Dog` class using public getter and setter
		 * methods.
		 * 
		 * References:
		 * 
		 * @see https://www.tutorialspoint.com/java/java_encapsulation.htm
		 * @see https://www.geeksforgeeks.org/encapsulation-in-java/
		 * @see https://www.w3schools.com/java/java_encapsulation.asp
		 * @see https://www.javatpoint.com/encapsulation
		 */
		System.out.println("\n\n--- Encapsulation ---");

		Dog dog = new Dog("Buddy", "Golden Retriever", 2, 30, "Golden", "Domestic", 0, 0, "Golden", true, true, true,
				"Golden Retriever", "Woof!", true, true);

		System.out.println("Dog Name: " + dog.name);
		System.out.println("Dog Species: " + dog.species);
		System.out.println("Dog Age: " + dog.age);

		System.out.println("Bark sound when playing: " + dog.getBarkingSound());
		dog.setBarkingSound("Woof woof woof!");
		System.out.println("Bark sound when angry: " + dog.getBarkingSound());

		/**
		 * Abstraction
		 * 
		 * Abstraction is a concept of object-oriented programming that allows
		 * hiding the implementation details and showing only the functionality
		 * to the user. It helps to reduce programming complexity and effort.
		 * 
		 * An abstract class is a class that cannot be instantiated. It is used
		 * to provide a common interface for all the classes that inherit from it.
		 * Abstract classes can have abstract methods that are declared but not
		 * implemented. These methods must be implemented by the child classes
		 * that inherit from the abstract class.
		 * 
		 * In this example, we create an abstract class `Reptile` with abstract
		 * methods and demonstrate abstraction by creating a concrete class `Snake`
		 * that extends the `Reptile` class and implements the abstract methods.
		 */
		System.out.println("\n\n--- Abstraction ---");

		// Reptile reptile = new Reptile("Lizard", "Lacertilia", 1, 1, "Green",
		// "Domestic", 0, 0, true, true, true, true,
		// true);

		Snake snake = new Snake("Cobra", "Naja naja", 5, 10, "Black", "Wild", 0, 0, true, true, true, true, true,
				true, true);

		System.out.println("Snake Name: " + snake.name);
		System.out.println("Snake Species: " + snake.species);
		System.out.println("Snake Age: " + snake.age);

		/**
		 * This method is the abstract method declared in the `Reptile` class and
		 * implemented in the `Snake` class.
		 */
		snake.biteHuman();
	}
}
