package tcsipa.question1;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseEachWord(str));
        sc.close();
    }

    public static String reverseEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] words = str.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
