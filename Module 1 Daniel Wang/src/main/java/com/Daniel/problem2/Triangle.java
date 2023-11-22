package com.Daniel.problem2;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        super.width = side1;
        super.height = heronsHeight();
    }

    private double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double triangleArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        double height = triangleArea / side1;
        return height;
    }

    @Override
    public double getArea(){
        double area = (width * height) / 2;
        return area;
    }

    @Override
    public String toString(){
        return "Triangle with height = " + heronsHeight() + ", base = " + side1 + ", and area =" + getArea();
    }

}

