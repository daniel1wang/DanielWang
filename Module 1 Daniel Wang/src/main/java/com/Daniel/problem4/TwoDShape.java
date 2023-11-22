package com.Daniel.problem4;

public abstract class TwoDShape {

    //Fields
    double width;
    double height;
    Colour colour;

    //Constructor
    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(Colour colour){
        this.colour = colour;
    }
    //Methods
    /**
     * This abstract method calculates the area of the shape with the applicable formula
     * An abstract method is necessary because the shapes have different formulas for calculating area
     * @return the area
     */
    public abstract double getArea();

    /**
     * Gets width for shape
     * @return width for shape
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets width for shape
     * @param width - new width for shape
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets height for shape
     * @return height for shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets height of shape
     * @param height - new height of shape
     */
    public void setHeight(double height){
        this.height = height;
    }

}
