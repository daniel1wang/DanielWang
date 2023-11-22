package com.Daniel.problem3;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = PI * (radius * radius);
        return area;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + " and area = " + getArea();
    }
}
