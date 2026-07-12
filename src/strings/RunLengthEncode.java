package strings;

import java.util.Scanner;

public class RunLengthEncode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(encode(s));
        sc.close();
    }

    // Encodes "aaabbc" -> "a3b2c1"
    public static String encode(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        // Append last character group
        result.append(str.charAt(str.length() - 1));
        result.append(count);
        return result.toString();
    }
}
