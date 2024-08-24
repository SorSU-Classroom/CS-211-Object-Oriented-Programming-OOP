/**
 * Abstraction in Object Oriented Programming
 * 
 * Abstraction is a concept of object-oriented programming that
 * allows hiding the implementation details and showing only the
 * functionality to the user. It helps to reduce programming complexity
 * and effort.
 * 
 * An abstract class is a class that cannot be instantiated. It is
 * used to provide a common interface for all the classes that inherit
 * from it. Abstract classes can have abstract methods that are declared
 * but not implemented. These methods must be implemented by the child
 * classes that inherit from the abstract class.
 * 
 * References:
 * @see https://www.tutorialspoint.com/java/java_abstraction.htm
 * @see https://www.geeksforgeeks.org/abstraction-in-java-2/
 * @see https://www.w3schools.com/java/java_abstract.asp
 * @see https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
 */
package com.oop.BasicOOP;

/**
 * The `Reptile` class is an abstract class that extends the `Animal` class.
 * It inherits the properties and methods of the `Animal` class and adds
 * additional
 * properties and methods specific to reptiles.
 * 
 * @see com.oop.BasicOOP.Animal
 */
public abstract class Reptile extends Animal {
	/**
	 * Member variables or attributes of the `Reptile` class.
	 */
	private boolean hasScales;
	private boolean hasTail;
	private boolean isColdBlooded;
	private boolean canRegenerateTail;
	private boolean canLayEggs;

	/**
	 * Constructor for the `Reptile` class.
	 * 
	 * @param name              the name of the reptile
	 * @param species           the species of the reptile
	 * @param age               the age of the reptile
	 * @param weight            the weight of the reptile
	 * @param color             the color of the reptile
	 * @param habitat           the habitat of the reptile
	 * @param x                 the x-coordinate of the reptile
	 * @param y                 the y-coordinate of the reptile
	 * @param hasScales         whether the reptile has scales
	 * @param hasTail           whether the reptile has a tail
	 * @param isColdBlooded     whether the reptile is cold-blooded
	 * @param canRegenerateTail whether the reptile can regenerate its tail
	 * @param canLayEggs        whether the reptile can lay eggs
	 */
	Reptile(String name, String species, int age, int weight, String color, String habitat, int x, int y,
			boolean hasScales, boolean hasTail, boolean isColdBlooded, boolean canRegenerateTail, boolean canLayEggs) {
		super(name, species, age, weight, color, habitat, x, y);
		this.hasScales = hasScales;
		this.hasTail = hasTail;
		this.isColdBlooded = isColdBlooded;
		this.canRegenerateTail = canRegenerateTail;
		this.canLayEggs = canLayEggs;
	}

	/**
	 * Abstract methods that must be implemented by the child classes.
	 * 
	 * References:
	 * 
	 * @see https://www.w3schools.com/java/java_abstract.asp
	 * @see https://www.geeksforgeeks.org/abstract-classes-in-java/
	 * @see https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
	 * @see https://www.javatpoint.com/abstract-class-in-java
	 */
	public abstract void move(int x, int y);

	/**
	 * Getter and setter methods for the member variables of the `Reptile` class.
	 */

	/**
	 * Getter method for the `hasScales` member variable.
	 * 
	 * @return whether the reptile has scales
	 */
	public boolean hasScales() {
		return hasScales;
	}

	/**
	 * Setter method for the `hasScales` member variable.
	 */
	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}

	/**
	 * Getter method for the `isColdBlooded` member variable.
	 * 
	 * @return whether the reptile is cold-blooded
	 */
	public boolean isColdBlooded() {
		return isColdBlooded;
	}

	/**
	 * Setter method for the `isColdBlooded` member variable.
	 */
	public void setColdBlooded(boolean isColdBlooded) {
		this.isColdBlooded = isColdBlooded;
	}

	/**
	 * Getter method for the `canRegenerateTail` member variable.
	 * 
	 * @return whether the reptile can regenerate its tail
	 */
	public boolean canRegenerateTail() {
		return canRegenerateTail;
	}

	/**
	 * Setter method for the `canRegenerateTail` member variable.
	 * 
	 * @param canRegenerateTail whether the reptile can regenerate its tail
	 */
	public void setCanRegenerateTail(boolean canRegenerateTail) {
		this.canRegenerateTail = canRegenerateTail;
	}

	/**
	 * Getter method for the `canLayEggs` member variable.
	 * 
	 * @return whether the reptile can lay eggs
	 */
	public boolean canLayEggs() {
		return canLayEggs;
	}

	/**
	 * Setter method for the `canLayEggs` member variable.
	 * 
	 * @param canLayEggs whether the reptile can lay eggs
	 */
	public void setCanLayEggs(boolean canLayEggs) {
		this.canLayEggs = canLayEggs;
	}

	/**
	 * Method that makes the reptile shed its skin.
	 * 
	 * If the reptile has scales, it sheds its skin; otherwise, it does not
	 */
	public void shedSkin() {
		if (hasScales) {
			System.out.println(name + " is shedding its skin.");
		} else {
			System.out.println(name + " does not have scales and cannot shed its skin.");
		}
	}

	/**
	 * Method that makes the reptile lay eggs.
	 * 
	 * If the reptile can lay eggs, it lays eggs; otherwise, it does not
	 */
	public void layEggs() {
		if (canLayEggs) {
			System.out.println(name + " is laying eggs.");
		} else {
			System.out.println(name + " cannot lay eggs.");
		}
	}

	/**
	 * Method that makes the reptile regenerate its tail.
	 * 
	 * If the reptile can regenerate its tail, it regenerates its tail;
	 * otherwise, it does not
	 */
	public void regenerateTail() {
		if (canRegenerateTail && hasTail) {
			System.out.println(name + " is regenerating its tail.");
		} else {
			System.out.println(name + " cannot regenerate its tail.");
		}
	}
}
