package org.module2danielwang.problem1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PlanetType rocky = new PlanetType("Rocky");
        Planet earth = new Planet("Earth", rocky);
        System.out.println(earth);

        PlanetType gasGiant = new PlanetType("Gas Giant");
        Planet jupiter = new Planet("Jupiter", gasGiant);
        System.out.println(jupiter);

        PlanetType iceGiant = new PlanetType("Ice Giant");
        Planet neptune = new Planet("Neptune", iceGiant);
        System.out.println(neptune);
    }
}