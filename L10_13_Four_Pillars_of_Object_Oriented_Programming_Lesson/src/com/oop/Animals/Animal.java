package com.oop.Animals;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println(this.name + " makes a sound.");
	}
}
