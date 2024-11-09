package com.company.main;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;

public class ShaperTester {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rect = new Rectangle(10);

        System.out.println(circle.calculateArea());
        System.out.println(rect.calculateArea());
    }
}
