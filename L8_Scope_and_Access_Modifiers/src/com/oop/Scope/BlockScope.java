package com.oop.Scope;

//BlockScope.java
public class BlockScope {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        // Variable x is accessible here
        System.out.println("x: " + x);

        // Variable y is not accessible here
        // System.out.println("y: " + y);
    }
}