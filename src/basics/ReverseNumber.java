package basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseNumber(num));
        sc.close();
    }

    public static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
    }
}
