package problem1;

public class Fibonacci {
    public static int fibonacciTerm(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n > 2) {
            return fibonacciTerm(n - 1) + fibonacciTerm(n - 2);
        } else {
            return 0;
        }
    }

    public static int getFibonacciTermSum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += fibonacciTerm(i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(-1);
        System.out.println(0);
        System.out.println(getFibonacciTermSum(1));
        System.out.println(getFibonacciTermSum(5));
        System.out.println(getFibonacciTermSum(7));
        System.out.println(getFibonacciTermSum(10));
        System.out.println(getFibonacciTermSum(13));
    }
}
