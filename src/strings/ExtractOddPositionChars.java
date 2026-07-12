package strings;

import java.util.Scanner;

public class ExtractOddPositionChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(extractOddPositionChars(s));
        sc.close();
    }

    // Extracts characters at odd positions (1-based: index 1, 3, 5...)
    public static String extractOddPositionChars(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
