package strings;

import java.util.Scanner;

public class CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countUppercaseLetters(s));
        sc.close();
    }

    public static int countUppercaseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
