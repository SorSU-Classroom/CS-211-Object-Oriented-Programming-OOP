package com.oop.Birds;

public class Eagle extends Bird implements FlyInterface {
    public Eagle(double wingSpan, String color, double flySpeed) {
        super(wingSpan, color);
        setFlySpeed(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies at speed: " + getFlySpeed());
    }
}
