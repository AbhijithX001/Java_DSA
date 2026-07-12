package strings;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestWord(s));
        sc.close();
    }

    public static String longestWord(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] words = str.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
