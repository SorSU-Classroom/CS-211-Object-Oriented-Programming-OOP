package com.oop.Animals;

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
		System.out.println(this.getName() + " meows.");
	}
	
	public void makeSound(int repeat) {
		System.out.print(this.getName());
		for(int i = 0; i < repeat; i++) {
			System.out.print(" meow");
		}
		System.out.print(".");
	}
}
