package com.company.shapes;

public class Rectangle implements Shape{
    private double rect;

    public Rectangle(double rect){
        this.rect = rect;
    }

    @Override
    public double calculateArea() {
        return this.rect * this.rect;
    }
}
