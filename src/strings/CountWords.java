package strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countWords(s));
        sc.close();
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        // split("\\s+") handles multiple spaces between words
        return str.trim().split("\\s+").length;
    }
}
