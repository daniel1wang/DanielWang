import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 1");
        int roomNumber = 113;
        double eValue = 2.71828;
        String schoolClass = "Computer Science";
        System.out.println("This is room # " + roomNumber);
        System.out.println("e is close to " + eValue);
        System.out.println("I am learning a bit about " + schoolClass);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Problem 2");
        String schoolClass1 = "           AP Chemistry 12";
        String teacher1 = "  Mr. Slapsys";
        String schoolClass2 = "         AP Calculus 12 AB";
        String teacher2 = "     Ms. Reed";
        String schoolClass3 = "   Computer Programming 12";
        String teacher3 = "  Mr. Zaremba";
        String schoolClass4 = "                    Law 12";
        String teacher4 = "   Mr. Yetman";
        String schoolClass5 = "             AP Biology 12";
        String teacher5 = "   Mr. Wilkie";
        String schoolClass6 = "              AP Physics 2";
        String teacher6 = "     Mr. Tang";
        String schoolClass7 = "                English 12";
        String teacher7 = "       Ms. Au";
        String schoolClass8 = "                     Spare";
        String teacher8 = "          N/A";
        System.out.println("Your Schedule");
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1 |" + schoolClass1 + "|" + teacher1 + "|");
        System.out.println("| 2 |" + schoolClass2 + "|" + teacher2 + "|");
        System.out.println("| 3 |" + schoolClass3 + "|" + teacher3 + "|");
        System.out.println("| 4 |" + schoolClass4 + "|" + teacher4 + "|");
        System.out.println("| 5 |" + schoolClass5 + "|" + teacher5 + "|");
        System.out.println("| 6 |" + schoolClass6 + "|" + teacher6 + "|");
        System.out.println("| 7 |" + schoolClass7 + "|" + teacher7 + "|");
        System.out.println("| 8 |" + schoolClass8 + "|" + teacher8 + "|");
        System.out.println("+--------------------------------------------+");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Problem 3");
        System.out.println("Hot Dog Stand");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hotdogs do you want?");
        int hotdog = Integer.parseInt(scanner.nextLine());
        System.out.println("How many drinks do you want?");
        int drink = Integer.parseInt(scanner.nextLine());
        double total = (2 * drink + 5 * hotdog) * 1.12;
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("Your total is " + total + ". Pay and have a great day.");


    }
}