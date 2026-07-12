package strings;

import java.util.Scanner;

public class LowerAndUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        sc.close();
    }
}
