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
	 * The `move` method of the `Snake` class.
	 * 
	 * This method overrides the `move` method of the `Reptile` class.
	 * 
	 * @param x the x-coordinate of the snake
	 * @param y the y-coordinate of the snake
	 */
	@Override
	public void move(int x, int y) {
		System.out.println("The snake is slithering to (" + x + ", " + y + ")");
		this.x = x;
		this.y = y;
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
