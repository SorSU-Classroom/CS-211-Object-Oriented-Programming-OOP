package com.oop.Methods;

public class DeclaringAndCallingMethods2 {
    public static void main(String[] args) {
        // Creating an object of the class
        DeclaringAndCallingMethods2 obj = new DeclaringAndCallingMethods2();

        // Calling a method
        obj.printMessage();
    }

    // Declaring a method
    public void printMessage() {
        System.out.println("Hello World!");
    }
}
