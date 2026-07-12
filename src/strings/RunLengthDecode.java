package strings;

import java.util.Scanner;

public class RunLengthDecode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(decode(s));
        sc.close();
    }

    // Decodes "a3b2c1" -> "aaabbc"
    public static String decode(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            char letter = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
