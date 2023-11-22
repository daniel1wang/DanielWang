package com.Daniel.problem1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    TwoDShape Square = new TwoDShape(10.0, 20.0);
    Square.getArea();
    System.out.println(Square.getArea);
    Square.getArea();
    Square.setHeight(50);
    Square.getArea();
    System.out.println(Square.getArea);

    Triangle triangle = new Triangle(24, 56);
    triangle.getArea();
    System.out.println(triangle.getArea);
    Triangle right = new Triangle(3,4,5);
    right.getArea();
    System.out.println(right.getArea);






    }
}