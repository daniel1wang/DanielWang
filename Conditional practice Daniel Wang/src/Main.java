import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 2");
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age <= 17) {
            System.out.println("You can drive but not vote.");
        } else if (age <= 24) {
            System.out.println("You can vote but not rent a car.");
        }else {
            System.out.println("You can do pretty much anything.");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        ///weight assignment
        System.out.println("Assignment 3");
        System.out.print("Please enter your current Earth weight to the nearest kilogram: ");
        Scanner scanner1 = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        System.out.println("I can calculate your weight for the planets listed below:");
        System.out.println("1. Venus");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        System.out.println("5. Uranus");
        System.out.println("6. Neptune");
        System.out.print("Please enter the corresponding number for the planet you would like to know your weight for: ");
        Scanner scanner2 = new Scanner(System.in);
        int planet = Integer.parseInt(scanner.nextLine());
        if (planet == 1) {
            System.out.println("Your weight on Venus would be " + (weight * 0.78) + " kg");
        } else if (planet == 2) {
            System.out.println("Your weight on Mars would be " + (weight * 0.39) + " kg");
        } else if (planet == 3) {
            System.out.println("Your weight on Jupiter would be " + (weight * 2.65) + " kg");
        } else if (planet == 4) {
            System.out.println("Your weight on Saturn would be " + (weight * 1.17) + " kg");
        } else if (planet == 5) {
            System.out.println("Your weight on Uranus would be " + (weight * 1.05) + " kg");
        }else {
            System.out.println("Your weight on Neptune would be " + (weight * 1.23) + " kg");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        ////quiz assignment
        System.out.println("A Little Quiz");
        System.out.println("Are you ready for a quiz? Press y/n.");
        Scanner scanner4 = new Scanner(System.in);
        String yn  = scanner.nextLine();
        if (yn.equals("y")) {
            System.out.println("Alrighty here we go!");
            System.out.println("Q1) Evaluate lim x->0 (sinx/x):");
            System.out.println("a) 1");
            System.out.println("b) sin(2)");
            System.out.println("c) 0");
            System.out.println("d) DNE");
            System.out.println(" ");
            System.out.println("What is your answer, a, b, c, or d?");
            System.out.print(">");
            Scanner scanner5 = new Scanner(System.in);
            String q1 = scanner.nextLine();
            int score;
            if (q1.equals("a")) {
                System.out.println("That's right!");
                score = 1;
            } else {
                System.out.println("Sorry, the answer was a.");
                score = 0;
            }
            System.out.println(" ");
            System.out.println("Q2) Is the limit of (sinx/x) as x approaches 0 undefined?");
            System.out.println("a) yes");
            System.out.println("b) no");
            System.out.println(" ");
            System.out.println("What is your answer, a or b?");
            System.out.print(">");
            Scanner scanner6 = new Scanner(System.in);
            String q2 = scanner.nextLine();
            if (q2.equals("b")) {
                System.out.println("That's right!");
                score++;
            } else {
                System.out.println("Sorry, the answer was b.");
            }
            System.out.println(" ");
            System.out.println("Q3) What is the value of y for the function f(x) = sinx/x?");
            System.out.println("a) 1");
            System.out.println("b) 0");
            System.out.println("c) -1");
            System.out.println("d) DNE");
            System.out.println(" ");
            System.out.println("What is your answer, a, b, c or d?");
            System.out.print(">");
            Scanner scanner7 = new Scanner(System.in);
            String q3 = scanner.nextLine();
            if (q3.equals("d")) {
                System.out.println("That's right!");
                score++;
            } else {
                System.out.println("Sorry, the answer was d.");
            }
            System.out.println(" ");
            System.out.println("Score: " + score + "/3");
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("No prob, maybe next time!");
        }






    }
}