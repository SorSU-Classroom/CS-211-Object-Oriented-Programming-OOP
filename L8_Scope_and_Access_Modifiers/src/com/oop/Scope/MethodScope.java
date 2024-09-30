package com.oop.Scope;

public class MethodScope {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x: " + x);

        display(y);
    }

    public static void display(int y) {
        // Variable x is not accessible here
        // System.out.println("x: " + x);

        // Variable y is accessible here
        System.out.println("y: " + y);

        // Variable z is not accessible here
        int z = 20;
        System.out.println("z: " + z);
    }
}