package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
        sc.close();
    }

    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return new StringBuilder(str).reverse().toString();
    }
}
