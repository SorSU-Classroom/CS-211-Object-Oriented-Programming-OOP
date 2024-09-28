package com.oop.Methods;

import com.oop.Person;

public class SampleStatic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("No. of Persons: " + Person.getCountPersons());
		
		Person p1 = new Person("John", 7);
		Person p2 = new Person("Alice", 10);
		
		System.out.println("No. of Persons: " + Person.getCountPersons());
	}
}
