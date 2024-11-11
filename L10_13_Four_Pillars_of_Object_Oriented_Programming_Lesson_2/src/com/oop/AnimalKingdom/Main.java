package com.oop.AnimalKingdom;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Megatron", 21);
		
		animal1.makeSound();
		
		Dog dog1 = new Dog("Brownie", 8, "Aspin");
		
		dog1.makeSound();
		
		Cat cat1 = new Cat("Siopao", 3, "Green");
		
		cat1.makeSound(4);
	}
}
