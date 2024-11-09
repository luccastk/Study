package com.company.shapes;

public class Rectangle implements Shape{
    private double width;
    private double heigh;

    public Rectangle(double width, double heigh){
        this.width = width;
        this.heigh = heigh;
    }

    @Override
    public double calculateArea() {
        return this.width * this.heigh;
    }
}
