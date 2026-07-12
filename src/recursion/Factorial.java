package recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }

    // Recursive factorial. Base case: 0! = 1, 1! = 1.
    public static long factorial(int n) {
        if (n < 0) return -1;   // undefined for negative
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
