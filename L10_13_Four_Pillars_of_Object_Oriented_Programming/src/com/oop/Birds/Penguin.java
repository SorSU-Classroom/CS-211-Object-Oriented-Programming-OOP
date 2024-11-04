package com.oop.Birds;

public class Penguin extends Bird implements SwimInterface {
    public Penguin(double wingSpan, String color, double swimSpeed) {
        super(wingSpan, color);
        setSwimSpeed(swimSpeed);
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims at speed: " + getSwimSpeed());
    }
}
