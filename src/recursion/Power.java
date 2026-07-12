package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base, exp));
        sc.close();
    }

    // Compute base^exp using recursion. O(n) time.
    public static long power(int base, int exp) {
        if (exp == 0) return 1;
        if (exp == 1) return base;
        return base * power(base, exp - 1);
    }
}
