package com.oop.AnimalKingdom;

public class Cat extends Animal {
	private String color;
	
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println(this.getName() + " meow meow meow meow.");
	}
	
	public void makeSound(int repeat) {
		for(int i = 0; i < repeat; i++) {
			this.makeSound();
		}
	}
}
