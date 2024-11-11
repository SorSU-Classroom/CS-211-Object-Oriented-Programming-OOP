package com.oop.BankSystem;

public class Main {
	public static void main(String[] args) {
		Bank bank1 = new Bank("PNB", 1);
		
		System.out.println(bank1.getName());
		
		bank1.setName("BDO");
		
		System.out.println(bank1.getName());
	}
}
