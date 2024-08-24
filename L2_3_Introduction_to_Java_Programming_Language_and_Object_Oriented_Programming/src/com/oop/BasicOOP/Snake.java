/**
 * Inheriting an Abstract Class with Abstract Method
 * 
 * The `Reptile` class is an abstract class that has an abstract method called
 * `biteHuman`. The `Snake` class is a child class of the `Reptile` class. It
 * inherits the properties and methods of the `Reptile` class.
 * 
 * @see com.oop.BasicOOP.Reptile
 */
package com.oop.BasicOOP;

/**
 * The `Snake` class is a child class of the `Reptile` class. It inherits the
 * properties and methods of the `Reptile` class.
 * 
 * @see com.oop.BasicOOP.Reptile
 */
public class Snake extends Reptile {
	/**
	 * Member variables or attributes of the `Snake` class.
	 */
	private boolean isVenomous;
	private boolean canSwim;

	/**
	 * Constructor for the `Snake` class.
	 * 
	 * @param name              the name of the snake
	 * @param species           the species of the snake
	 * @param age               the age of the snake
	 * @param weight            the weight of the snake
	 * @param color             the color of the snake
	 * @param habitat           the habitat of the snake
	 * @param x                 the x-coordinate of the snake
	 * @param y                 the y-coordinate of the snake
	 * @param hasScales         whether the snake has scales
	 * @param hasTail           whether the snake has a tail
	 * @param isColdBlooded     whether the snake is cold-blooded
	 * @param canRegenerateTail whether the snake can regenerate its tail
	 * @param canLayEggs        whether the snake can lay eggs
	 * @param isVenomous        whether the snake is venomous
	 * @param canSwim           whether the snake can swim
	 */
	public Snake(String name, String species, int age, int weight, String color, String habitat, int x, int y,
			boolean hasScales, boolean hasTail, boolean isColdBlooded, boolean canRegenerateTail, boolean canLayEggs,
			boolean isVenomous, boolean canSwim) {
		super(name, species, age, weight, color, habitat, x, y, hasScales, hasTail, isColdBlooded, canRegenerateTail,
				canLayEggs);
		this.isVenomous = isVenomous;
		this.canSwim = canSwim;
	}

	/**
	 * Method that simulates the snake biting a human.
	 * 
	 * This method is the method implementation of the abstract method `biteHuman`
	 * declared in the `Reptile` class.
	 * 
	 * References:
	 * 
	 * @see https://www.w3schools.com/java/java_abstract.asp
	 * @see https://www.geeksforgeeks.org/abstract-classes-in-java/
	 * @see https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
	 * @see https://www.javatpoint.com/abstract-class-in-java
	 */
	public void biteHuman() {
		System.out.println("The snake bites the human...");
		if (isVenomous) {
			System.out.println("The human is poisoned!");
		} else {
			System.out.println("The human is not poisoned.");
		}
	}

	/**
	 * Getter and setter methods for the member variables of the `Snake` class.
	 */
	public boolean isVenomous() {
		return isVenomous;
	}

	/**
	 * Setter method for the `isVenomous` member variable.
	 * 
	 * @param isVenomous whether the snake is venomous
	 */
	public void setVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}

	/**
	 * Getter method for the `canSwim` member variable.
	 * 
	 * @return whether the snake can swim
	 */
	public boolean canSwim() {
		return canSwim;
	}

	/**
	 * Setter method for the `canSwim` member variable.
	 * 
	 * @param canSwim whether the snake can swim
	 */
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
}
