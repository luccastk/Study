package com.company.shapes;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }
}
