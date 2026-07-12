package tcsipa.question1;

import java.util.Scanner;

public class CountConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countConsonants(s));
        sc.close();
    }

    public static int countConsonants(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        str = str.toLowerCase();
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }
}
