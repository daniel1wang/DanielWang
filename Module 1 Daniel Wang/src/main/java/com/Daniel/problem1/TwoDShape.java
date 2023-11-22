package com.Daniel.problem1;

public class TwoDShape {
    double width;
    double height;
    public double getArea;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }



}
