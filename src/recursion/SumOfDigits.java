package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        sc.close();
    }

    // Recursive sum of digits. Example: 123 → 1+2+3 = 6.
    public static int sumOfDigits(int n) {
        if (n < 0) n = -n;     // handle negative numbers
        if (n < 10) return n;   // single digit — base case
        return (n % 10) + sumOfDigits(n / 10);
    }
}
