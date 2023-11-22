package com.Daniel.problem4;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         ArrayList<TwoDShape> shape = new ArrayList<>();
         shape.add(new Triangle(3,4,5, Colour.GREEN));
         shape.add(new Triangle (5, 6, Colour.BLUE));
         shape.add(new Circle(1, Colour.RED));
         shape.add(new Circle (2, Colour.NONE));

         for (TwoDShape s : shape){
             System.out.println("Area = " + s.getArea());
             System.out.println(s);
         }





    }
}
