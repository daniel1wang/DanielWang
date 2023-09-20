import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Game Loop Assignment:");
        System.out.println("Lets play rock, paper, scissors!");
        System.out.println("Press 'r' for rock, 'p' for paper, and 's' for scissors. Press 'x' when you want to stop playing.");
        int win = 0;
        int lose = 0;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("x")) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Wins: " + win + " Losses: " + lose);
            System.out.println("What is your pick?");
            System.out.print(">");
            input = scanner.nextLine();
            int number = (int) (Math.random() * 3) + 1;
            if (input.equals("r") && number == 1) {
                System.out.println("You chose rock! The computer chose rock!");
                System.out.println("Draw!");
            } else if (input.equals("r") && number == 2){
                System.out.println("You chose rock! The computer chose scissors!");
                System.out.println("You win!");
                win++;
            }else if (input.equals("r") && number == 3){
                System.out.println("You chose rock! The computer chose paper!");
                System.out.println("You lose!");
                lose++;
            }
            if (input.equals("p") && number == 1) {
                System.out.println("You chose paper! The computer chose rock!");
                System.out.println("You win!");
                win++;
            } else if (input.equals("p") && number == 2){
                System.out.println("You chose paper! The computer chose scissors!");
                System.out.println("You lose!");
                lose++;
            }else if (input.equals("p") && number == 3){
                System.out.println("You chose paper! The computer chose paper!");
                System.out.println("Draw!");
            }
            if (input.equals("s") && number == 1) {
                System.out.println("You chose scissors! The computer chose rock!");
                System.out.println("You lose!");
                lose++;
            } else if (input.equals("s") && number == 2){
                System.out.println("You chose scissors! The computer chose scissors!");
                System.out.println("Draw!");
            }else if (input.equals("s") && number == 3){
                System.out.println("You chose scissors! The computer chose paper!");
                System.out.println("You win!");
                win++;

            }

        }

        }

    }