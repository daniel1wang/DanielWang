
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Array Practice Problems:");
        System.out.println(" ");
        System.out.println("Problem 1:");
        int[] array = new int[20];
        int one = 0;
        for (int i = 0; i < array.length; i++) {
            int random = (int)(Math.random() * 6) + 1;
            array[i] = random;
            if (random == 1) {
                one++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Ones randomly printed in this array: " + one);
        System.out.println(" ");
        ///problem 2
        System.out.println("Problem 2:");
        int[] array2 = new int[10];
        double avg;
        double sum = 0.0;
        for (int i = 0; i < array2.length; i++) {
            int random2 = (int) (Math.random() * 100) + 1;
            array2[i] = random2;
            sum = sum + random2;
        }
        System.out.println(Arrays.toString(array2));
        avg = sum/array2.length;
        System.out.println("The average of this array is approximately: " + avg);
        System.out.println(" ");
        ///problem 3
        System.out.println("Problem 3:");
        int temp = array2[0];
        array2[0] = array2[9];
        array2[9] = temp;
        System.out.println(Arrays.toString(array2));
        System.out.println("The first and the last number have been swapped.");
        System.out.println(" ");
        ///problem 4
        System.out.println("Problem 4:");
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array2[9-i];
        }

        System.out.println(Arrays.toString(array3));
        System.out.println("The order of the array has been reversed.");



    }
}