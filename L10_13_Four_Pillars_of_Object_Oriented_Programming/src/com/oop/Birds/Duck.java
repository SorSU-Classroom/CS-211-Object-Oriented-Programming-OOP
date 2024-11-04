package com.oop.Birds;

public class Duck extends Bird implements SwimInterface, FlyInterface {
    public Duck(double wingSpan, String color, double swimSpeed, double flySpeed) {
        super(wingSpan, color);
        setSwimSpeed(swimSpeed);
        setFlySpeed(flySpeed);
    }

    @Override
    public void swim() {
        System.out.println("Duck swims at speed: " + getSwimSpeed());
    }

    @Override
    public void fly() {
        System.out.println("Duck flies at speed: " + getFlySpeed());
    }
}
