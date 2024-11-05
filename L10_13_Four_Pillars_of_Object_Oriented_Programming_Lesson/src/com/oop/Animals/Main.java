package com.oop.Animals;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal("Horse", 70);

//		System.out.println("animal1 name: " + animal1.getName());
//		System.out.println("animal1 age: " + animal1.getAge());
		
		animal1.makeSound();
		
		Dog dog1 = new Dog("Blackie", 10, "Aspin");
		
		dog1.makeSound();
		
		Cat cat1 = new Cat("Siopao", 15, "White");
		
		cat1.makeSound(5);
	}
}
