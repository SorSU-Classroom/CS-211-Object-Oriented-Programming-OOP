package com.oop.Scope;

public class ClassScope {
    static int x = 10;
    int y = 20;

    public static void main(String[] args) {
        System.out.println("x: " + x);

        ClassScope obj = new ClassScope();
        System.out.println("y: " + obj.y);

        obj.display();
    }

    public void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}