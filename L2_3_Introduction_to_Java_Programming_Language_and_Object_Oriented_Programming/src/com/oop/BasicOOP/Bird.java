/**
 * Polymorphism in Object Oriented Programming
 * 
 * Polymorphism is the ability of an object to take on many forms.
 * The most common use of polymorphism in OOP occurs when a parent class
 * reference is used to refer to a child class object.
 * 
 * Polymorphism allows methods to do different things based on the object
 * that they are acting upon. It is a powerful feature of OOP that allows
 * code reusability and flexibility.
 * 
 * References:
 * @see https://www.tutorialspoint.com/java/java_polymorphism.htm
 * @see https://www.geeksforgeeks.org/polymorphism-in-java/
 * @see https://www.w3schools.com/java/java_polymorphism.asp
 * @see https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
 */
package com.oop.BasicOOP;

/**
 * The `Bird` class is a child class of the `Animal` class. It inherits the
 * properties and methods of the `Animal` class.
 * 
 * @see com.oop.BasicOOP.Animal
 */
public class Bird extends Animal {
	/**
	 * Member variables or attributes of the `Bird` class.
	 */
	private int wings;
	private boolean hasFeathers;
	private boolean canFly;
	private boolean canLayEggs;

	/**
	 * Constructor for the `Bird` class.
	 * 
	 * @param name        the name of the bird
	 * @param species     the species of the bird
	 * @param age         the age of the bird
	 * @param weight      the weight of the bird
	 * @param color       the color of the bird
	 * @param habitat     the habitat of the bird
	 * @param x           the x-coordinate of the bird
	 * @param y           the y-coordinate of the bird
	 * @param wings       the number of wings of the bird
	 * @param hasFeathers whether the bird has feathers
	 * @param canFly      whether the bird can fly
	 * @param canLayEggs  whether the bird can lay eggs
	 */
	Bird(String name, String species, int age, int weight, String color, String habitat, int x, int y, int wings,
			boolean hasFeathers, boolean canFly,
			boolean canLayEggs) {
		super(name, species, age, weight, color, habitat, x, y);
		this.wings = wings;
		this.hasFeathers = hasFeathers;
		this.canFly = canFly;
		this.canLayEggs = canLayEggs;
	}

	/**
	 * Getter and setter methods for the member variables of the `Bird` class.
	 */

	/**
	 * Getter method for the `wings` member variable.
	 * 
	 * @return the number of wings of the bird
	 */
	public int getWings() {
		return wings;
	}

	/**
	 * Setter method for the `wings` member variable.
	 * 
	 * @param wings the number of wings of the bird
	 */
	public void setWings(int wings) {
		this.wings = wings;
	}

	/**
	 * Getter method for the `hasFeathers` member variable.
	 * 
	 * @return whether the bird has feathers
	 */
	public boolean isHasFeathers() {
		return hasFeathers;
	}

	/**
	 * Setter method for the `hasFeathers` member variable.
	 * 
	 * @param hasFeathers whether the bird has feathers
	 */
	public void setHasFeathers(boolean hasFeathers) {
		this.hasFeathers = hasFeathers;
	}

	/**
	 * Getter method for the `canFly` member variable.
	 * 
	 * @return whether the bird can fly
	 */
	public boolean canFly() {
		return canFly;
	}

	/**
	 * Setter method for the `canFly` member variable.
	 * 
	 * @param canFly whether the bird can fly
	 */
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	/**
	 * Getter method for the `canLayEggs` member variable.
	 * 
	 * @return whether the bird can lay eggs
	 */
	public boolean canLayEggs() {
		return canLayEggs;
	}

	/**
	 * Setter method for the `canLayEggs` member variable.
	 * 
	 * @param canLayEggs whether the bird can lay eggs
	 */
	public void setCanLayEggs(boolean canLayEggs) {
		this.canLayEggs = canLayEggs;
	}

	/**
	 * This method makes the bird fly.
	 * 
	 * The bird can only fly if it has feathers and can fly.
	 */
	public void fly() {
		if (canFly && hasFeathers) {
			System.out.println(name + " is flying.");
		} else {
			System.out.println(name + " cannot fly.");
		}
	}

	/**
	 * This method makes the bird lay eggs.
	 * 
	 * The bird can only lay eggs if it is at least 1 year old and can lay eggs.
	 */
	public void layEggs() {
		if (this.age >= 1 && canLayEggs) {
			System.out.println(name + " is laying eggs.");
		} else {
			System.out.println(name + " is too young to lay eggs.");
		}
	}

	/**
	 * This method overrides the `makeSound` method of the `Animal` class.
	 * 
	 * It makes the bird chirp.
	 */
	@Override
	void makeSound() {
		System.out.println("The bird chirps.");
	}
}
