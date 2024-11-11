package com.oop.AnimalKingdom;

public class Dog extends Animal {
	private String breed;
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	@Override
	public void makeSound() {
		System.out.println(this.getName() + " barks.");
	}
}
