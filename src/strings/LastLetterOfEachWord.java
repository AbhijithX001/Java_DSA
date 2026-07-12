package strings;

import java.util.Scanner;

public class LastLetterOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastLetterOfEachWord(s));
        sc.close();
    }

    // Returns the last alphabetic character from each word
    public static String lastLetterOfEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.isEmpty()) continue;
            for (int j = word.length() - 1; j >= 0; j--) {
                char ch = word.charAt(j);
                if (Character.isLetter(ch)) {
                    result.append(ch);
                    break;
                }
            }
        }
        return result.toString();
    }
}
