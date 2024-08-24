/**
 * Basic creation of a class in OOP
 * 
 * In Object Oriented Programming (OOP), a class is a blueprint for creating
 * objects (a particular data structure), providing initial values for state
 * (member variables or attributes), and implementations of behavior (member
 * functions or methods).
 * 
 * A class is a user-defined data type that we can use in our program, and it
 * works as an object constructor, or a "blueprint" for creating objects.
 * 
 * References:
 * @see https://www.w3schools.com/java/java_classes.asp
 * @see https://www.w3schools.com/java/java_class_attributes.asp
 * @see https://www.w3schools.com/java/java_class_methods.asp
 */

/**
 * The line `package com.oop.BasicOOP.Animal;` in Java is a package declaration statement. It specifies
 * that the `Animal` class belongs to the package `com.oop.BasicOOP.Animal`.
 */
package com.oop.BasicOOP;

/**
 * The `Animal` class is a blueprint for creating objects of type `Animal`. It
 * provides initial values for state (member variables or attributes), and
 * implementations of behavior (member functions or methods).
 * 
 * The syntax for creating a class in Java is:
 * 
 * <pre>
 * public class ClassName {
 *     // member variables or attributes
 *     // member functions or methods
 * }
 * </pre>
 * 
 * References:
 * 
 * @see https://www.w3schools.com/java/java_classes.asp
 */
public class Animal {
    /**
     * Member variables or attributes of the `Animal` class.
     * 
     * References:
     * 
     * @see https://www.w3schools.com/java/java_class_attributes.asp
     */
    String name;
    String species;
    int age;
    int weight;
    String color;
    String habitat;

    int x;
    int y;

    /**
     * Constructor for the `Animal` class.
     * 
     * A constructor is a special method that is used to initialize objects. It is
     * called when an object of a class is created. It has the same name as the
     * class and does not have a return type.
     * 
     * References:
     * 
     * @see https://www.w3schools.com/java/java_constructors.asp
     * 
     * @param name    The name of the animal.
     * @param species The species of the animal.
     * @param age     The age of the animal.
     * @param weight  The weight of the animal.
     * @param color   The color of the animal.
     * @param habitat The habitat of the animal.
     * @param x       The x-coordinate of the animal.
     * @param y       The y-coordinate of the animal.
     */
    public Animal(String name, String species, int age, int weight, String color, String habitat, int x, int y) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.habitat = habitat;
        this.x = x;
        this.y = y;
    }

    /**
     * This method makes the animal produce a sound.
     */
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    /**
     * This method makes the animal move to a new position.
     * 
     * @param x The new x-coordinate of the animal.
     * @param y The new y-coordinate of the animal.
     */
    void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("The animal moves to (" + x + ", " + y + ").");
    }

    /**
     * This method makes the animal eat food.
     */
    void eat() {
        System.out.println("The animal eats food.");
    }

    /**
     * This method makes the animal sleep.
     */
    void sleep() {
        System.out.println("The animal sleeps.");
    }
}
