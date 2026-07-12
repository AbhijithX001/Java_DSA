package recursion;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }

    // Recursive Fibonacci — O(2^n) time. Good for understanding recursion.
    // See 01_Basics/FibonacciSeries.java for the efficient iterative version.
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
