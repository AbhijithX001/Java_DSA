package strings;

import java.util.Scanner;

public class SmallestVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        System.out.println(smallestVowel(s));
        sc.close();
    }

    // Returns the alphabetically smallest vowel present in the string.
    public static char smallestVowel(String str) {
        String vowels = "aeiou";
        char smallest = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                if (smallest == 0 || ch < smallest) {
                    smallest = ch;
                }
            }
        }
        if (smallest == 0) {
            System.out.println("No vowels found");
            return ' ';
        }
        return smallest;
    }
}
