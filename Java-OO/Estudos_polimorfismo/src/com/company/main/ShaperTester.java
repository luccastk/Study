package com.company.main;

import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShaperTester {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10));
        shapes.add(new Rectangle(10, 5));

        for (Shape shape : shapes) {
            System.out.println("Area " + shape.calculateArea());
        }
    }
}

