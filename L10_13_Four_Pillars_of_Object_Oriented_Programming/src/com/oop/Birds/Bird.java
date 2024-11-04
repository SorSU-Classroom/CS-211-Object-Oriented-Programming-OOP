package com.oop.Birds;

public class Bird {
    private double wingSpan;
    private String color;
    private double swimSpeed;
    private double flySpeed;

    public Bird(double wingSpan, String color) {
        this.wingSpan = wingSpan;
        this.color = color;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }
}
