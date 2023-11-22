package com.Daniel.problem4;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;


    public Circle(double radius, Colour colour) {
        super(colour);
        this.radius = radius;
    }
    //Methods

    /**
     * Gets area of circle using formula PI * radius * radius
     * @return
     */
    @Override
    public double getArea() {
        double area = PI * (radius * radius);
        return area;
    }

    /**
     * Lists fields of the circle as represented by a string
     * @return string for fields of the circle
     */
    @Override
    public String toString() {
        return "Circle with radius = " + radius + " and area = " + getArea();
    }
}
