package com.Daniel.problem4;

public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    double angle = 360;

    public Triangle(double width, double height, Colour colour) {
        super(width, height, colour);
    }

    public Triangle(double side1, double side2, double side3, Colour colour){
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.width = side1;
        super.height = heronsHeight();
    }
    //Methods

    /**
     * Uses Herons formula to calculate height of triangle using three sides
     * @return height of triangle
     */
    private double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double height = ((triangleArea/0.5 ) / side1);
        return height;
    }

    /**
     * Overrides getArea to be for area of triangle, where the formula is 1/2 * base * height
     * @return area of triangle
     */
    @Override
    public double getArea(){
        double area = (width * height) / 2;
        return area;
    }

    /**
     * Lists the fields of the triangle as represented by a string
     * @return string for fields of the triangle
     */
    @Override
    public String toString(){
        return "Triangle with height = " + height + ", base = " + width + ", and area = " + getArea();
    }

    /**
     * Rotates shape clockwise 90 degrees
     */
    @Override
    public void rotate90() {
        rotate(90);
    }

    /**
     * Rotates shape clockwise 180 degrees
     */
    @Override
    public void rotate180() {
        rotate(180);

    }

    /**
     * Rotates shape clockwise by any specified degree
     * @param degree - number of degrees shape rotates
     */
    @Override
    public void rotate(double degree) {
        angle += degree;
    }
}

